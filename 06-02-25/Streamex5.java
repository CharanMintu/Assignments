package streamsspack;
import java.util.OptionalInt;
import java.util.stream.*;

public class Streamex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStream strint=IntStream.of(1,2,3,4);
		
		OptionalInt optionalInt=strint.reduce((i1,i2)->i1+i2);
		System.out.println(optionalInt.getAsInt());
	}

}
