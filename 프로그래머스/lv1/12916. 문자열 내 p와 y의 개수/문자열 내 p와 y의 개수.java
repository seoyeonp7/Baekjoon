class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String[] sarr = s.split("");
        int cntp=0;
        int cnts=0;
        for(int i=0;i<sarr.length;i++){
            if(sarr[i].equals("p")||sarr[i].equals("P"))
                cntp++;
            if(sarr[i].equals("y")||sarr[i].equals("Y"))
                cnts++;
        }
        if(cntp!=cnts){
            answer=false;
        }

        return answer;
    }
}