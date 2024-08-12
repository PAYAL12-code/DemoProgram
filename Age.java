package Demo.com;

import java.time.LocalDate;
import java.time.Period;

public class Age {

	public static void main(String[] args) {
		
		LocalDate bdate = LocalDate.of(1990, 12, 20);
		LocalDate today = LocalDate.now();
		
		Period p = Period.between(bdate, today);
		
		System.out.print( p.getYears() +"year" +p.getMonths()+"month"+ p.getDays()+"days");
		
	}
	
}
