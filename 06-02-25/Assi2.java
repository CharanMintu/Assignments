package streamsspack;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Assi2 {

	public static void main(String[] args) {
		List<String> words=Arrays.asList("xjwxw","java","hello");
		
		List<String> upper=words.stream().map(String::toUpperCase).collect(Collectors.toList());
		List<String> lower=words.stream().map(String::toLowerCase).collect(Collectors.toList());
		
		System.out.println(upper);
		System.out.println(lower);

		// TODO Auto-generated method stub

	}

}
