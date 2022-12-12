import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Queue<Integer> q = new LinkedList<>();
        Scanner scanner= new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //패킷의 크기
        int num = Integer.parseInt(br.readLine());

        while(true) {
            //패킷 입력값
            int num2 = Integer.parseInt(br.readLine());
            if(num2==-1) {
                break;
            } else if(num2==0) {
                q.poll();
            } else if(q.size()<num) {
                q.add(num2);
            }
        }
        Iterator iter = q.iterator();
        if(q.isEmpty()) {
            System.out.println("empty");
        } else {
            while(iter.hasNext()) {
                System.out.println(iter.next());
            }
        }
    }
}
