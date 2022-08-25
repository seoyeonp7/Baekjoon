import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int H = scanner.nextInt();
		int M = scanner.nextInt();
		
		if(H==0 && M<45) {
			H=23;
			M=15+M;
		} else if(H>0 && M<45) {
			H=H-1;
			M=15+M;
		} else {
			M=M-45;
		}
		System.out.println(H);
		System.out.println(M);
	}
}