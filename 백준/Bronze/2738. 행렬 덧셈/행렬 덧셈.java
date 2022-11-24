import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		
		int[][] array1 = new int[n][m]; 
		int[][] array2 = new int[n][m];
		
		//입력
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				array1[i][j] = scanner.nextInt();
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				array2[i][j] = scanner.nextInt();
			}
		}
		
		//출력
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				System.out.print(array1[i][j]+array2[i][j]+" ");
				if(j== m-1){
					System.out.println();
				}
			}
		}
	}
}
