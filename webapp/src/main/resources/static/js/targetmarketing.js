function calculateMen () {

	//clear
	console.clear();
	
	var pctMen = document.getElementById("pctMen").value;
    var pctWomen = 100 - pctMen;
    document.getElementById("pctWomen").value =  = pctWomen;
}

function calculateWomen () {

	//clear
	console.clear();
	var pctWomen = document.getElementById("pctWomen").value;
    var pctMen = 100 - pctWomen;
    document.getElementById("pctMen").value =  = pctMen;
}