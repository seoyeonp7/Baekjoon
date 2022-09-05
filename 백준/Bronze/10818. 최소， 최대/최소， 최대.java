import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();
	int[] arrays = new int[n];
	
	for (int i = 0; i < arrays.length; i++) {
		arrays[i] = scanner.nextInt();		
	}
	
	int max=arrays[0];
	int min=arrays[0];
	
	for (int i = 0; i < arrays.length; i++) {
		if(arrays[i]<min) {
			min=arrays[i];			
		}
		if(arrays[i]>max) {
			max=arrays[i];			
		}
		
	}
	System.out.printf("%d %d",min,max);
	
	
	}
}