package jdbc_demo;
import java.time.*;

public class date1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		date1 dt1=new date1();
		dt1.testLocalDateTime();
		
		
	}

	public void testLocalDateTime() {
		// TODO Auto-generated method stub
		LocalDateTime currtime=LocalDateTime.now();
		System.out.println(currtime);
		
		LocalDate lc=LocalDate.now();
		System.out.println(lc);
		
		
	}

}
