package streamsspack;
import java.util.OptionalInt;
import java.util.stream.*;
import java.util.*;


public class Streamex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls= Arrays.asList("java","python","c");
		
		
		Stream<String> s= ls.stream();
		Optional<String> op=s.sorted().reduce((s1,s2)->s1+ "," +s2);
		
		System.out.println(op.get());
		
	}

}
