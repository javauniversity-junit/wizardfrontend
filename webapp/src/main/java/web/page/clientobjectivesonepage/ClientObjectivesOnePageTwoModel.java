package web.page.clientobjectivesonepage;

public class ClientObjectivesOnePageTwoModel {
	private String key;
	private int sortOrder;
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public int getSortOrder() {
		return sortOrder;
	}
	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}
	public ClientObjectivesOnePageTwoModel(String key, int sortOrder) {
		super();
		this.key = key;
		this.sortOrder = sortOrder;
	}
	

}