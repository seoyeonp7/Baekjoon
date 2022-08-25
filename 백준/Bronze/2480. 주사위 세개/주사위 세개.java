import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		int money;
			
		if(a==b && b==c && a==c) {
			money = 10000 + a*1000;
		} else if(a==b && a!=c) {
			money = 1000 + a*100;
		} else if(a==c && a!=b) {
			money = 1000 + a*100;
		} else if(b==c && a!=b) {
			money = 1000 + b*100;
		} else {
			if(a>b && a>c) {
				money= a*100;
			} else if(b>a && b>c) {
				money= b*100;
			} else {
				money= c*100;
			}
		}
		System.out.println(money);
	}
}