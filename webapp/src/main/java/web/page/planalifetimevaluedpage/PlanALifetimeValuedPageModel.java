package web.page.planalifetimevaluedpage;

public class PlanALifetimeValuedPageModel {
	private String averageSale;
	private int grossProfitMargin;
	private int averageRepeatSales;
	private int yearsOfPatronage;
	
	private String grossProfitPerSale;
	private String averageCustomerValue;
	private String lifetimeValuePerCustomer;
	
	private int monthlyInvestmentAverage;
	private String prospectsNeededToBreakEven;
	
	public PlanALifetimeValuedPageModel(String averageSale, int grossProfitMargin, int averageRepeatSales,
			int yearsOfPatronage) {
		super();
		this.averageSale = averageSale;
		this.grossProfitMargin = grossProfitMargin;
		this.averageRepeatSales = averageRepeatSales;
		this.yearsOfPatronage = yearsOfPatronage;
	}
	public String getAverageSale() {
		return averageSale;
	}
	public void setAverageSale(String averageSale) {
		this.averageSale = averageSale;
	}
	public int getGrossProfitMargin() {
		return grossProfitMargin;
	}
	public void setGrossProfitMargin(int grossProfitMargin) {
		this.grossProfitMargin = grossProfitMargin;
	}
	public int getAverageRepeatSales() {
		return averageRepeatSales;
	}
	public void setAverageRepeatSales(int averageRepeatSales) {
		this.averageRepeatSales = averageRepeatSales;
	}
	public int getYearsOfPatronage() {
		return yearsOfPatronage;
	}
	public void setYearsOfPatronage(int yearsOfPatronage) {
		this.yearsOfPatronage = yearsOfPatronage;
	}

}
