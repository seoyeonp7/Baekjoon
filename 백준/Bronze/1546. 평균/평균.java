import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		double[] score = new double[n];
		
		for (int i = 0; i < score.length; i++) {
			score[i] = scanner.nextInt();
		}		
		scanner.close();
		double max = score[0];
		int count=0;
		double sum=0;
		for (int i = 0; i < score.length; i++) {
			if(max<score[i]) {
				max=score[i];
			}
		}
		for (int i = 0; i < score.length; i++) {
			score[i] = score[i]/max*100;
			sum += score[i];
			count++;
		}
		
		double avg = (double)sum/count;
		System.out.println(avg);
	}
}
