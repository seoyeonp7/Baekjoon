import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            int x = Integer.parseInt(br.readLine());
            if(x>0){
                q.add(x);
            } else if(x==0){
                if(q.isEmpty()) System.out.println(0);
                else System.out.println(q.poll());
            }
        }
    }
}