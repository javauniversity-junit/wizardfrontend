function calculateOne()
{
	var lastYearValue1 = document.getElementById("lastYearValue1").value;
	var lastYearValue2 = document.getElementById("lastYearValue2").value;
	var lastYearValue3 = document.getElementById("lastYearValue3").value;
	//alert ("averageRepeatSales " + averageRepeatSales);
	var pctTAIGrossSalesLastYear = document.getElementById("pctTAIGrossSalesLastYear").value;
	var totalMediaInvestment = document.getElementById("totalMediaInvestment").value;
	
	//TotalMediaInvestment / pctTAIGrossSalesLastYear = GrossSalesLastyear
	
	var lastYearValue4 = document.getElementById("lastYearValue4").value;
	var lastYearValue5= document.getElementById("lastYearValue5").value;
	var lastYearValue6= document.getElementById("lastYearValue6").value;
	var lastYearValue1Cal =0;
	var lastYearValue2Cal =0;
	var lastYearValue3Cal =0;
	var lastYearValue4Cal =0;
	var lastYearValue5Cal =0;
	var lastYearValue6Cal =0;
	
	var pctTAIGrossSalesLastYearCal = 0;
	var totalMediaInvestmentCal = 0;
	
	
	if (totalMediaInvestment != null) {
		totalMediaInvestment = totalMediaInvestment.substring(1);
		totalMediaInvestment = removeComma(totalMediaInvestment);
		totalMediaInvestmentCal = Number(totalMediaInvestment);
	}	
	
	
	if (pctTAIGrossSalesLastYear != null) {
		
	
		pctTAIGrossSalesLastYearCal = Number(pctTAIGrossSalesLastYear);
	}
	
	if (totalMediaInvestmentCal > 0 && pctTAIGrossSalesLastYearCal > 0) {
		var percentage = 100/pctTAIGrossSalesLastYearCal;
		var total = totalMediaInvestmentCal/ percentage;
		total = Math.round(total);
		document.getElementById("grossSalesLastyear").value =  total;
		
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
	
	
	


	
	var totalMediaInvestment = lastYearValue1Cal + lastYearValue2Cal + lastYearValue3Cal + lastYearValue4Cal
	                  + lastYearValue5Cal + lastYearValue6Cal;
	
	document.getElementById("totalMediaInvestment").value =  totalMediaInvestment;
	//document.getElementById("averageCustomerValue").value = e_averageCustomerValue;//e
	//document.getElementById("lifetimeValuePerCustomer").value = g_lifetimeValuePerCustomer;
	//document.getElementById("prospectsNeededToBreakEven").value = i_prospectsNeededToBreakEven;
}





function calculateTwo()
{
	var proposedValue1 = document.getElementById("proposedValue1").value;
	var proposedValue2 = document.getElementById("proposedValue2").value;
	var proposedValue3 = document.getElementById("proposedValue3").value;
	
	var pctTAIGrossSalesLastYear = document.getElementById("pctTAIGrossSalesLastYear").value;
	var totalMediaInvestment = document.getElementById("totalMediaInvestment").value;
	
	//TotalMediaInvestment / pctTAIGrossSalesLastYear = GrossSalesLastyear
	
	var proposedValue4 = document.getElementById("proposedValue4").value;
	var proposedValue5= document.getElementById("proposedValue5").value;
	var proposedValue6= document.getElementById("proposedValue6").value;
	var proposedValue1Cal =0;
	var proposedValue2Cal =0;
	var proposedValue3Cal =0;
	var proposedValue4Cal =0;
	var proposedValue5Cal =0;
	var proposedValue6Cal =0;
	
	var pctTAIGrossSalesLastYearCal = 0;
	var totalMediaInvestmentCal = 0;
	
	
	if (totalMediaInvestment != null) {
		totalMediaInvestment = totalMediaInvestment.substring(1);
		totalMediaInvestment = removeComma(totalMediaInvestment);
		totalMediaInvestmentCal = Number(totalMediaInvestment);
	}	
	
	
	if (pctTAIGrossSalesLastYear != null) {
		
	
		pctTAIGrossSalesLastYearCal = Number(pctTAIGrossSalesLastYear);
	}
	
	if (totalMediaInvestmentCal > 0 && pctTAIGrossSalesLastYearCal > 0) {
		var percentage = 100/pctTAIGrossSalesLastYearCal;
		var total = totalMediaInvestmentCal/ percentage;
		total = Math.round(total);
		document.getElementById("grossSalesLastyear").value =  total;
		
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
	
	if proposedValue3 != null) {
		proposedValue3 = proposedValue3.substring(1);
		proposedValue3 = removeComma(proposedValue3);
		proposedValue3Cal = Number(proposedValue3);
	}
	if (proposedValue4 != null) {
		proposedValue4 = proposedValue4.substring(1);
		proposedValue4 = removeComma(proposedValue4);
		proposedValue4Cal = Number(lastYearValue4);
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
	
	
	


	
	var totalMediaInvestment = lastYearValue1Cal + lastYearValue2Cal + lastYearValue3Cal + lastYearValue4Cal
	                  + lastYearValue5Cal + lastYearValue6Cal;
	
	document.getElementById("totalMediaInvestment").value =  totalMediaInvestment;
	//document.getElementById("averageCustomerValue").value = e_averageCustomerValue;//e
	//document.getElementById("lifetimeValuePerCustomer").value = g_lifetimeValuePerCustomer;
	//document.getElementById("prospectsNeededToBreakEven").value = i_prospectsNeededToBreakEven;
}


function totalRow() {
	calculateOne();
	calculateTwo();
	//document.getElementById("totalRow").value = total;
}


