#!/bin/sh
# This is a comment!
echo Hello World	# This is a comment, too!
#$ chmod a+rx my-script.sh
#$ ./my-script.sh
cd /Users/andrewhinton/Documents/GitHub/wizardfrontend/webapp
mvn clean install -DskipTests
echo Hello World	# This is a comment, too!
HOST='97.74.232.85'
USER='wizard'
PASSWD='Superman123#'
FILE='/Users/andrewhinton/Documents/GitHub/wizardfrontend/webapp/target/scrs.war'
REMOTEPATH='.'


ftp -n $HOST <<END_SCRIPT
quote USER $USER
quote PASS $PASSWD
cd $REMOTEPATH
binary
put $FILE
quit
END_SCRIPT
exit 0


