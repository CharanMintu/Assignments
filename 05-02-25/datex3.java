package jdbc_demo;
import java.time.*;
import java.time.temporal.*;

public class datex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		datex3 dt3=new datex3();
		dt3.gettest();
		
		

	}

	public void gettest() {
		// TODO Auto-generated method stub
		LocalDate today=LocalDate.now();
		System.out.println(today);
		
		LocalDate nxttues=today.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
		System.out.println(nxttues);
		
	}

}
