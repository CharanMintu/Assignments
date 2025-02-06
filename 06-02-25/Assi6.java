package streamsspack;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Assi6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls=Arrays.asList("hello","hey","eodkw","cmdkc","zoo");
		
		
		List<String> asc=ls.stream().sorted().collect(Collectors.toList());
		System.out.println(asc);
		
		List<String> dec=ls.stream().sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList());
		System.out.println(dec);
	}}
