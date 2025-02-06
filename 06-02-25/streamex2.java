package streamsspack;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class streamex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>al=new ArrayList<>();
		al.add(100);
		al.add(101);
		al.add(102);
		
		
		System.out.println(al);
		
		List<Integer> ls=al.stream().map(i->i+5).collect(Collectors.toList());
		System.out.println(ls);


	}

}
