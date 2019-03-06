package web.page.strategicmarketingpagetwo;

public class StrategicMarketingPageTwoModel {
	private String competitionA;
	private String CompetitionB;
	private String CompetitionStrengthA;
	public StrategicMarketingPageTwoModel(String competitionA, String competitionB, String competitionStrengthA,
			String competitionStrengthB, String competitionWeaknessA, String competitionWeaknessB,
			String companyNameProjectImage, String currentCompanySlogan, boolean companySloganProjectImage) {
		super();
		this.competitionA = competitionA;
		CompetitionB = competitionB;
		CompetitionStrengthA = competitionStrengthA;
		CompetitionStrengthB = competitionStrengthB;
		CompetitionWeaknessA = competitionWeaknessA;
		CompetitionWeaknessB = competitionWeaknessB;
		CompanyNameProjectImage = companyNameProjectImage;
		CurrentCompanySlogan = currentCompanySlogan;
		this.companySloganProjectImage = companySloganProjectImage;
	}
	private String CompetitionStrengthB;
	private String CompetitionWeaknessA;
	private String CompetitionWeaknessB;
	private String CompanyNameProjectImage;
	private String CurrentCompanySlogan;
	public String getCompetitionA() {
		return competitionA;
	}
	public void setCompetitionA(String competitionA) {
		this.competitionA = competitionA;
	}
	public String getCompetitionB() {
		return CompetitionB;
	}
	public void setCompetitionB(String competitionB) {
		CompetitionB = competitionB;
	}
	public String getCompetitionStrengthA() {
		return CompetitionStrengthA;
	}
	public void setCompetitionStrengthA(String competitionStrengthA) {
		CompetitionStrengthA = competitionStrengthA;
	}
	public String getCompetitionStrengthB() {
		return CompetitionStrengthB;
	}
	public void setCompetitionStrengthB(String competitionStrengthB) {
		CompetitionStrengthB = competitionStrengthB;
	}
	public String getCompetitionWeaknessA() {
		return CompetitionWeaknessA;
	}
	public void setCompetitionWeaknessA(String competitionWeaknessA) {
		CompetitionWeaknessA = competitionWeaknessA;
	}
	public String getCompetitionWeaknessB() {
		return CompetitionWeaknessB;
	}
	public void setCompetitionWeaknessB(String competitionWeaknessB) {
		CompetitionWeaknessB = competitionWeaknessB;
	}
	public String getCompanyNameProjectImage() {
		return CompanyNameProjectImage;
	}
	public void setCompanyNameProjectImage(String companyNameProjectImage) {
		CompanyNameProjectImage = companyNameProjectImage;
	}
	public String getCurrentCompanySlogan() {
		return CurrentCompanySlogan;
	}
	public void setCurrentCompanySlogan(String currentCompanySlogan) {
		CurrentCompanySlogan = currentCompanySlogan;
	}
	public boolean isCompanySloganProjectImage() {
		return companySloganProjectImage;
	}
	public void setCompanySloganProjectImage(boolean companySloganProjectImage) {
		this.companySloganProjectImage = companySloganProjectImage;
	}
	private boolean companySloganProjectImage;

}
