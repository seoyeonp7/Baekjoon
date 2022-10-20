import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int i;
		int ans=0;
		int num1 =0;
		int num2 = 0;
		
		for(i=1; i<1000000000; i++) {
			num1+= 6*(i-1);
			num2+= 6*i;
			if(n==1) {
				ans=1;
				break;
			}
			if(n>num1+1 && n<=num2+1) {
				ans = i+1;
				break;
			}
		}
		System.out.println(ans);
	}
}