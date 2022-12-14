import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                StringBuffer sb = new StringBuffer(st.nextToken());
                String reverse = sb.reverse().toString();
                System.out.print(reverse+" ");
            }
            System.out.println();
        }
    }
}