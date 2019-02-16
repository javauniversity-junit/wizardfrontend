const map = new Map();
map.set('introduceNewDepartment', 'Introduce New Department/Products/Services');
map.set('featureSpecificProductsLabel', 'Feature Specific Products/Services');
map.set('callAttentiontoBrandsPrivateLabelsCarried', 'Call Attention to Brands/Private Labels Carried');
map.set('promoteOffPriceItemsServices', 'Promote Off-price Items/Services');

/*
map.set('introduceNewDepartment', 'Introduce New Department/Products/Services');
map.set('introduceNewDepartment', 'Introduce New Department/Products/Services');
map.set('introduceNewDepartment', 'Introduce New Department/Products/Services');
map.set('introduceNewDepartment', 'Introduce New Department/Products/Services');
map.set('introduceNewDepartment', 'Introduce New Department/Products/Services');
map.set('introduceNewDepartment', 'Introduce New Department/Products/Services');
map.set('introduceNewDepartment', 'Introduce New Department/Products/Services');
map.set('introduceNewDepartment', 'Introduce New Department/Products/Services');
map.set('introduceNewDepartment', 'Introduce New Department/Products/Services');
map.set('introduceNewDepartment', 'Introduce New Department/Products/Services');
map.set('introduceNewDepartment', 'Introduce New Department/Products/Services');
map.set('introduceNewDepartment', 'Introduce New Department/Products/Services');
map.set('introduceNewDepartment', 'Introduce New Department/Products/Services');
map.set('introduceNewDepartment', 'Introduce New Department/Products/Services');
map.set('introduceNewDepartment', 'Introduce New Department/Products/Services');
map.set('introduceNewDepartment', 'Introduce New Department/Products/Services');
map.set('introduceNewDepartment', 'Introduce New Department/Products/Services');
map.set('introduceNewDepartment', 'Introduce New Department/Products/Services');
map.set('introduceNewDepartment', 'Introduce New Department/Products/Services');
map.set('introduceNewDepartment', 'Introduce New Department/Products/Services');
*/

function addLabel(key) {
	
	var keyvalue = map.get(key);
	document.getElementById(key).innerHTML = keyvalue;
	
}