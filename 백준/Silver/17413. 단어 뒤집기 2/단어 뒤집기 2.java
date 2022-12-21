import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<String> stack = new Stack<>();

        StringBuffer sb = new StringBuffer();
        String[] str = br.readLine().split("");
        boolean status = false;
        for(String v : str){
            if(status==true){
                sb.append(v);
            } else {
                if(v.equals(" ")||v.equals("<")){
                    while(!stack.isEmpty()){
                        sb.append(stack.pop());
                    }
                    sb.append(v);
                } else {
                    stack.add(v);
                }
            }
            if(v.equals("<")){
                status = true;
            } else if(v.equals(">")){
                status = false;
            }
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        System.out.println(sb);
    }
}