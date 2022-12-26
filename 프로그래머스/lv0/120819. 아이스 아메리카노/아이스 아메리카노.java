class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int ame = money/5500;
        int cha = money%5500;
        answer[0]=ame;
        answer[1]=cha;
        return answer;
    }
}