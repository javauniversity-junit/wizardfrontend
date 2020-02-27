package web.page.strategicmarketingpagethree;

import java.util.logging.Logger;

import web.page.PublishController;

public class StrategicMarketingHelper {

	private static final Logger mLog = Logger.getLogger(StrategicMarketingHelper.class.getName());
	public static String poorestMonths (StrategicMarketingPageThreeModel strategicMarketingPageThreeModel) {
		StringBuilder builder = new StringBuilder();
		boolean jan = strategicMarketingPageThreeModel.isPoorestJanuary();
		boolean feb = strategicMarketingPageThreeModel.isPoorestFebruary();
		boolean mar = strategicMarketingPageThreeModel.isPoorestMarch();
		boolean apr = strategicMarketingPageThreeModel.isPoorestApril();
		boolean may = strategicMarketingPageThreeModel.isPoorestMay();
		boolean jun = strategicMarketingPageThreeModel.isPoorestJune();
		boolean jul = strategicMarketingPageThreeModel.isPoorestJuly();
		boolean aug = strategicMarketingPageThreeModel.isPoorestAugust();
		boolean sep = strategicMarketingPageThreeModel.isPoorestSeptember();
		boolean oct = strategicMarketingPageThreeModel.isPoorestOctober();
		boolean nov = strategicMarketingPageThreeModel.isPoorestNovember();
		boolean dec = strategicMarketingPageThreeModel.isPoorestDecember();
		mLog.info("jan " + jan);
		mLog.info("feb " + feb);
		
		if (jan) {
			builder.append("January");
		}
		
		mLog.info("builder " + builder.toString());
		if (feb) {
			if (jan) {
				builder.append(",February");
			} else {
				builder.append("February");
			}
			
		}	
		mLog.info("builder " + builder.toString());
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
		
		if (jun) {
			if (jan || feb || mar || apr || may) {
				builder.append(",June");
			} else {
				builder.append("June");
			}
			
		}
		if (jul) {
			if (jan || feb || mar || apr || may|| jun) {
				builder.append(",July");
			} else {
				builder.append("July");
			}
			
		}
		
		if (aug) {
			if (jan || feb || mar || apr || may|| jun|| jul) {
				builder.append(",August");
			} else {
				builder.append("August");
			}
			
		}
		
		if (sep) {
			if (jan || feb || mar || apr || may|| jun|| jul|| aug) {
				builder.append(",September");
			} else {
				builder.append("September");
			}
			
		}
		
		if (oct) {
			if (jan || feb || mar || apr || may|| jun|| jul|| aug||sep) {
				builder.append(",October");
			} else {
				builder.append("October");
			}
			
		}
		
		if (nov) {
			if (jan || feb || mar || apr || may|| jun|| jul|| aug||sep||oct) {
				builder.append(",November");
			} else {
				builder.append("November");
			}
			
		}
		
		if (dec) {
			if (jan || feb || mar || apr || may|| jun|| jul|| aug||sep||oct||nov) {
				builder.append(",December");
			} else {
				builder.append("December");
			}
			
		}
		
		return builder.toString();
	}
}
