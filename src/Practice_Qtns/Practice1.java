package Practice_Qtns;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigDecimal a= new BigDecimal(0);
		//BigDecimal b;
		a=a.setScale(2,RoundingMode.HALF_DOWN);
		System.out.println(a);
		LocalDate mydate;
		mydate = LocalDate.ofYearDay(2024,350);
		System.out.println(mydate.format(DateTimeFormatter.ofPattern("M/d/yyyy")));
		System.out.print(a.equals(BigDecimal.ZERO.setScale(2,RoundingMode.HALF_DOWN)));
	}

}
