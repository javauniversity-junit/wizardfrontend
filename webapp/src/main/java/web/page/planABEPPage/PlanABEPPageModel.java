package web.page.planABEPPage;

public class PlanABEPPageModel {
	private String planAAverageSale;
	private int planAGrossMargin;
	private int planAClosingPct;
	private int planAProspectValue;
	
	private int planAInvestment;
	private int planAProspectsNeeded;
	private int planAProspectSalesNeeded;
	
	private int planAGrossProfitOnSales;
	private int planAMonths;
	private int planAAdditionalGrossSales;
	
	
	
	public PlanABEPPageModel(String planAAverageSale, int planAGrossMargin, int planAClosingPct, int planAProspectValue,
			int planAInvestment, int planAProspectsNeeded, int planAProspectSalesNeeded, int planAGrossProfitOnSales,
			int planAMonths, int planAAdditionalGrossSales) {
		super();
		this.planAAverageSale = planAAverageSale;
		this.planAGrossMargin = planAGrossMargin;
		this.planAClosingPct = planAClosingPct;
		this.planAProspectValue = planAProspectValue;
		this.planAInvestment = planAInvestment;
		this.planAProspectsNeeded = planAProspectsNeeded;
		this.planAProspectSalesNeeded = planAProspectSalesNeeded;
		this.planAGrossProfitOnSales = planAGrossProfitOnSales;
		this.planAMonths = planAMonths;
		this.planAAdditionalGrossSales = planAAdditionalGrossSales;
	}
	
	public String getPlanAAverageSale() {
		return planAAverageSale;
	}
	public void setPlanAAverageSale(String planAAverageSale) {
		this.planAAverageSale = planAAverageSale;
	}
	public int getPlanAGrossMargin() {
		return planAGrossMargin;
	}
	public void setPlanAGrossMargin(int planAGrossMargin) {
		this.planAGrossMargin = planAGrossMargin;
	}
	public int getPlanAClosingPct() {
		return planAClosingPct;
	}
	public void setPlanAClosingPct(int planAClosingPct) {
		this.planAClosingPct = planAClosingPct;
	}
	public int getPlanAProspectValue() {
		return planAProspectValue;
	}
	public void setPlanAProspectValue(int planAProspectValue) {
		this.planAProspectValue = planAProspectValue;
	}
	public int getPlanAInvestment() {
		return planAInvestment;
	}
	public void setPlanAInvestment(int planAInvestment) {
		this.planAInvestment = planAInvestment;
	}
	public int getPlanAProspectsNeeded() {
		return planAProspectsNeeded;
	}
	public void setPlanAProspectsNeeded(int planAProspectsNeeded) {
		this.planAProspectsNeeded = planAProspectsNeeded;
	}
	public int getPlanAProspectSalesNeeded() {
		return planAProspectSalesNeeded;
	}
	public void setPlanAProspectSalesNeeded(int planAProspectSalesNeeded) {
		this.planAProspectSalesNeeded = planAProspectSalesNeeded;
	}
	public int getPlanAGrossProfitOnSales() {
		return planAGrossProfitOnSales;
	}
	public void setPlanAGrossProfitOnSales(int planAGrossProfitOnSales) {
		this.planAGrossProfitOnSales = planAGrossProfitOnSales;
	}
	public int getPlanAMonths() {
		return planAMonths;
	}
	public void setPlanAMonths(int planAMonths) {
		this.planAMonths = planAMonths;
	}
	public int getPlanAAdditionalGrossSales() {
		return planAAdditionalGrossSales;
	}
	public void setPlanAAdditionalGrossSales(int planAAdditionalGrossSales) {
		this.planAAdditionalGrossSales = planAAdditionalGrossSales;
	}
	
	

}
