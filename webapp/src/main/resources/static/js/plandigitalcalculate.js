

function calculate()
{
	var planAMonthlyDigitalInvestment = document.getElementById("planAMonthlyDigitalInvestment").value;
	var planACostPerThousand = document.getElementById("planACostPerThousand").value;
	var planAClickThroughRate = document.getElementById("planAClickThroughRate").value;
	var planASalesConversionPercentage = = document.getElementById("planASalesConversionPercentage").value;
	//alert ("averageRepeatSales " + averageRepeatSales);
	
	var planAProjectedGrossProfit = document.getElementById("planAProjectedGrossProfit").value;
	var monthlyInvestmentAverage= document.getElementById("monthlyInvestmentAverage").value;
	var planAMonthlyDigitalInvestmentCal =0;
	var planACostPerThousandCal =0;
	var planAClickThroughRateCal =0;
	var planASalesConversionPercentageCal =0;
	var monthlyInvestmentAverageCal = 0;
	var planAMonthlyDigitalInvestmentCal = 0;
	
	
	if (planAMonthlyDigitalInvestment != null) {
		planAMonthlyDigitalInvestment = planAMonthlyDigitalInvestment.substring(1);
		planAMonthlyDigitalInvestment = removeComma(planAMonthlyDigitalInvestment);;
		planAMonthlyDigitalInvestmentCal = Number(planAMonthlyDigitalInvestment);
	}
	
	if (planAMonthlyDigitalInvestment != null) {
		planAMonthlyDigitalInvestment = planAMonthlyDigitalInvestment.substring(1);
		planAMonthlyDigitalInvestment = removeComma(planAMonthlyDigitalInvestment);;
		planAMonthlyDigitalInvestmentCal = Number(planAMonthlyDigitalInvestment);
	}
	
	
	if (monthlyInvestmentAverage != null) {
		monthlyInvestmentAverage = monthlyInvestmentAverage.substring(1);
		monthlyInvestmentAverage = removeComma(monthlyInvestmentAverage);;
		monthlyInvestmentAverageCal = Number(monthlyInvestmentAverage);
	}
	
	if (planASalesConversionPercentage != null) {
		planASalesConversionPercentageCal = Number(planASalesConversionPercentage);
		planASalesConversionPercentageCal = planASalesConversionPercentageCal/100;
	}	
	
	if (planACostPerThousand != null) {
		planACostPerThousandCal = Number(planACostPerThousand);
		planACostPerThousandCal = planACostPerThousandCal/100;
	}
	
	if (planAClickThroughRate != null) {
		planAClickThroughRateCal = Number(planAClickThroughRate)/100;
	}
	
	var c_planAClosingPctNumber = (planAMonthlyDigitalInvestmentCal / planACostPerThousandCal) * 1000;
	var e_planAMonthlyClicks = c_planAClosingPctNumber *  planAClickThroughRateCal;
	var f_planACostPerClicks = planAMonthlyDigitalInvestmentCal/e_averageCustomerValue;
	var h_planAMonthlyConversions = e_planAMonthlyClicks * planASalesConversionPercentageCal;
	var i_prospectsNeededToBreakEven = Math.round(g_lifetimeValuePerCustomer * monthlyInvestmentAverageCal);
	console.log(" c_planAClosingPctNumber " +  c_planAClosingPctNumber);
	console.log(" e_planAMonthlyClicks " +  e_planAMonthlyClicks);
	console.log(" f_planACostPerClicks " +  f_planACostPerClicks);
	console.log("h_planAMonthlyConversions " +  h_planAMonthlyConversions);
	console.log("i_prospectsNeededToBreakEven " +  i_prospectsNeededToBreakEven);
	
	document.getElementById("planAClosingPctNumber").value =  c_planAClosingPctNumber;
	document.getElementById("planAMonthlyClicks").value = e_planAMonthlyClicks;//e
	document.getElementById("planACostPerClicks").value = f_planACostPerClicks;
	document.getElementById("planAMonthlyConversions").value = h_planAMonthlyConversions;
}


function totalRow() {
	calculate();
	//document.getElementById("totalRow").value = total;
}
