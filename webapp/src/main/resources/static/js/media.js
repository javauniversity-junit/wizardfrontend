//class variable for global objects
var objs = [];

/**
 * create id.
 * return id
 */
function create_UUID(){
    var dt = new Date().getTime();
    var uuid = 'xxxxxxxx-xxxx-4xxx-yxxx-xxxxxxxxxxxx'.replace(/[xy]/g, function(c) {
        var r = (dt + Math.random()*16)%16 | 0;
        dt = Math.floor(dt/16);
        return (c=='x' ? r :(r&0x3|0x8)).toString(16);
    });
    return uuid;
}

class MediaRow {
   //  #ttt = "ddd";
    constructor(id, name, jan,fed,mar,apr,may,jun,jul,aug,sep,oct,nov,dec) {
        this.id = id;
        this.name = name;
        this.jan = jan;
        this.feb = feb;
        this.mar = mar;
        this.apr = apr;
        this.may = may;
        this.jun = jun;
        this.jul = jul;
        this.aug = aug;
        this.sep = sep;
        this.oct = oct;
        this.nov = nov;
        this.dec = dec;
    }
  
   set nameValue(x) {
    this.name = x;
  }

   get objName() {
        return this.name;
    }
    doSomething() {
        console.log("I'm a " + this.name);
    }
}
/**
 * add .
 * @constructor
 * @param {string} title - The title of the book.
 * @param {string} author - The author of the book.
 */
 
function addObj(name, jan,fed,mar,apr,may,june,july,aug,sept,oct,nov,dec ) {
    var id = create_UUID();
    var lionES6 = new MediaRow(id,name,jan,fed,mar,apr,may,june,july,aug,sept,oct,nov,dec);
   
    objs.push(lionES6 );
    updatehiddenMediaRow ();
    //lionES6.doSomething();
}

function updatehiddenMediaRow ()
{
	 var mediarow = document.getElementById("mediarow").value;
	var json = convertToJSON();
	mediarow = json;
}

/**
 * compare for sorting
 * @constructor
 * @param {string} title - The title of the book.
 * @param {string} author - The author of the book.
 */
function compare(a,b) {
  if (a.objName < b.objName)
    return -1;
  if (a.objName > b.objName)
    return 1;
  return 0;
}
/**
 * sort array
 * @constructor
 * @param {string} title - The title of the book.
 * @param {string} author - The author of the book.
 */
function sortObj() {
   objs.sort(compare);
   var test ="";
  for (i in objs) {
      test =  test + "," +  objs[i].objName;
   }
 console.log("objs sorted" + test); 
}


function doesTheObjExist(name) {
   var found = "false";
  for (i in objs) {
      if (name ==  objs[i].objName) {
         found = "true";
         break;
      }
   }
  console.log("does obj exitst " + name + " " + found); 
  return found;
}

function displayDetail(idValue) {
 // alert('ddd');
    var textObj = document.getElementById("medianame");
    var hiddenObjId = document.getElementById("idname");
   for (i in objs) {
      if (idValue ==  objs[i].id) {
          textObj.value = objs[i].objName;
          hiddenObjId.value = objs[i].id;
         break;
      }
   }//end of for
   displayUpdateButton();
}


function addOrUpdate() {
    var textObjValue = document.getElementById("medianame").value;
    var hiddenObjIdValue = document.getElementById("idname").value;
    
    var jan = document.getElementById("jan").value;
    var feb = document.getElementById("feb").value;
    var mar = document.getElementById("mar").value;
    var apr = document.getElementById("apr").value;
    var may = document.getElementById("may").value;
    var jun = document.getElementById("jun").value;
    var jul = document.getElementById("jul").value;
    var aug = document.getElementById("aug").value;  
    var sep = document.getElementById("sep").value;
    var oct = document.getElementById("oct").value;
    var nov = document.getElementById("nov").value;
    var dec = document.getElementById("dec").value;
    
    var update = "false";
    for (i in objs) {
      if (hiddenObjIdValue ==  objs[i].id) {
          objs[i].nameValue = textObjValue;
          objs[i].jan = jan;
          objs[i].feb = feb;        
          objs[i].mar = mar;   
          objs[i].apr = apr; 
          objs[i].may = may;
          objs[i].jun = jun;        
          objs[i].jul = jul;   
          objs[i].aug = aug;  
          objs[i].sep = sep;
          objs[i].oct = oct;        
          objs[i].nov = nov;   
          objs[i].dec = dec;           
          
          updatehiddenMediaRow ();
          console.log("After update: ", objs[i]);
          update = "true";
         break;
      }
   }//end of for
    if (update == "false") {
    	addObj(textObjValue,jan,feb,mar,apr,may,june,july,aug,sept,oct,nov,dec);
    }
    displayAddButton();
    build();

}



function build() {
   var items = document.getElementById("items");
   items.innerHTML = "";
   var temp = document.getElementsByTagName("template")[0];
   objs.sort(compare);
   var test ="";
  for (i in objs) {
   var fucnName = "javascript:displayDetail('" + objs[i].id + "');"; 
   temp.content.querySelector('a').href =fucnName ;

   temp.content.querySelector('a').text =objs[i].objName;
   var clon = temp.content.cloneNode(true);
  

    items.appendChild(clon);
//alert(items.innerHTML);
      
   }
}//end of function

function deleteRow() {
	var hiddenObjId = document.getElementById("idname");
	 for( var i = 0; i <  objs.length; i++){ 
	      if (objs[i].id === hiddenObjId.value) {
	        objs.splice(i, 1); 
	        console.log("removed  " + name);
	     }
	  }//end of for
	 clearForm();
	 displayAddButton();
	 build();
	 updatehiddenMediaRow ();
}

function clearForm () {
    document.getElementById("myForm").reset();
	
}

function remove (name) {
   for( var i = 0; i <  objs.length; i++){ 
      if (objs[i].objName === name) {
        objs.splice(i, 1); 
        console.log("removed  " + name);
     }
      updatehiddenMediaRow ();
  }//end of for
   
}//end of function

function change( key, name, desc ) {
   for (var i in objs) {
     if (objs[i].key == key) {
        //todo update objs[i].desc = desc;
        break; //Stop this loop, we found it!
     }
   }
}//end of function


function convertToJSON() {
     var jsonString = JSON.stringify(objs);
     
    console.log("JSON  " + jsonString );
    return jsonString;
}//end of function

function displayAddButton() {
	var add = document.getElementById("add");
	var update = document.getElementById("update"); 
	    add.style.display = "block";
	  
	    update.style.display = "none";
	    clearForm ();
	 
}
function displayUpdateButton() {
	var add = document.getElementById("add");
	var update = document.getElementById("update"); 
	    add.style.display = "none";
	  
	    update.style.display = "block";
	 
}


//console.log(" id " + create_UUID());



//addObj("Lion","0");
//addObj("Tiger","0");
//addObj("Monkey","0");
 
//sortObj();
 //objs.push(lionES6 );
  //console.log("objs " + objs[0].objName);
//doesTheObjExist("bird");
//doesTheObjExist("Lion");
//remove ("Lion");
 //convertToJSON();
//build();
