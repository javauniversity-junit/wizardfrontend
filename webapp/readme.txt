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