class Solution {
    public int solution(int num1, int num2) {
        int answer = (int)((float)num1/num2*1000);
        return answer;
    }
    
    public static void main(String[] args){
        Solution s = new Solution();
        s.solution(3,2);
        s.solution(7,3);
        s.solution(1,16);
    }
}