
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
    

    for (i = 0; i < 5; i++) {
    var clone = document.importNode(template.content, true);
         var td = clone.querySelectorAll("td");
          td[0].textContent = "www"; //label
          td[1].textContent = "4"; //
          td[2].textContent = "2";
     //tbody.push(clone);

    tbody.appendChild(clone);
     }
    var td = clone.querySelectorAll("td");
    td[0].textContent = "www";
    td[1].textContent = "2";

    //tbody.appendChild(clone);

    // Clone the new row and insert it into the table
    var clone2 = document.importNode(template.content, true);
    td = clone2.querySelectorAll("td");
    td[0].textContent = "ddd";
    td[1].textContent = "2";

   // tbody.appendChild(clone2);

} else {
  // Find another way to add the rows to the table because 
  // the HTML template element is not supported.
}



}//end of function

buildSpreadSheet();
