package web.page.strategicmarketingpagethree;

public class StrategicMarketingHelper {

	
	public static String months (StrategicMarketingPageThreeModel strategicMarketingPageThreeModel) {
		StringBuilder builder = new StringBuilder();
		boolean jan = strategicMarketingPageThreeModel.isPoorestJanuary();
		boolean feb = strategicMarketingPageThreeModel.isPoorestFebruary();
		boolean mar = strategicMarketingPageThreeModel.isPoorestMarch();
		boolean apr = strategicMarketingPageThreeModel.isPoorestApril();
		boolean may = strategicMarketingPageThreeModel.isPoorestMay();
		boolean jun = strategicMarketingPageThreeModel.isPoorestJune();
		
		
		
		
		if (jan) {
			builder.append("January");
		}
		if (feb) {
			if (jan) {
				builder.append(",February");
			} else {
				builder.append("February");
			}
			
		}	
		
		if (mar) {
			if (jan || feb ) {
				builder.append(",March");
			} else {
				builder.append("March");
			}
			
		}	
		
		
		if (apr) {
			if (jan || feb || mar) {
				builder.append(",April");
			} else {
				builder.append("April");
			}
			
		}
		
		if (may) {
			if (jan || feb || mar || apr) {
				builder.append(",May");
			} else {
				builder.append("May");
			}
			
		}
		return builder.toString();
	}
}
