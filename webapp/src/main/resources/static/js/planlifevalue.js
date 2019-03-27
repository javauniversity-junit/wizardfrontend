$("input[data-type='calculate']").on({
    keyup: function() {
    	calculate()($(this));
    },
    blur: function() { 
    	calculate()($(this), "blur");
    }
});

function calculate(input, blur)
{
	var averageSale = document.getElementById("averageSale").value;
	var grossProfitMargin = document.getElementById("grossProfitMargin").value;
	var averageRepeatSales = document.getElementById("averageRepeatSales").value;
	var yearsOfPatronage = document.getElementById("yearsOfPatronage").value;
	var monthlyInvestmentAverage= document.getElementById("monthlyInvestmentAverage").value;
	var averageSaleCal =0;
	var grossProfitMarginCal =0;
	var averageRepeatSalesCal =0;
	var yearsOfPatronageCal =0;
	var monthlyInvestmentAverageCal = 0;
	
	if (averageSale != null) {
		averageSale = averageSale.substring(1);
		averageSale = removeComma(averageSale);;
		averageSaleCal = Number(averageSale);
	}
	if (monthlyInvestmentAverage != null) {
		monthlyInvestmentAverage = monthlyInvestmentAverage.substring(1);
		monthlyInvestmentAverage = removeComma(monthlyInvestmentAverage);;
		monthlyInvestmentAverageCal = Number(monthlyInvestmentAverage);
	}
	
	if (grossProfitMargin != null) {
		grossProfitMarginCal = Number(grossProfitMargin);
		grossProfitMarginCal = grossProfitMarginCal/100;
	}
	
	if (averageRepeatSales != null) {
		averageRepeatSalesCal = Number(averageRepeatSalesCal);
	}
	if (yearsOfPatronage != null) {
		yearsOfPatronageCal = Number(yearsOfPatronage);
	}
	
	document.getElementById("grossProfitPerSale").value = averageSaleCal * grossProfitMarginCal;
	document.getElementById("averageCustomerValue").value = (averageSaleCal * grossProfitMarginCal) * averageRepeatSalesCal;
	document.getElementById("lifetimeValuePerCustomer").value = (averageSaleCal * grossProfitMarginCal) * averageRepeatSalesCal * yearsOfPatronageCal;
	document.getElementById("prospectsNeededToBreakEven").value = (averageSaleCal * grossProfitMarginCal) 
	    * averageRepeatSalesCal * yearsOfPatronageCal * monthlyInvestmentAverageCal;
}


function totalRow() {
	calculate();
	//document.getElementById("totalRow").value = total;
}