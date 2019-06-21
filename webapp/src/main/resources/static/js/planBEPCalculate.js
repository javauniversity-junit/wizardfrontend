function calculate()
{
	var planAAverageSale = convertToNumberFromCurrency(document.getElementById("planAAverageSale").value); // a
	
	var planAGrossMargin = document.getElementById("planAGrossMargin").value; // b
	var planAClosingPct = document.getElementById("planAClosingPct").value; // c
	var planAProspectValue = planAAverageSale * planAGrossMargin * planAClosingPct; // d = abc


	var planAInvestment = document.getElementById("planAAverageSale").value; // e
	var planAProspectsNeeded = planAInvestment / planAProspectValue; // f = e/d
	var planAProspectSalesNeeded = planAProspectsNeeded * planAClosingPct; // g = fc
	var planAGrossProfitOnSales = planAProspectSalesNeeded * planAAverageSale; // h = ga
	var planAMonths = document.gplanAProspectsNeededetElementById("planAMonths").value; // i
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
