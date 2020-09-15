#!/bin/sh
# This is a comment!
echo Starting	# This is a comment, too!
#$ sudo chmod a+rx deploykeystore.sh
#$ ./deploykeystore.sh
cd /Users/andrewhinton/Documents/GitHub/wizardfrontend
echo Upload file	# This is a comment, too!
cd /Users/andrewhinton/Documents/GitHub/wizardfrontend/
HOST='97.74.232.85'
USER='wizard'
PASSWD='Superman123#'
FILE='keystore'
REMOTEPATH='.'


ftp -nd $HOST <<END_SCRIPT
quote USER $USER
quote PASS $PASSWD
cd $REMOTEPATH
binary
put $FILE
quit

sshpass -p Superman123# ssh wizard@97.74.232.85 "cp /opt/tomcat/conf/server.xml .;echo copiedfile; exit"



