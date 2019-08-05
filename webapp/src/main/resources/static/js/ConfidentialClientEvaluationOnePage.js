function calculateOne()
{
	var lastYearValue1 = document.getElementById("lastYearValue1").value;
	var lastYearValue2 = document.getElementById("lastYearValue2").value;
	var lastYearValue3 = document.getElementById("lastYearValue3").value;	
	var taiNext12Months = document.getElementById("taiNext12Months").value;
	var pctGrossSales = document.getElementById("pctGrossSales").value;
	var taiNext12MonthsCal = 0;
	
	//alert ("averageRepeatSales " + averageRepeatSales);
	var pctTAIGrossSalesLastYear = document.getElementById("pctTAIGrossSalesLastYear").value;
	var totalMediaInvestmentInput = document.getElementById("totalMediaInvestmentInput").value;
	var grossSalesLastyearCal = convertToNumberFromCurrency(document.getElementById("grossSalesLastyear").value);
	//TotalMediaInvestment / pctTAIGrossSalesLastYear = GrossSalesLastyear
	
	var lastYearValue4 = document.getElementById("lastYearValue4").value;
	var lastYearValue5= document.getElementById("lastYearValue5").value;
	var lastYearValue6= document.getElementById("lastYearValue6").value;
	var lastYearValue7 = document.getElementById("lastYearValue7").value;
	var lastYearValue8= document.getElementById("lastYearValue8").value;
	var lastYearValue9= document.getElementById("lastYearValue9").value;
	var lastYearValue1Cal =0;
	var lastYearValue2Cal =0;
	var lastYearValue3Cal =0;
	var lastYearValue4Cal =0;
	var lastYearValue5Cal =0;
	var lastYearValue6Cal =0;
		var lastYearValue7Cal =0;
	var lastYearValue8Cal =0;
	var lastYearValue9Cal =0;
	
	var pctTAIGrossSalesLastYearCal = 0;
	var totalMediaInvestmentCal = 0;
	
	if (totalMediaInvestmentInput != null) {
		totalMediaInvestmentInput = totalMediaInvestmentInput.substring(1);
		totalMediaInvestmentInput = removeComma(totalMediaInvestmentInput);
		totalMediaInvestmentCal = Number(totalMediaInvestmentInput);
	}
	
	
	
	 if (pctGrossSales != null) {
		pctGrossSales = Number(pctGrossSales);
	}

	if (taiNext12Months != null) {
		taiNext12Months = taiNext12Months.substring(1);
		taiNext12Months = removeComma(taiNext12Months);
		taiNext12MonthsCal = Number(taiNext12Months);
	}
	
	var estimatedGrossSalesNext12MonthsCal = 
		convertToNumberFromCurrency(document.getElementById("estimatedGrossSalesNext12Months").value);
	
	if (taiNext12MonthsCal > 0 && estimatedGrossSalesNext12MonthsCal > 0) {
	    document.getElementById("pctGrossSales").value = Math.round(taiNext12MonthsCal/estimatedGrossSalesNext12MonthsCal);
           //document.getElementById("pctGrossSales").value = Math.round(estimatedGrossSalesNext12MonthsCal/taiNext12MonthsCal);

	
	}
	
	if (taiNext12MonthsCal > 0 && pctGrossSales > 0) {
		var percentage = 100/pctGrossSales;
		var total = taiNext12MonthsCal/ percentage;
		//total = Math.round(total);
		total = CurrencyFormatted(total);
		//document.getElementById("estimatedGrossSalesNext12Months").value =  total;
		
	}
	
	
	
	
	if (pctTAIGrossSalesLastYear != null) {
		
	
		pctTAIGrossSalesLastYearCal = Number(pctTAIGrossSalesLastYear);
	}
	
	if (totalMediaInvestmentCal > 0 && pctTAIGrossSalesLastYearCal > 0) {
		var percentage = 100/pctTAIGrossSalesLastYearCal;
		var total = totalMediaInvestmentCal/ percentage;
		//total = Math.round(total);
		total = CurrencyFormatted(total);
		//document.getElementById("grossSalesLastyear").value =  total;
		
	}
	
	
	
	if (lastYearValue1 != null) {
		lastYearValue1 = lastYearValue1.substring(1);
		lastYearValue1 = removeComma(lastYearValue1);
		lastYearValue1Cal = Number(lastYearValue1);
	}
	if (lastYearValue2 != null) {
		lastYearValue2 = lastYearValue2.substring(1);
		lastYearValue2 = removeComma(lastYearValue2);
		lastYearValue2Cal = Number(lastYearValue2);
	}
	
	if (lastYearValue3 != null) {
		lastYearValue3 = lastYearValue3.substring(1);
		lastYearValue3 = removeComma(lastYearValue3);
		lastYearValue3Cal = Number(lastYearValue3);
	}
	if (lastYearValue4 != null) {
		lastYearValue4 = lastYearValue4.substring(1);
		lastYearValue4 = removeComma(lastYearValue4);
		lastYearValue4Cal = Number(lastYearValue4);
	}
	if (lastYearValue5 != null) {
		lastYearValue5 = lastYearValue5.substring(1);
		lastYearValue5 = removeComma(lastYearValue5);
		lastYearValue5Cal = Number(lastYearValue5);
	}
	if (lastYearValue6 != null) {
		lastYearValue6 = lastYearValue6.substring(1);
		lastYearValue6 = removeComma(lastYearValue6);
		lastYearValue6Cal = Number(lastYearValue6);
	}
	
		if (lastYearValue7 != null) {
		lastYearValue7 = lastYearValue7.substring(1);
		lastYearValue7 = removeComma(lastYearValue7);
		lastYearValue7Cal = Number(lastYearValue7);
	}
	if (lastYearValue8 != null) {
		lastYearValue8 = lastYearValue5.substring(1);
		lastYearValue8 = removeComma(lastYearValue8);
		lastYearValue8Cal = Number(lastYearValue8);
	}
	if (lastYearValue9 != null) {
		lastYearValue9 = lastYearValue9.substring(1);
		lastYearValue9 = removeComma(lastYearValue9);
		lastYearValue9Cal = Number(lastYearValue9);
	}
	


	
	var totalMediaInvestment = lastYearValue1Cal + lastYearValue2Cal + lastYearValue3Cal + lastYearValue4Cal
	                  + lastYearValue5Cal + lastYearValue6Cal  + lastYearValue7Cal + lastYearValue8Cal + lastYearValue9Cal;
	totalMediaInvestment = CurrencyFormatted(totalMediaInvestment);
	
	document.getElementById("totalMediaInvestment").value =  totalMediaInvestment;
	document.getElementById("totalMediaInvestmentInput").value = totalMediaInvestment;
	var totalMediaInvestmentTemp = convertToNumberFromCurrency(totalMediaInvestment);
	
	if (totalMediaInvestmentTemp != 0 && grossSalesLastyearCal != 0) {
				
		document.getElementById("pctTAIGrossSalesLastYear").value = Math.round( totalMediaInvestmentTemp/grossSalesLastyearCal);

		//document.getElementById("pctTAIGrossSalesLastYear").value = Math.round(grossSalesLastyearCal/totalMediaInvestmentTemp);
	}
	
	
	//document.getElementById("averageCustomerValue").value = e_averageCustomerValue;//e
	//document.getElementById("lifetimeValuePerCustomer").value = g_lifetimeValuePerCustomer;
	//document.getElementById("prospectsNeededToBreakEven").value = i_prospectsNeededToBreakEven;
}





