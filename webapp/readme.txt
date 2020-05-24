ssh wizard@97.74.232.85 password Superman123#

/etc/cron.daily

database backups
/home/databasebackup

stat -f '%Su' /home/databasebackup
sudo chmod -R 777 /home/databasebackup


sshpass -p Superman123# ssh wizard@97.74.232.85 "cp /home/backups/23May2020/license-23May2020.sql .;echo copiedfileWorked; exit"


https://spring.io/guides/gs/serving-web-content/
https://spring.io/projects/spring-framework
https://spring.io/guides/gs/securing-web/

    <script th:inline="javascript" th:each="category : ${categories}" >

    
    
    /*<![CDATA[*/

    
    	app.controller(/*[[${category.name}]]*/
         , function($scope) {
       $scope.records  = [[${category.toString()}]]
              });
     
    	 /*]]>*/
          
          
          
        
    </script>