#!/bin/sh

sshpass -p Superman123# ssh wizard@97.74.232.85 "cp /opt/tomcat/logs/catalina.out .;echo copiedfile; exit"


HOST='97.74.232.85'
USER='wizard'
PASSWD='Superman123#'
FILE='catalina.out'
REMOTEPATH='.'


ftp -nd $HOST <<END_SCRIPT
quote USER $USER
quote PASS $PASSWD
cd $REMOTEPATH
binary
get $FILE
quit


END_SCRIPT
exit 0


