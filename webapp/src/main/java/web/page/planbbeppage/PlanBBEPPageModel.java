package web.page.planbbeppage;

public class PlanBBEPPageModel {
	private String PlanBAverageSale;
	private int PlanBGrossMargin;
	private int PlanBClosingPct;
	private int PlanBProspectValue;
	
	private int PlanBInvestment;
	private int PlanBProspectsNeeded;
	private int PlanBProspectSalesNeeded;
	
	private int PlanBGrossProfitOnSales;
	private int PlanBMonths;
	private int PlanBAdditionalGrossSales;
	
	
	
	public PlanBBEPPageModel(String PlanBAverageSale, int PlanBGrossMargin, int PlanBClosingPct, int PlanBProspectValue,
			int PlanBInvestment, int PlanBProspectsNeeded, int PlanBProspectSalesNeeded, int PlanBGrossProfitOnSales,
			int PlanBMonths, int PlanBAdditionalGrossSales) {
		super();
		this.PlanBAverageSale = PlanBAverageSale;
		this.PlanBGrossMargin = PlanBGrossMargin;
		this.PlanBClosingPct = PlanBClosingPct;
		this.PlanBProspectValue = PlanBProspectValue;
		this.PlanBInvestment = PlanBInvestment;
		this.PlanBProspectsNeeded = PlanBProspectsNeeded;
		this.PlanBProspectSalesNeeded = PlanBProspectSalesNeeded;
		this.PlanBGrossProfitOnSales = PlanBGrossProfitOnSales;
		this.PlanBMonths = PlanBMonths;
		this.PlanBAdditionalGrossSales = PlanBAdditionalGrossSales;
	}
	
	public String getPlanBAverageSale() {
		return PlanBAverageSale;
	}
	public void setPlanBAverageSale(String PlanBAverageSale) {
		this.PlanBAverageSale = PlanBAverageSale;
	}
	public int getPlanBGrossMargin() {
		return PlanBGrossMargin;
	}
	public void setPlanBGrossMargin(int PlanBGrossMargin) {
		this.PlanBGrossMargin = PlanBGrossMargin;
	}
	public int getPlanBClosingPct() {
		return PlanBClosingPct;
	}
	public void setPlanBClosingPct(int PlanBClosingPct) {
		this.PlanBClosingPct = PlanBClosingPct;
	}
	public int getPlanBProspectValue() {
		return PlanBProspectValue;
	}
	public void setPlanBProspectValue(int PlanBProspectValue) {
		this.PlanBProspectValue = PlanBProspectValue;
	}
	public int getPlanBInvestment() {
		return PlanBInvestment;
	}
	public void setPlanBInvestment(int PlanBInvestment) {
		this.PlanBInvestment = PlanBInvestment;
	}
	public int getPlanBProspectsNeeded() {
		return PlanBProspectsNeeded;
	}
	public void setPlanBProspectsNeeded(int PlanBProspectsNeeded) {
		this.PlanBProspectsNeeded = PlanBProspectsNeeded;
	}
	public int getPlanBProspectSalesNeeded() {
		return PlanBProspectSalesNeeded;
	}
	public void setPlanBProspectSalesNeeded(int PlanBProspectSalesNeeded) {
		this.PlanBProspectSalesNeeded = PlanBProspectSalesNeeded;
	}
	public int getPlanBGrossProfitOnSales() {
		return PlanBGrossProfitOnSales;
	}
	public void setPlanBGrossProfitOnSales(int PlanBGrossProfitOnSales) {
		this.PlanBGrossProfitOnSales = PlanBGrossProfitOnSales;
	}
	public int getPlanBMonths() {
		return PlanBMonths;
	}
	public void setPlanBMonths(int PlanBMonths) {
		this.PlanBMonths = PlanBMonths;
	}
	public int getPlanBAdditionalGrossSales() {
		return PlanBAdditionalGrossSales;
	}
	public void setPlanBAdditionalGrossSales(int PlanBAdditionalGrossSales) {
		this.PlanBAdditionalGrossSales = PlanBAdditionalGrossSales;
	}
	
	

}
