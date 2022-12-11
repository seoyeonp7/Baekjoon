import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=1; i<=n;i++){
            q.add(i);
        }

        while(q.size()>1){
            q.poll();
            q.add(q.poll());
        }
        System.out.println(q.peek());
    }
}
