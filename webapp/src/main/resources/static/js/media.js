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

class AnimalES6 {
   //  #ttt = "ddd";
    constructor(id, name, jan) {
        this.id = id;
        this.name = name;
        this.jan = jan;
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
 
function addObj(name, jan ) {
    var id = create_UUID();
    var lionES6 = new AnimalES6(id,name,jan);
    objs.push(lionES6 );
    lionES6.doSomething();
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
   }
}


function addOrUpdate() {
    var textObjValue = document.getElementById("medianame").value;
    var hiddenObjIdValue = document.getElementById("idname").value;
  for (i in objs) {
      if (hiddenObjIdValue ==  objs[i].id) {
          objs[i].nameValue = textObjValue;
          console.log("After update: ", objs[i]);
         break;
      }
   }//end of for
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

function remove (name) {
   for( var i = 0; i <  objs.length; i++){ 
      if (objs[i].objName === name) {
        objs.splice(i, 1); 
        console.log("removed  " + name);
     }
  }
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
}//end of function




console.log(" id " + create_UUID());



addObj("Lion","0");
addObj("Tiger","0");
addObj("Monkey","0");
 sortObj();
 //objs.push(lionES6 );
 console.log("objs " + objs[0].objName);
doesTheObjExist("bird");
doesTheObjExist("Lion");
remove ("Lion");
 convertToJSON();
build();
