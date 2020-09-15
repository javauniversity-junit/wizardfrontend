#!/bin/sh
# This is a comment! password changeit
echo Starting	# This is a comment, too!
#$ sudo chmod a+rx keystore
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


echo remote to server
#copy file
sshpass -p Superman123# ssh wizard@97.74.232.85 "cp /home/wizard/keystore /opt/tomcat/conf/keystore;echo copiedfile; exit"

echo start copying new key store
echo copy keystore
END_SCRIPT
exit 0

