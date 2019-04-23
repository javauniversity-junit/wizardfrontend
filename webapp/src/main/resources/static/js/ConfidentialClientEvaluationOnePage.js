function calculate()
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
		llastYearValue6Cal = Number(lastYearValue6);
	}
	
	
	


	
	var totalMediaInvestment = lastYearValue1Cal + lastYearValue2Cal + lastYearValue3Cal + lastYearValue4Cal
	                  + lastYearValue5Cal + lastYearValue6Cal;
	
	document.getElementById("totalMediaInvestment").value =  totalMediaInvestment;
	//document.getElementById("averageCustomerValue").value = e_averageCustomerValue;//e
	//document.getElementById("lifetimeValuePerCustomer").value = g_lifetimeValuePerCustomer;
	//document.getElementById("prospectsNeededToBreakEven").value = i_prospectsNeededToBreakEven;
}


function totalRow() {
	calculate();
	//document.getElementById("totalRow").value = total;
}


