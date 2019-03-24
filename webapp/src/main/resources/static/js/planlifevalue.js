function totalRow() {
	 var jan = document.getElementById("jan").value;
	 var total= 0 ;
	 
	 //jan = jan.substring(1);
	    var feb = document.getElementById("feb").value;
	      
	    var mar = document.getElementById("mar").value;
	
	    var apr = document.getElementById("apr").value;

	    var jul = document.getElementById("jul").value;

	    var aug = document.getElementById("aug").value; 
	
	    var sep = document.getElementById("sep").value;
		
	    var oct = document.getElementById("oct").value;
			
	    var nov = document.getElementById("nov").value;
		
	    var dec = document.getElementById("dec").value;
		
	    total = formatMoney(total);
	    total = "$" + total;
	//document.getElementById("totalRow").value = total;
}