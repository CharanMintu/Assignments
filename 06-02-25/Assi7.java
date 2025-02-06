package streamsspack;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Assi7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ls=Arrays.asList(11,12,31,12,21,99);
		Optional<Integer> maxe=ls.stream().max(Integer::compareTo);
		Optional<Integer> mine=ls.stream().min(Integer::compareTo);
		
		System.out.println(maxe);
		System.out.println(mine);
	}}