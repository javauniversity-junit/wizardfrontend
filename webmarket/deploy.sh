# get source from github
cd /home/wizard/source
rm -rf  /home/wizard/source/wizardfrontend
git clone https://github.com/hintonandrew510/wizardfrontend.git
cd /home/wizard/source/wizardfrontend/webmarket
mvn clean install
cp /home/wizard/source/webmarket/target/*.war /usr/share/tomcat/webapps
