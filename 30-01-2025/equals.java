package techM;

import java.util.Arrays;

public class equals {
	public static void main(String[] args) {
		int arr[]= {12,13,14,15};
		int arr2[]= {12,13,14};
		System.out.println(Arrays.equals(arr, arr2));
		int arr3[][]= {{12,13},{14,15}};
		int arr4[][]= {{12,13,14,15}};
		System.out.println(Arrays.deepEquals(arr3, arr4));

		

}
}