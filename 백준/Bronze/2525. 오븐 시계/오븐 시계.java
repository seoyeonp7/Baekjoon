import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
			
		if(B+C>=60) {
			if(A+(B+C)/60 >=24) {
				A=(A+(B+C)/60)%24;
				B=(B+C)%60;
			} else {
				A=A+(B+C)/60;
				B=(B+C)%60;
			}
		} else {
			B=B+C;
		}
		
		System.out.println(A+" "+B);
	}
}