function calculate()
{
	var planAAverageSale = convertToNumberFromCurrency(document.getElementById("planAAverageSale").value); // a
	
	var planAGrossMargin = convertToNumberFromCurrency(document.getElementById("planAGrossMargin").value); // b
	var planAClosingPct = convertIntToNumber(document.getElementById("planAClosingPct").value); // c
	var planAProspectValue = planAAverageSale * planAGrossMargin * planAClosingPct; // d = abc
	

	var planAInvestment = convertToNumberFromCurrency(document.getElementById("planAInvestment").value); // e
	var planAProspectsNeeded = planAProspectValue == 0 ? 0 : planAInvestment / planAProspectValue; // f = e/d
	
	
	var planAProspectSalesNeeded = planAProspectsNeeded * planAClosingPct; // g = fc
	var planAGrossProfitOnSales = planAProspectSalesNeeded * planAAverageSale; // h = ga
	var planAMonths = convertIntToNumber(document.getElementById("planAMonths").value); // i
	var planAAdditionalGrossSales = planAGrossProfitOnSales * planAMonths; // j = hi
	
	document.getElementById("planAProspectValue").value =  planAProspectValue;
	document.getElementById("planAProspectsNeeded").value =  planAProspectsNeeded;
	document.getElementById("planAProspectSalesNeeded").value =  planAProspectSalesNeeded;	
	document.getElementById("planAGrossProfitOnSales").value =  planAGrossProfitOnSales;
	document.getElementById("planAAdditionalGrossSales").value =  planAAdditionalGrossSales;
}

function totalRow() {
	calculate();
	//document.getElementById("totalRow").value = total;
}
