class Solution {
    public int solution(int num1, int num2) {
        int answer = num1%num2;
        return answer;
    }
    public static void main(String[] args){
        Solution s = new Solution();
        s.solution(3,2);
        s.solution(10,5);
    }
}