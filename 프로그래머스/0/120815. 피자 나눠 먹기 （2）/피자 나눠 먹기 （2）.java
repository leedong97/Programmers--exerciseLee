class Solution {
    public int solution(int n) {
        int answer = 0;
        int num;
        for(int i=1; i<=n ; i++){
            num=6*i;
            if(num%n==0){
            answer = i;
            break;
            }
        }
        return answer;
    }
}