import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        LinkedList<Integer> q = new LinkedList<>();

        for(int i=1;i<=n;i++){
            q.offer(i);
        }

        st = new StringTokenizer(br.readLine());
        int[] seq = new int[m];
        for(int i=0;i<m;i++){
            seq[i]=Integer.parseInt(st.nextToken());
        }
        int cnt=0;

        for(int i =0; i<m;i++) {
            int target_idx = q.indexOf(seq[i]);
            int half_idx;
            if(q.size()%2==0) half_idx = q.size()/2-1;
            else half_idx=q.size()/2;
            if(seq[i]==q.peek()) {
                q.poll();
            } else if(target_idx<=half_idx) {
                q.offer(q.poll());
                i--;
                cnt++;
            } else {
                q.offerFirst(q.pollLast());
                i--;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}