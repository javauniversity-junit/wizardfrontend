Lookup the files in eclipse\plugins\org.eclipse.platform_4.2.x.y\css for your current style sheet (probably e4_default_win7.css), and then just add the following rule:

#org-eclipse-jdt-ui-PackageExplorer Tree,
#org-eclipse-ui-navigator-ProjectExplorer Tree {
  font-size: 10px; /* <-- Desired font size */
}


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