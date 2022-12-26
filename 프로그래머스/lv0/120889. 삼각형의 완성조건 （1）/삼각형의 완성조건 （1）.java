class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max =0;
        double total=0;
        for(int i=0;i<3;i++){
            total += sides[i];
            if(sides[i]>max) max = sides[i];
        }
        if(max<total/2) answer = 1;
        else answer = 2;
        return answer;
    }
}