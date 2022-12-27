import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int num = Integer.parseInt(arr[0]);
        int total = Integer.parseInt(arr[1]);
        int cnt=0;
        Stack<Integer> stack = new Stack<>();

        for(int i =0; i<num;i++){
            stack.push(Integer.parseInt(br.readLine()));
        }

        for(int i =0; i<num;i++){
            if(total==0) break;
            if(stack.peek()<=total){
                int tmp = total/stack.peek();
                total -= stack.peek()*tmp;
                cnt+=tmp;
                stack.pop();
            } else{
                stack.pop();
            }
        }
        System.out.println(cnt);
    }
}