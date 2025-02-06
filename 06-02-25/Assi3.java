package streamsspack;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Assi3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ls=Arrays.asList(11,12,31,12);
		
		int evensum=ls.stream().filter(i->i%2==0).mapToInt(Integer::intValue).sum();
		int oddsum=ls.stream().filter(i->i%2!=0).mapToInt(Integer::intValue).sum();
		
		System.out.println(evensum);
		System.out.println(oddsum);


	}

}
