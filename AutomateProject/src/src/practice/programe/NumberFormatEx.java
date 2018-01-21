package src.practice.programe;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberFormatEx {

	public static void main(String[] args) throws ParseException {
		//12000.00
		// 12,000.00

		DecimalFormat a = new DecimalFormat("##,###.####"); 
		double e=1232233.11;
		System.out.println(a.format(e));

		List<String[]> aa =  new ArrayList<String[]>();
		for (int i = 0; i < 5; i++) {
			String[] fields = {"hello","ads","adsad","sadasd"};
			aa.add(fields);		
		}

		String s = "MyOpportunities asd da s dasfrt ty yu";
		System.out.println(s.indexOf("itiq"));

		String filter = "Today's Appointments";
		System.out.println(filter.replaceAll("'", "&apos;"));
//-----------------------------------------------------------------------------------
		//Today&apos;s Appointments"
		SimpleDateFormat wsDF = new SimpleDateFormat();
		String today = wsDF.format(new Date());
		Calendar cal = Calendar.getInstance();
		System.out.println("_________________________");
		for(int i = 0; i < 11; i++) {
			cal.add(Calendar.DAY_OF_YEAR, i);
			System.out.println( wsDF.format(cal.getTime()));
			cal.add(Calendar.DAY_OF_YEAR, -i);
			
		}
		
		
		Map<String, String> resultMap =  new HashMap<String, String>();
		resultMap.put("hasMore", "true");
		if (Boolean.valueOf((String)resultMap.get("hasMore"))) {
			System.out.println("Hello");
			
		}
		
		String ss = "My New Lead";
		System.out.println(ss.replace(" ", ""));
		
		//1/9/2018
		SimpleDateFormat userPreferenceDateFormat = new SimpleDateFormat("M/d/yyyy");
		SimpleDateFormat wsDF1 = new SimpleDateFormat("YYYY/MM/dd");
		System.out.println(userPreferenceDateFormat.format(wsDF1.parse("2018/01/09")));;
		
		
	String aasd ="10000";
	
	
	DecimalFormat userNumberFormat = new DecimalFormat("#,###.###");
	String revenue = userNumberFormat.format(Integer.parseInt(aasd));
	System.out.println(aasd);
	String revenue1 = "USD".equals(aasd.toString()) ? "$" + revenue : revenue;
	System.out.println(revenue1);

		
	}
}
