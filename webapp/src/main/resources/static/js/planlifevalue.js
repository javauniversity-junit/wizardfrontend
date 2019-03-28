

function calculate()
{
	var averageSale = document.getElementById("averageSale").value;
	var grossProfitMargin = document.getElementById("grossProfitMargin").value;
	var averageRepeatSales = document.getElementById("averageRepeatSales").value;
	//alert ("averageRepeatSales " + averageRepeatSales);
	
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
		averageRepeatSalesCal = Number(averageRepeatSales);
	}
	if (yearsOfPatronage != null) {
		yearsOfPatronageCal = Number(yearsOfPatronage);
	}
	var c_grossProfitPerSale = averageSaleCal * grossProfitMarginCal;
	var e_averageCustomerValue = c_grossProfitPerSale *  averageRepeatSalesCal;
	var g_lifetimeValuePerCustomer =e_averageCustomerValue * yearsOfPatronageCal;
	var i_prospectsNeededToBreakEven = Math.round(g_lifetimeValuePerCustomer * monthlyInvestmentAverageCal);
	console.log(" averageRepeatSales " +  averageRepeatSales);
	console.log(" c_grossProfitPerSale " +  c_grossProfitPerSale);
	console.log(" e_averageCustomerValue " +  e_averageCustomerValue);
	console.log("g_lifetimeValuePerCustomer " +  g_lifetimeValuePerCustomer);
	console.log("i_prospectsNeededToBreakEven " +  i_prospectsNeededToBreakEven);
	
	document.getElementById("grossProfitPerSale").value =  c_grossProfitPerSale;
	document.getElementById("averageCustomerValue").value = e_averageCustomerValue;//e
	document.getElementById("lifetimeValuePerCustomer").value = g_lifetimeValuePerCustomer;
	document.getElementById("prospectsNeededToBreakEven").value = i_prospectsNeededToBreakEven;
}


function totalRow() {
	calculate();
	//document.getElementById("totalRow").value = total;
}
