function calculate()
{
	
	var planAAverageSale = convertToNumberFromCurrency(document.getElementById("planAAverageSale").value); // a
	var planAGrossMargin = document.getElementById("planAGrossMargin").value; // b
	var planAClosingPct = document.getElementById("planAClosingPct").value; // c 
	var planAProspectValue = 0;
	
	if (document.getElementById("planAGrossMargin").value != null &&
		document.getElementById("planAGrossMargin").value != ""	&&
		document.getElementById("planAClosingPct").value != null &&
		document.getElementById("planAClosingPct").value != "")
	{
		    planAProspectValue= FormatAmount(Math.round(planAAverageSale * (planAGrossMargin/100) * (planAClosingPct/100)));
	}
	
	document.getElementById("planAProspectValue").value =  planAProspectValue;

	document.getElementById("planAInvestment").value =  document.getElementById("planAProposedPage_planAMonthly").value;
	
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
	
	
	
	/*	
	var planAGrossMargin = 0;
	if (document.getElementById("planAGrossMargin").value.trim().length() > 0)
	{ 
		planAGrossMargin = convertToNumberFromCurrency(document.getElementById("planAGrossMargin").value); // b 
	}
	
	var planAClosingPct = 0;
	if (document.getElementById("planAClosingPct").value.trim().length() > 0)
	{ 
		planAClosingPct = convertIntToNumber(document.getElementById("planAClosingPct").value); // c 
	}
	
	var planAProspectValue = planAAverageSale * (planAGrossMargin) ; // d = abc
*/	
	
/*
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
*/
}


function totalRow() {
	calculate();
	//document.getElementById("totalRow").value = total;
}
