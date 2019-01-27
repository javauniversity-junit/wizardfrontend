package web.page.presentedtopage;

public class PresentedToPageModel {

	
	public PresentedToPageModel(String phoneNumber, String presentedTo, String presentedBusiness, String presentedBy) {
		super();
		this.phoneNumber = phoneNumber;
		this.presentedTo = presentedTo;
		this.presentedBusiness = presentedBusiness;
		this.presentedBy = presentedBy;
	}

	private String phoneNumber;
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	private String presentedTo;
	private String presentedBusiness;
	private String presentedBy;
	public String getPresentedTo() {
		return presentedTo;
	}
	public void setPresentedTo(String presentedTo) {
		this.presentedTo = presentedTo;
	}
	public String getPresentedBusiness() {
		return presentedBusiness;
	}
	public void setPresentedBusiness(String presentedBusiness) {
		this.presentedBusiness = presentedBusiness;
	}
	public String getPresentedBy() {
		return presentedBy;
	}
	public void setPresentedBy(String presentedBy) {
		this.presentedBy = presentedBy;
	}
	

}
