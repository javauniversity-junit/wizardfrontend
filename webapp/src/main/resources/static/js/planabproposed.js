function calculatePlanDaily () {
	//clear
	console.clear();

	var planMonthly = document.getElementById("planAMonthly").value;
	planMonthly_unformatted = planMonthly.replace(/\,/g, "");
	planMonthly_unformatted = planMonthly.replace(/\$/g, "");		
    //var planDaily = formatCurrency(Math.round(planMonthly_unformatted / 30));
	var planDaily = Math.round(planMonthly_unformatted / 30)
    document.getElementById("planADaily").value = FormatAmount(planDaily);
    
}

function calculate() {
	var planAFrequency = document.getElementById("planAFrequency").value;
	document.getElementById("planAFrequency").value = Math.round(planAFrequency * 10) / 10;    
}

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
	if(s.indexOf('.') > 0) { s = s.substr(0,s.indexOf('.')); }
	s = "$" + s.replace(/\B(?=(\d{3})+(?!\d))/g, ",");
	return s;
}
function totalRow() {
	calculatePlanDaily();
	calculate();
}
/* tinas */
function CommaFormatted(amount) {
	
	return amount;
}