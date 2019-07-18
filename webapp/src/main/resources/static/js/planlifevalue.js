

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
	
	document.getElementById("grossProfitPerSale").value =  formatCurrency(Math.round(c_grossProfitPerSale));
	document.getElementById("averageCustomerValue").value = formatCurrency(Math.round(e_averageCustomerValue));//e
	document.getElementById("lifetimeValuePerCustomer").value = formatCurrency(Math.round(g_lifetimeValuePerCustomer));
	document.getElementById("prospectsNeededToBreakEven").value = i_prospectsNeededToBreakEven;
}


function totalRow() {
	calculate();
	//document.getElementById("totalRow").value = total;
}

function FormatAmount(amount) {
	var i = parseFloat(amount);
	if(isNaN(i)) { i = 0.00; }
	var minus = '';
	if(i < 0) { minus = '-'; }
	i = Math.abs(i);
	i = parseInt((i + .005) * 100);
	i = i / 100;
	s = new String(i);
	if(s.indexOf('.') < 0) { s += '.00'; }
	if(s.indexOf('.') == (s.length - 2)) { s += '0'; }
	s = minus + s;
	s = "$" + s;
	return s;
}
