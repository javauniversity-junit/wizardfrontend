$("input[data-type='calculate']").on({
    keyup: function() {
    	c($(this));
    },
    blur: function() { 
    	grossProfitMargin($(this), "blur");
    }
});

function calculate()
{
	var averageSale = document.getElementById("averageSale").value;
	var grossProfitMargin = document.getElementById("grossProfitMargin").value;
	var averageRepeatSales = document.getElementById("averageRepeatSales").value;
	var yearsOfPatronage = document.getElementById("yearsOfPatronage").value;
	var averageSaleCal =0;
	var grossProfitMarginCal =0;
	var averageRepeatSalesCal =0;
	var yearsOfPatronageCal =0;
	
	if (averageSale != null) {
		averageSale = averageSale.substring(1);
		averageSale = removeComma(averageSale);;
		averageSaleCal = Number(averageSale);
	}
	
	if (grossProfitMargin != null) {
		grossProfitMarginCal = Number(grossProfitMargin);
	}
	
	if (averageRepeatSales != null) {
		grossProfitMarginCal = Number(grossProfitMargin);
	}
	if (grossProfitMargin != null) {
		grossProfitMarginCal = Number(grossProfitMargin);
	}
	
}


function totalRow() {
	calculate();
	//document.getElementById("totalRow").value = total;
}