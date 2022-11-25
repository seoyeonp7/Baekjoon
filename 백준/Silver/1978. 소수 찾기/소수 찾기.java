import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] arr;
		arr = new int[scanner.nextInt()];
		int cnt = 0;
		
		for (int i : arr) {
			arr[i] = scanner.nextInt();
			
			if(isPrime(arr[i]) == true) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
	
	static boolean isPrime(int n) {
		
		//1은 소수 아님
		if(n == 1) {
			return false;
		}
		
		// 2~n의 제곱근까지 중 나누어 떨어지는 약수가 있는지 판별
		// n이 2인 경우는 자연스럽게 for문을 검사하지 않음
		for(int i = 2; i<=Math.sqrt(n);i++) {
			if(n%i==0) return false;
		}
		
		//위 두 조건에 걸리지 않으면 소수
		return true;
	}
}
