java -jar -Dspring.profiles.active=application-codeeny.properties 
mvn clean package -P batch
ps -A |grep java
kill -9 PID
