#!/bin/sh

HOST='97.74.232.85'
USER='wizard'
PASSWD='Superman123#'
FILE='/opt/tomcat/webapps/catalina.log'
REMOTEPATH='.'


ftp -nd $HOST <<END_SCRIPT
quote USER $USER
quote PASS $PASSWD
cd $REMOTEPATH
binary
get $FILE
quit

echo remote to server
#copy file
sshpass -p Superman123# ssh wizard@97.74.232.85 "cp /home/wizard/scrs.war /opt/tomcat/webapps/scr.war;echo copiedfile; exit"

echo start copying new war 
echo copy war
END_SCRIPT
exit 0


