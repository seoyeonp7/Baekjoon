import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		int[][] arr = new int[9][9];
		Scanner scanner = new Scanner(System.in);
		int max = -1;
		int maxI = 0;
		int maxJ = 0;
		
		for(int i = 0; i<9;i++) {
			for(int j = 0; j<9; j++) {
				arr[i][j] = scanner.nextInt();
				if(arr[i][j]>max) {
					max = arr[i][j];
					maxI = i+1;
					maxJ = j+1;
				}
				
			}
		}
		
		System.out.println(max);
		System.out.print(maxI+" "+maxJ);
	}
}

