import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        int length = num_list.length;
        int[] answer = new int[length];
        int cnt=0;
        for(int i=length-1;i>=0;i--){
            answer[cnt]=num_list[i];
            cnt++;
        }
        return answer;
    }
}