import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);

        for(int i = 1; i<=n; i++) {
            q.add(i);
        }

        while(q.size()>0) {
            for(int i=0;i<k-1;i++) {
                q.add(q.poll());
            }
            q2.add(q.poll());
        }

        int cnt=0;
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        Iterator iter = q2.iterator();
        while(iter.hasNext()){
            if(cnt==0) sb.append(iter.next());
            else sb.append(", "+iter.next());
            cnt++;
        }
        sb.append(">");

        System.out.println(sb);

    }
}