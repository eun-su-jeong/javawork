package dateCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date01 {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		
		// MM : 월, mm : 분, HH:24시간
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");		
		System.out.println(sdf.format(now));
		
		// a : 오전-오후 hh:12시간 
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");		
		System.out.println(sdf2.format(now));
		
		// E : 요일
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss E");		
		System.out.println(sdf3.format(now));
		
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");		
		System.out.println(sdf4.format(now));
		
		// D : 365일중 몇일째인지
		SimpleDateFormat sdf5 = new SimpleDateFormat("D");		
		System.out.println(sdf5.format(now));
		
		String strDate = "20231103";
		SimpleDateFormat sdf6 = new SimpleDateFormat("yyyyMMdd");
		SimpleDateFormat sdf7 = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			Date strNow = sdf6.parse(strDate);		
			System.out.println(sdf7.format(strNow));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}