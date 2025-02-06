package streamsspack;
import java.util.stream.*;

public class Streamex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStream.of(1,2,3,4,5,6).filter(n->n%2==0).forEach(System.out::println);

	}

}
