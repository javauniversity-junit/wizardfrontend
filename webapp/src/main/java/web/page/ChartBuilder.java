package web.page;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.logging.Logger;

import web.page.confidentialclientevaluationnonepage.ConfidentialClientEvaluationOnePageModel;

public class ChartBuilder {
	
private static final Logger mLog = Logger.getLogger(ChartBuilder.class.getName());

 public static List<PieChart> buildLastYearConfidentialClientEvaluation(ConfidentialClientEvaluationOnePageModel model) {
	List<PieChart> pieCharts = new ArrayList<PieChart>();
	if (model.getLastYearLabel1() != null && model.getLastYearValue1() != null) {
		//amount
		try {
			
		int amount = 	parse(model.getLastYearValue1());
		PieChart pieChart = new PieChart(model.getLastYearLabel1(),amount);
		mLog.info(" add to piechart [" + model.getLastYearLabel1() + "]");
		pieCharts.add(pieChart);	
			
		} catch (Exception ex) {
			mLog.error("Could not parse amount [" + model.getLastYearValue1() + "]"); 
		}
		
	}
	 
	if (model.getLastYearLabel2() != null && model.getLastYearValue2() != null) {
		//amount
		try {
			
		int amount = 	parse(model.getLastYearValue2());
		PieChart pieChart = new PieChart(model.getLastYearLabel2(),amount);
		pieCharts.add(pieChart);	
			
		} catch (Exception ex) {
		}
		
	} 
	
	return pieCharts;
 }
 public void buildNextYearConfidentialClientEvaluation(ConfidentialClientEvaluationOnePageModel model) {
	 
 }
 
private  static int parse(final String amount) throws ParseException {
	    final NumberFormat format = NumberFormat.getNumberInstance( Locale.US);
	    if (format instanceof DecimalFormat) {
	        ((DecimalFormat) format).setParseBigDecimal(true);
	    }
	    int convertedAmount = (Integer) format.parse(amount.replaceAll("[^\\d.,]",""));
	    return convertedAmount;
	}
}
