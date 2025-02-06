package streamsspack;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;


public class streamex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>al=new ArrayList<>();
		al.add(100);
		al.add(101);
		al.add(102);
		
		System.out.println(al);
		
		List<Integer>ls=al.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(ls); 

	}

}
