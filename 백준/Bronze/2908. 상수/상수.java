import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String[] arr1 = st.nextToken().split("");
        String[] arr2 = st.nextToken().split("");
        int a1 = Integer.parseInt(arr1[2]+arr1[1]+arr1[0]);
        int a2 = Integer.parseInt(arr2[2]+arr2[1]+arr2[0]);

        int result = a1>a2? a1:a2;
        System.out.println(result);
    }
}