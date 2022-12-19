import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<String> leftStack = new Stack<>();
        Stack<String> rightStack = new Stack<>();

        String[] x = br.readLine().split("");
        for(String a : x){
            leftStack.push(a);
        }

        int num = Integer.parseInt(br.readLine());

        for(int i=0;i<num;i++){
            String[] k = br.readLine().split(" ");
            if(k[0].equals("L")) {
                if(leftStack.size()!=0)
                rightStack.push(leftStack.pop());
            }
            else if(k[0].equals("D")) {
                if(rightStack.size()!=0)
                leftStack.push(rightStack.pop());
            } else if(k[0].equals("B")) {
                if(leftStack.size()!=0)
                leftStack.pop();
            } else leftStack.push(k[1]);
        }

        StringBuilder sb = new StringBuilder();
        for(int i =0; i<leftStack.size();i++){
            sb.append(leftStack.get(i));
        }
        for(int i =rightStack.size()-1; i>=0;i--){
            sb.append(rightStack.get(i));
        }
        System.out.println(sb);
    }
}