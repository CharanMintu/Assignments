package streamsspack;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Assi1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>al=new ArrayList<>();
		al.add(100);
		al.add(101);
		al.add(102);
		al.add(104);
		al.add(105);
		al.add(106);
		
		System.out.println(al);
		
		double average =al.stream().mapToInt(Integer::intValue).average().orElse(0.0);
		System.out.println(average);


	}

}
