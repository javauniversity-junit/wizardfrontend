package web.page.planBBEPPage;

public class PlanBBEPPageModel {
	private String planBAverageSale;
	private int planBGrossMargin;
	private int planBClosingPct;
	private int planBProspectValue;
	
	private int planBInvestment;
	private int planBProspectsNeeded;
	private int planBProspectSalesNeeded;
	
	private int planBGrossProfitOnSales;
	private int planBMonths;
	private int planBAdditionalGrossSales;
	
	public PlanBBEPPageModel(String planBAverageSale, int planBGrossMargin, int planBClosingPct, int planBProspectValue,
			int planBInvestment, int planBProspectsNeeded, int planBProspectSalesNeeded, int planBGrossProfitOnSales,
			int planBMonths, int planBAdditionalGrossSales) {
		super();
		this.planBAverageSale = planBAverageSale;
		this.planBGrossMargin = planBGrossMargin;
		this.planBClosingPct = planBClosingPct;
		this.planBProspectValue = planBProspectValue;
		this.planBInvestment = planBInvestment;
		this.planBProspectsNeeded = planBProspectsNeeded;
		this.planBProspectSalesNeeded = planBProspectSalesNeeded;
		this.planBGrossProfitOnSales = planBGrossProfitOnSales;
		this.planBMonths = planBMonths;
		this.planBAdditionalGrossSales = planBAdditionalGrossSales;
	}
	
	public String getPlanBAverageSale() {
		return planBAverageSale;
	}
	public void setPlanBAverageSale(String planBAverageSale) {
		this.planBAverageSale = planBAverageSale;
	}
	public int getPlanBGrossMargin() {
		return planBGrossMargin;
	}
	public void setPlanBGrossMargin(int planBGrossMargin) {
		this.planBGrossMargin = planBGrossMargin;
	}
	public int getPlanBClosingPct() {
		return planBClosingPct;
	}
	public void setPlanBClosingPct(int planBClosingPct) {
		this.planBClosingPct = planBClosingPct;
	}
	public int getPlanBProspectValue() {
		return planBProspectValue;
	}
	public void setPlanBProspectValue(int planBProspectValue) {
		this.planBProspectValue = planBProspectValue;
	}
	public int getPlanBInvestment() {
		return planBInvestment;
	}
	public void setPlanBInvestment(int planBInvestment) {
		this.planBInvestment = planBInvestment;
	}
	public int getPlanBProspectsNeeded() {
		return planBProspectsNeeded;
	}
	public void setPlanBProspectsNeeded(int planBProspectsNeeded) {
		this.planBProspectsNeeded = planBProspectsNeeded;
	}
	public int getPlanBProspectSalesNeeded() {
		return planBProspectSalesNeeded;
	}
	public void setPlanBProspectSalesNeeded(int planBProspectSalesNeeded) {
		this.planBProspectSalesNeeded = planBProspectSalesNeeded;
	}
	public int getPlanBGrossProfitOnSales() {
		return planBGrossProfitOnSales;
	}
	public void setPlanBGrossProfitOnSales(int planBGrossProfitOnSales) {
		this.planBGrossProfitOnSales = planBGrossProfitOnSales;
	}
	public int getPlanBMonths() {
		return planBMonths;
	}
	public void setPlanBMonths(int planBMonths) {
		this.planBMonths = planBMonths;
	}
	public int getPlanBAdditionalGrossSales() {
		return planBAdditionalGrossSales;
	}
	public void setPlanBAdditionalGrossSales(int planBAdditionalGrossSales) {
		this.planBAdditionalGrossSales = planBAdditionalGrossSales;
	}
	
}
