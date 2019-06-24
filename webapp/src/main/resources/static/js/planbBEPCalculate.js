function calculate()
{
	var planBAverageSale = convertToNumberFromCurrency(document.getElementById("planBAverageSale").value); // a
	var planBGrossMargin = convertToNumberFromCurrency(document.getElementById("planBGrossMargin").value); // b
	var planBClosingPct = document.getElementById("planBClosingPct").value; // c
	var planBProspectValue = planBAverageSale * planBGrossMargin * planBClosingPct; // d = abc


	var planBInvestment = convertToNumberFromCurrency(document.getElementById("planBAverageSale").value); // e
	var planBProspectsNeeded = planBProspectValue == 0 ? 0 : planBInvestment / planBProspectValue; // f = e/d
	var planBProspectSalesNeeded = planBProspectsNeeded * planBClosingPct; // g = fc
	var planBGrossProfitOnSales = planBProspectSalesNeeded * planBAverageSale; // h = ga
	var planBMonths = convertIntToNumber(document.gplanBProspectsNeededetElementById("planBMonths").value); // i
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

