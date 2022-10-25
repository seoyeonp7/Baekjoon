import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int p = sc.nextInt();
		int cutNum =sc.nextInt();
		
		Integer[] arr = new Integer[p];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr,Collections.reverseOrder());
		
		System.out.println(arr[cutNum-1]);
	}
}
