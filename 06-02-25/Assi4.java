package streamsspack;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Assi4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ls=Arrays.asList(11,12,31,12);
		List<Integer> unnique=ls.stream().distinct().collect(Collectors.toList());
		System.out.println(unnique);
		
	}}