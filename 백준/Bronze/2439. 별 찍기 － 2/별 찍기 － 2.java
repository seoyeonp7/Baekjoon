import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int count = scanner.nextInt();
		
		for(int i=1; i<=count; i++) {
			for(int j =1;j<=count; j++) {
				if(count-i>=j) {
					System.out.print(" ");
										
				} else {
					
					System.out.print("*");	
				}
			}
			System.out.println();
		}	
	}
}