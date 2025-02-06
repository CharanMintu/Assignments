package streamsspack;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Assi5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls=Arrays.asList("hello","hey","eodkw","cmdkc");
		
		char ch='h';
		long uni=ls.stream().filter(i->i.startsWith(String.valueOf(ch))).count();
		System.out.println(uni);
	}}