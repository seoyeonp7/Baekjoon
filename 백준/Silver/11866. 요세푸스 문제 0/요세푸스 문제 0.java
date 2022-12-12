import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        for(int i=1;i<=k;i++){
            q.add(i);
        }
        while(q.size()!=0){
            for(int i=1;i<n;i++){
                q.add(q.poll());
            }
            q2.add(q.poll());
        }
        Iterator iter = q2.iterator();
        int cnt=0;
        System.out.print("<");
        while(iter.hasNext()) {
            if(cnt==0) {
                System.out.print(iter.next());
                cnt++;
            } else System.out.print(", "+iter.next());
        }
        System.out.print(">");
    }
}