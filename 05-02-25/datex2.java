package jdbc_demo;
import java.time.temporal.*;
import java.time.*;
public class datex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		datex2 dt2=new datex2();
		dt2.test();
		
		

	}

	public void test() {
		LocalDate today=LocalDate.now();
		System.out.println(today);
		
		LocalDate nxtwk=today.plus(3, ChronoUnit.MONTHS);
		System.out.println(nxtwk);
		// TODO Auto-generated method stub
		
	}

}
