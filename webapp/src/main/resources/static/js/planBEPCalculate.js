function calculate()
{
	var planAAverageSale = Number(document.getElementById("planAAverageSale").value); // a
	var planAGrossMargin = document.getElementById("planAGrossMargin").value; // b
	var planAClosingPct = document.getElementById("planAClosingPct").value; // c
	var planAProspectValue = planAAverageSale * planAGrossMargin * planAClosingPct; // d = abc
	document.getElementById("planAProspectValue").value =  planAProspectValue;

	var planAInvestment = document.getElementById("planAAverageSale").value; // e
	
	var planAProspectsNeeded = planAInvestment / planAProspectValue; //f
	document.getElementById("planAProspectsNeeded").value =  planAProspectsNeeded;
	
	var planAProspectSalesNeeded = planAProspectsNeeded * planAClosingPct; // g = fc
	document.gplanAProspectsNeededetElementById("planAProspectSalesNeeded").value =  planAProspectSalesNeeded;
	
	var planAGrossProfitOnSales = planAProspectSalesNeeded * planAAverageSale; // h = ga
	document.gplanAProspectsNeededetElementById("planAGrossProfitOnSales").value =  planAGrossProfitOnSales;
	
	var planAMonths = document.gplanAProspectsNeededetElementById("planAMonths").value; // i
	var planAAdditionalGrossSales = planAGrossProfitOnSales * planAMonths; // j = hi
}

function totalRow() {
	calculate();
	//document.getElementById("totalRow").value = total;
}