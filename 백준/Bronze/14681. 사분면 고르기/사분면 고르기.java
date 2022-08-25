import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int X = scanner.nextInt();
		int Y = scanner.nextInt();
		String result;
		
		if(X>0 && Y>0) {
			result = "1";
		} else if(X>0 && Y<0) {
			result = "4";			
		} else if(X<0 && Y>0) {
			result = "2";
		} else {
			result = "3";
		}
		
		System.out.println(result);
	}
}
