import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	HashSet<Integer> hash = new HashSet<Integer>();
	
	//HashSet에 저장
	for(int i=0;i<10;i++) {
		hash.add(scanner.nextInt()%42);
	}
	
	scanner.close();
	System.out.println(hash.size());

	}
}