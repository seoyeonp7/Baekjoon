import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];
		
		for(int i = 0 ; i<array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		int total=0;
		
		for(int i = 0; i<array.length; i++) {
			total += array[i];
		}
		
		Arrays.sort(array);
		
		System.out.println(total/5);
		System.out.println(array[2]);
	}
}
