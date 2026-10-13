class Solution {
    public String solution(int age) {
        String str_age = String.valueOf(age);
        String answer ="";
        
        char[] arr = {'a','b','c','d','e','f','g','h','i','j'};
        
        for(int i=0; i< str_age.length(); i++){
            int num =str_age.charAt(i)-'0';
            answer += arr[num];
        }
        return answer;
    }
}