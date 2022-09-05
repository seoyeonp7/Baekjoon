import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	int[] arrays = new int[9];
	
	for (int i = 0; i < arrays.length; i++) {
		arrays[i] = scanner.nextInt();		
	}
	
	int max=arrays[0];
	int n = 0;
	for (int i = 0; i < arrays.length; i++) {
		if(arrays[i]>=max) {
			max=arrays[i];	
			n=i+1;
		}
		
	}
	System.out.println(max);
	System.out.println(n);
	}
}