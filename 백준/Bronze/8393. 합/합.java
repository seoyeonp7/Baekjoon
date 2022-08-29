import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int re=scanner.nextInt();
		int a= 0;
		for(int i=1; i<=re; i++) {
			a+=i;
		}
		System.out.println(a);
	}
}