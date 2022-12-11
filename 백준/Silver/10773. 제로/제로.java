import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();

        for(int i=0;i<k;i++){
            int p = scanner.nextInt();
            if(p!=0){
                stack.push(p);
            }else{
                stack.pop();
            }
        }
        int sum =0;
        for(int i: stack){
            sum += i;
        }
        System.out.println(sum);
    }
}
