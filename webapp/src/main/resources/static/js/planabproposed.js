function calculatePlanDaily () {

	//clear
	console.clear();
	
	var planMonthly = document.getElementById("planAMonthly").value;
    var planDaily = Math.Round(planMonthly / 30);
    document.getElementById("pctWomen").value = planDaily;
}