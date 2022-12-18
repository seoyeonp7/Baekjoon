import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        for(int i=0;i<num;i++){
            String n = br.readLine();
            String[] k = n.split("");
            int a = 0;
            int b = 0;
            String result = "YES";
            for(String p : k){
                if(p.equals("(")) a++;
                else b++;
                if(a<b) result= "NO";
            }
            if(a!=b){
                result = "NO";
            }
            System.out.println(result);
        }
    }
}