function calculate()
{
	var lastYearValue1 = document.getElementById("lastYearValue1").value;
	var lastYearValue2 = document.getElementById("lastYearValue2").value;
	var lastYearValue3 = document.getElementById("lastYearValue3").value;
	//alert ("averageRepeatSales " + averageRepeatSales);
	
	var lastYearValue4 = document.getElementById("lastYearValue4").value;
	var lastYearValue5= document.getElementById("lastYearValue5").value;
	var lastYearValue6= document.getElementById("lastYearValue6").value;
	var lastYearValue1Cal =0;
	var lastYearValue2Cal =0;
	var lastYearValue3Cal =0;
	var lastYearValue4Cal =0;
	var lastYearValue5Cal =0;
	var lastYearValue6Cal =0;
	
	if (lastYearValue1 != null) {
		lastYearValue1 = lastYearValue1.substring(1);
		lastYearValue1 = removeComma(lastYearValue1);;
		lastYearValue1Cal = Number(lastYearValue1);
	}
	if (lastYearValue2 != null) {
		lastYearValue2 = lastYearValue2.substring(1);
		lastYearValue2 = removeComma(lastYearValue2;;
		lastYearValue2Cal = Number(lastYearValue2);
	}
	
	if (lastYearValue3 != null) {
		lastYearValue3 = lastYearValue3.substring(1);
		lastYearValue3 = removeComma(lastYearValue3);;
		lastYearValue3Cal = Number(lastYearValue3);
	}
	if (lastYearValue4 != null) {
		lastYearValue4 = lastYearValue4.substring(1);
		lastYearValue4 = removeComma(lastYearValue4;;
		lastYearValue4Cal = Number(lastYearValue4);
	}
	if (lastYearValue5 != null) {
		lastYearValue5 = lastYearValue5.substring(1);
		lastYearValue5 = removeComma(lastYearValue5);;
		lastYearValue5Cal = Number(lastYearValue5);
	}
	if (lastYearValue6 != null) {
		lastYearValue6 = lastYearValue6.substring(1);
		lastYearValue6 = removeComma(lastYearValue6;;
		llastYearValue6Cal = Number(lastYearValue6);
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


