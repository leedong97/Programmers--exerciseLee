class Solution {
    public int solution(int order) {
        int answer =0;
        String str1 = String.valueOf(order);
        for(int i=0; i<str1.length();i++){
            if((int)str1.charAt(i)%3 ==0 && str1.charAt(i)!= '0'){
                answer++;
            }
        }
        return answer;
    }
}