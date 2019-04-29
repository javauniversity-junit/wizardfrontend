function calculate()
{
	var planBAverageSale = Number(document.getElementById("planBAverageSale").value); // a
	var planBGrossMargin = document.getElementById("planBGrossMargin").value; // b
	var planBClosingPct = document.getElementById("planBClosingPct").value; // c
	var planBProspectValue = planBAverageSale * planBGrossMargin * planBClosingPct; // d = abc


	var planBInvestment = document.getElementById("planBAverageSale").value; // e
	var planBProspectsNeeded = planBInvestment / planBProspectValue; // f = e/d
	var planBProspectSalesNeeded = planBProspectsNeeded * planBClosingPct; // g = fc
	var planBGrossProfitOnSales = planBProspectSalesNeeded * planBAverageSale; // h = ga
	var planBMonths = document.gplanBProspectsNeededetElementById("planBMonths").value; // i
	var planBAdditionalGrossSales = planBGrossProfitOnSales * planBMonths; // j = hi
	
	document.getElementById("planBProspectValue").value =  planBProspectValue;
	document.getElementById("planBProspectsNeeded").value =  planBProspectsNeeded;
	document.getElementById("planBProspectSalesNeeded").value =  planBProspectSalesNeeded;	
	document.getElementById("planBGrossProfitOnSales").value =  planBGrossProfitOnSales;
	document.getElementById("planBAdditionalGrossSales").value =  planBAdditionalGrossSales;
}

function totalRow() {
	calculate();
	//document.getElementById("totalRow").value = total;
}