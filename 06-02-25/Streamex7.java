package streamsspack;
import java.util.OptionalInt;
import java.util.stream.*;
import java.util.*;


public class Streamex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls= Arrays.asList("java","python","c");
		
		
		Stream<String> s= ls.stream();
		s.distinct().forEach(System.out::println);
		
		s=ls.stream();
		Optional<String> op=s.findFirst();
		System.out.println(op.get());
		s=ls.stream();
		Optional<String> op2=s.findAny();
		System.out.println(op2.get());
		s=ls.stream();
		boolean a=s.anyMatch(i->i.startsWith("j"));
		System.out.println(a);
		
	}

}
