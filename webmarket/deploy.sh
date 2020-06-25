#!/bin/sh
# This is a comment!
echo Starting	# This is a comment, too!
#$ sudo chmod a+rx deploy.sh
#$ ./deploy.sh
cd /Users/andrewhinton/Documents/GitHub/wizardfrontend/webmarket
mvn clean install -DskipTests
echo Upload file	# This is a comment, too!
cd /Users/andrewhinton/Documents/GitHub/wizardfrontend/webmarket/target/
HOST='97.74.232.85'
USER='wizard'
PASSWD='Superman123#'
FILE='webmarket-0.0.1.war'
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
sshpass -p Superman123# ssh wizard@97.74.232.85 "cp /home/wizard/webmarket-0.0.1.war /opt/tomcat/webapps/webmarket-0.0.1.war;echo copiedfile; exit"

echo start copying new war 
echo copy war
END_SCRIPT
exit 0