import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		String result;		
		if(year%400==0) {
			year = 1;
		} else if(year%4==0 && year%100 !=0) {
			year=1;
		} else {
			year =0;
		}
		System.out.println(year);
	}
}
