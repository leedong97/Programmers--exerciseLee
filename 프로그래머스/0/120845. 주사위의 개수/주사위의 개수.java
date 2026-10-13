class Solution {
    public int solution(int[] box, int n) {
        int answer = 1;
       for(int i=0; i<3; i++){
           int num =0;
           num = box[i]/n;
           answer *=num;
       }
       
        return answer;
    }
}