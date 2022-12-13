import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        //Comparator
        PriorityQueue<Integer> q = new PriorityQueue<>((o1,o2)->{
            int abs1 = Math.abs(o1);
            int abs2 = Math.abs(o2);

            if(abs1==abs2) return o1<o2 ? -1 : 1;
            return abs1-abs2;
        });
        for(int i=0;i<n;i++){
            int x = Integer.parseInt(br.readLine());
            if(x==0){
                if(q.isEmpty()){
                    System.out.println(0);
                }else{
                    System.out.println(q.poll());
                }
            }else{
                q.add(x);
            }
        }
    }
}