function calculateTwo()
{
	var proposedValue1 = document.getElementById("proposedValue1").value;
	var proposedValue2 = document.getElementById("proposedValue2").value;
	var proposedValue3 = document.getElementById("proposedValue3").value;
	
	var taiShouldBe = document.getElementById("taiShouldBe").value;
	var industryAverage =document.getElementById("industryAverage").value;
	//var totalMediaInvestment = document.getElementById("totalMediaInvestmentTwo").value;
	
	//TotalMediaInvestment / pctTAIGrossSalesLastYear = GrossSalesLastyear
	
	var proposedValue4 = document.getElementById("proposedValue4").value;
	var proposedValue5= document.getElementById("proposedValue5").value;
	var proposedValue6= document.getElementById("proposedValue6").value;
	var proposedValue7 = document.getElementById("proposedValue7").value;
	var proposedValue8= document.getElementById("proposedValue8").value;
	var proposedValue9= document.getElementById("proposedValue9").value;
	var proposedValue1Cal =0;
	var proposedValue2Cal =0;
	var proposedValue3Cal =0;
	var proposedValue4Cal =0;
	var proposedValue5Cal =0;
	var proposedValue6Cal =0;	
	var proposedValue7Cal =0;
	var proposedValue8Cal =0;
	var proposedValue9Cal =0;
	
	
	var pctTAIGrossSalesLastYearCal = 0;
	var taiShouldBeCal = 0;
	
	
	if (taiShouldBe != null) {
		taiShouldBe = taiShouldBe.substring(1);
		taiShouldBe = removeComma(taiShouldBe);
		taiShouldBeCal = Number(taiShouldBe);
	}
	
	if (industryAverage != null) {
		industryAverage = Number(industryAverage);
	}
	
	
	if (pctTAIGrossSalesLastYear != null) {
		
	
		pctTAIGrossSalesLastYearCal = Number(pctTAIGrossSalesLastYear);
	}
	
	
	if (taiShouldBeCal > 0 && industryAverage > 0) {
		var percentage = 100/industryAverage;
		var total = taiShouldBeCal/ percentage;
		total = CurrencyFormatted(total);
		document.getElementById("salesGoals").value =  total;
		
	}
	
	
	
	if (proposedValue1 != null) {
		proposedValue1 = proposedValue1.substring(1);
		proposedValue1 = removeComma(proposedValue1);
		proposedValue1Cal = Number(proposedValue1);
	}
	if (proposedValue2 != null) {
		proposedValue2 = proposedValue2.substring(1);
		proposedValue2 = removeComma(proposedValue2);
		proposedValue2Cal = Number(proposedValue2);
	}
	
	if (proposedValue3 != null) {
		proposedValue3 = proposedValue3.substring(1);
		proposedValue3 = removeComma(proposedValue3);
		proposedValue3Cal = Number(proposedValue3);
	}
	if (proposedValue4 != null) {
		proposedValue4 = proposedValue4.substring(1);
		proposedValue4 = removeComma(proposedValue4);
		proposedValue4Cal = Number(proposedValue4);
	}
	if (proposedValue5 != null) {
		proposedValue5 = proposedValue5.substring(1);
		proposedValue5 = removeComma(proposedValue5);
		proposedValue5Cal = Number(proposedValue5);
	}
	if (proposedValue6 != null) {
		proposedValue6 = proposedValue6.substring(1);
		lastYearValue6 = removeComma(proposedValue6);
		proposedValue6Cal = Number(proposedValue6);
	}
		if (proposedValue7 != null) {
		proposedValue7 = proposedValue7.substring(1);
		proposedValue7 = removeComma(proposedValue7);
		proposedValue7Cal = Number(proposedValue7);
	}
	if (proposedValue8 != null) {
		proposedValue8 = proposedValue8.substring(1);
		proposedValue8 = removeComma(proposedValue8);
		proposedValue8Cal = Number(proposedValue8);
	}
	if (proposedValue9 != null) {
		proposedValue9 = proposedValue9.substring(1);
		lastYearValue9 = removeComma(proposedValue9);
		proposedValue9Cal = Number(proposedValue9);
	}
	
	


	
	var totalMediaInvestment = proposedValue1Cal + proposedValue2Cal + proposedValue3Cal + proposedValue4Cal
	                  + proposedValue5Cal + proposedValue6Cal + proposedValue7Cal + proposedValue8Cal + proposedValue9Cal;
	
	document.getElementById("totalMediaInvestmentTwo").value =  CurrencyFormatted(totalMediaInvestment);
	//document.getElementById("averageCustomerValue").value = e_averageCustomerValue;//e
	//document.getElementById("lifetimeValuePerCustomer").value = g_lifetimeValuePerCustomer;
	//document.getElementById("prospectsNeededToBreakEven").value = i_prospectsNeededToBreakEven;
}


function totalRow() {
	calculateOne();
	calculateTwo();
	//document.getElementById("totalRow").value = total;
}


