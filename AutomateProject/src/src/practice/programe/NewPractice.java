package src.practice.programe;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;

public class NewPractice {
	static HashMap<String, String> revenueFieldUpdateMap = new HashMap<String, String>();
	public static void main(String[] args) {
		Calendar currentDate = Calendar.getInstance();
		SimpleDateFormat formatter= new SimpleDateFormat("M/dd/yy");
		SimpleDateFormat formatter1= new SimpleDateFormat("M/dd/yyyy");
		currentDate.add(Calendar.DATE, 1);
		String vChnagedDate=formatter.format(currentDate.getTime());
		String vChnagedDatefullFormat = formatter1.format(currentDate.getTime());
		System.out.println("vChnagedDate: "+vChnagedDate);
		System.out.println("vChnagedDatefullFormat: "+vChnagedDatefullFormat);
		
		
			formatAmount("20 000.00");
			}
	
private static double formatAmount(String headerAmountValue) {
		
		double headerAmount = 0.0;
		headerAmountValue.trim();
		if (headerAmountValue.contains(" ")){
			headerAmountValue =headerAmountValue.replaceAll(" ", "");
		}
		
		if (headerAmountValue.contains(",")){
			headerAmountValue = headerAmountValue.replaceAll(",", "");
		}
		
		System.out.println("Formated String -"+ headerAmountValue);
		
		headerAmount=   Double.parseDouble(headerAmountValue);
		
		System.out.println("Formatted Header Amount "+ headerAmount);
		return headerAmount ;
	}
}


