import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String,String> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for(int i=0;i<n;i++){
            String str = br.readLine();
            String arr[] = str.split(" ");
            map.put(arr[0],arr[1]);
        }
        for(int i=0;i<m;i++){
            String get = br.readLine();
            System.out.println(map.get(get));
        }
    }
}