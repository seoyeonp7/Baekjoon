import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String x = br.readLine();
        String[] xs = x.split("");
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=Integer.parseInt(xs[i]);
        }
        System.out.println(sum);
    }
}