package web.page.planamedipage;
import java.text.ParseException;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import web.page.ChartBuilder;
public class MediaChartHelper {
public static MediaChart generate(PlanMediaPageModel planMediaPageModel) {
	
	int jan =0,feb =0,mar=0,apr=0,may=0,jun=0,jul=0,aug=0,sep=0,oct=0,nov=0,dec=0;
	MediaChart mediaChart = new MediaChart("green", "green", "green", "green", "green",
			"green", "green", "green", "green", "green", "green",
			"green");
	final ArrayList<MediaRow> mediaRows = new Gson().fromJson(planMediaPageModel.getMediaRows(), ArrayList.class);
	for (MediaRow mediaRow : mediaRows) {
		try {
			jan = jan + ChartBuilder.parse(mediaRow.getJanStr());
			feb = feb + ChartBuilder.parse(mediaRow.getFebStr());
			mar = mar + ChartBuilder.parse(mediaRow.getMarStr());
			apr = apr + ChartBuilder.parse(mediaRow.getAprStr());
			may = may + ChartBuilder.parse(mediaRow.getMayStr());
			jun = jun + ChartBuilder.parse(mediaRow.getJunStr());
			jul = jul + ChartBuilder.parse(mediaRow.getJulStr());
			aug = aug + ChartBuilder.parse(mediaRow.getAugStr());
			sep = sep + ChartBuilder.parse(mediaRow.getSepStr());
			oct = oct + ChartBuilder.parse(mediaRow.getOctStr());
			nov = nov + ChartBuilder.parse(mediaRow.getNovStr());
			dec = dec + ChartBuilder.parse(mediaRow.getDecStr());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	mediaChart.setJan(jan);
	mediaChart.setFeb(feb);
	mediaChart.setApr(apr);
	mediaChart.setMar(mar);
	mediaChart.setJun(jun);
	mediaChart.setJul(jul);
	mediaChart.setAug(aug);
	mediaChart.setSep(sep);
	mediaChart.setOct(oct);
	mediaChart.setNov(nov);
	mediaChart.setDec(dec);
	
	if (planMediaPageModel.getJanType().equalsIgnoreCase("Base")) {
		mediaChart.setJanColor("blue");
	}
	if (planMediaPageModel.getFebType().equalsIgnoreCase("Base")) {
		mediaChart.setFebColor("blue");
	}
	if (planMediaPageModel.getMarType().equalsIgnoreCase("Base")) {
		mediaChart.setMarColor("blue");
	}
	if (planMediaPageModel.getAprType().equalsIgnoreCase("Base")) {
		mediaChart.setAprColor("blue");
	}
	if (planMediaPageModel.getMayType().equalsIgnoreCase("Base")) {
		mediaChart.setMayColor("blue");
	}
	if (planMediaPageModel.getJunType().equalsIgnoreCase("Base")) {
		mediaChart.setJunColor("blue");
	}
	if (planMediaPageModel.getJulType().equalsIgnoreCase("Base")) {
		mediaChart.setJulColor("blue");
	}
	if (planMediaPageModel.getAugType().equalsIgnoreCase("Base")) {
		mediaChart.setAugColor("blue");
	}
	if (planMediaPageModel.getSeptType().equalsIgnoreCase("Base")) {
		mediaChart.setSepColor("blue");
	}
	if (planMediaPageModel.getOctType().equalsIgnoreCase("Base")) {
		mediaChart.setOctColor("blue");
	}
	if (planMediaPageModel.getNovType().equalsIgnoreCase("Base")) {
		mediaChart.setNovColor("blue");
	}
	if (planMediaPageModel.getDecType().equalsIgnoreCase("Base")) {
		mediaChart.setJanColor("blue");
	}
	
	if (planMediaPageModel.getJanType().equalsIgnoreCase("Slow")) {
		mediaChart.setJanColor("red");
	}
	if (planMediaPageModel.getFebType().equalsIgnoreCase("Slow")) {
		mediaChart.setFebColor("red");
	}
	if (planMediaPageModel.getMarType().equalsIgnoreCase("Slow")) {
		mediaChart.setMarColor("red");
	}
	if (planMediaPageModel.getAprType().equalsIgnoreCase("Slow")) {
		mediaChart.setAprColor("red");
	}
	if (planMediaPageModel.getMayType().equalsIgnoreCase("Slow")) {
		mediaChart.setMayColor("red");
	}
	if (planMediaPageModel.getJunType().equalsIgnoreCase("Slow")) {
		mediaChart.setJunColor("blue");
	}
	if (planMediaPageModel.getJulType().equalsIgnoreCase("Slow")) {
		mediaChart.setJulColor("red");
	}
	if (planMediaPageModel.getAugType().equalsIgnoreCase("Slow")) {
		mediaChart.setAugColor("red");
	}
	if (planMediaPageModel.getSeptType().equalsIgnoreCase("Slow")) {
		mediaChart.setSepColor("red");
	}
	if (planMediaPageModel.getOctType().equalsIgnoreCase("Slow")) {
		mediaChart.setOctColor("red");
	}
	if (planMediaPageModel.getNovType().equalsIgnoreCase("Slow")) {
		mediaChart.setNovColor("red");
	}
	if (planMediaPageModel.getDecType().equalsIgnoreCase("Slow")) {
		mediaChart.setJanColor("red");
	}
	
	
	return mediaChart;
}
}
