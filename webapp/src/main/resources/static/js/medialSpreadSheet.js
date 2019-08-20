
function buildSpreadSheet() {


// Test to see if the browser supports the HTML template element by checking
// for the presence of the template element's content attribute.
if ('content' in document.createElement('template')) {

    //remove all nodes
	
    $( "#productrow" ).empty();
    // Instantiate the table with the existing HTML tbody    
    // and the row with the template
    var template = document.querySelector('#productrow');

    // Clone the new row and insert it into the table
    var tbody = document.querySelector("tbody");
    
          for (i in objs) {
	         td[0].textContent  = objs[i].name; 
	          td[1].textContent = objs[i].jan;
	          td[2].textContent= objs[i].feb;  
	         td[3].textContent= objs[i].mar;
	         td[4].textContent= objs[i].apr; 
	          td[5].textContent= objs[i].may;
	        td[6].textContent= objs[i].jun;  
	          td[7].textContent= objs[i].jul;
	          td[8].textContent= objs[i].aug;  
	          td[9].textContent= objs[i].sep;
	          td[10].textContent= objs[i].oct;  
	          td[11].textContent= objs[i].nov;
	          td[12].textContent= objs[i].dec;          
	         var clone = document.importNode(template.content, true);
                 var td = clone.querySelectorAll("td");
               tbody.appendChild(clone);  
	   }//end of for
	
	
	
	
	
	
	



} else {
  // Find another way to add the rows to the table because 
  // the HTML template element is not supported.
}

// Test to see if the browser supports the HTML template element by checking
// for the presence of the template element's content attribute.
if ('content' in document.createElement('template')) {

    // Instantiate the table with the existing HTML tfoot
    // and the row with the template
    var template = document.querySelector('#footerrow');

    // Clone the new row and insert it into the table
    var tfoot = document.querySelector("tfoot");
    var clone = document.importNode(template.content, true);
    var td = clone.querySelectorAll("td");
    td[1].textContent = "1";
    td[2].textContent = "2";

    tfoot.appendChild(clone);

  

} else {
  // Find another way to add the rows to the table because 
  // the HTML template element is not supported.
}//end of footer
	
	
	

}//end of function

buildSpreadSheet();
