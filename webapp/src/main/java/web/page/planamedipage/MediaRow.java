package web.page.planamedipage;

public class MediaRow {
	private String name;
	private double jan;
	private double feb;
	private double mar;
	private double apr; 
	private double may;
	private double jun;
	private double jul;
	private double aug;
	private double sep;
	private double oct; 
	private double nov;
	private double dec;
	private String janStr;
	private String febStr;
	private String marStr;
	private String aprStr; 
	private String mayStr;
	private String junStr;
	private String julStr;
	private String augStr;
	private String sepStr;
	public MediaRow(String janStr, String febStr, String marStr, String aprStr, String mayStr, String junStr,
			String julStr, String augStr, String sepStr, String octStr, String novStr, String decStr) {
		super();
		this.janStr = janStr;
		this.febStr = febStr;
		this.marStr = marStr;
		this.aprStr = aprStr;
		this.mayStr = mayStr;
		this.junStr = junStr;
		this.julStr = julStr;
		this.augStr = augStr;
		this.sepStr = sepStr;
		this.octStr = octStr;
		this.novStr = novStr;
		this.decStr = decStr;
	}
	public double getSep() {
		return sep;
	}
	public void setSep(double sep) {
		this.sep = sep;
	}
	private String octStr; 
	private String novStr;
	private String decStr;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getJan() {
		return jan;
	}
	public void setJan(double jan) {
		this.jan = jan;
	}
	public double getFeb() {
		return feb;
	}
	public void setFeb(double feb) {
		this.feb = feb;
	}
	public double getMar() {
		return mar;
	}
	public void setMar(double mar) {
		this.mar = mar;
	}
	public double getApr() {
		return apr;
	}
	public void setApr(double apr) {
		this.apr = apr;
	}
	public double getMay() {
		return may;
	}
	public void setMay(double may) {
		this.may = may;
	}
	public double getJun() {
		return jun;
	}
	public void setJun(double jun) {
		this.jun = jun;
	}
	public double getJul() {
		return jul;
	}
	public void setJul(double jul) {
		this.jul = jul;
	}
	public double getAug() {
		return aug;
	}
	public void setAug(double aug) {
		this.aug = aug;
	}
	public double getOct() {
		return oct;
	}
	public void setOct(double oct) {
		this.oct = oct;
	}
	public double getNov() {
		return nov;
	}
	public void setNov(double nov) {
		this.nov = nov;
	}
	public double getDec() {
		return dec;
	}
	public void setDec(double dec) {
		this.dec = dec;
	}
	
	
}