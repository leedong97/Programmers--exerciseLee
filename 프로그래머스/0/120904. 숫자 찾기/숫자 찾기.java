class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String str1 = String.valueOf(num);
        String str2 = String.valueOf(k);
        char str2_char = str2.charAt(0);
        
        for(int i= 0; i<str1.length(); i++){
            if(str1.charAt(i)== str2.charAt(0)){
                return i+1;
            }
        }
        return answer;
    }
}