#!/bin/sh
# This is a comment!
echo Starting	# This is a comment, too!
#$ sudo chmod a+rx deploy.sh
#$ ./deploy.sh
cd /Users/andrewhinton/Documents/GitHub/wizardfrontend/webapp
mvn clean install -DskipTests
echo Upload file	# This is a comment, too!
cd /Users/andrewhinton/Documents/GitHub/wizardfrontend/webapp/target/
HOST='97.74.232.85'
USER='wizard'
PASSWD='Superman123#'
FILE='scrs.war'
REMOTEPATH='.'


ftp -nd $HOST <<END_SCRIPT
quote USER $USER
quote PASS $PASSWD
cd $REMOTEPATH
binary
put $FILE
quit
END_SCRIPT
exit 0


