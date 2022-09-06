import java.util.Scanner;

public class Main {
	public static void main(String[] args) {	
		Scanner scanner = new Scanner(System.in);
		double c = scanner.nextInt(); //케이스 수
		int n;
		int score;
		
		for(int i=0; i<c; i++) {
			double sum=0;
			int count = 0;
			n = scanner.nextInt(); //학생 수
			double[] scores = new double[n];
			
			for(int j =0; j<n; j++) {
				score = scanner.nextInt();
				scores[j] = score;
				sum += score;
			}
			
			for (int k = 0; k < n; k++) {
				if(scores[k]>(double)sum/n) {
					count++;
				}
			}
			
			System.out.printf("%.3f%%\n",(double)count/n*100); 
			//%입력: %% 두 번 입력.
		}
		scanner.close();
		
	}
}