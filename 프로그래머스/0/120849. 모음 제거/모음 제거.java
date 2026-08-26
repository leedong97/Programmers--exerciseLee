class Solution {
    public String solution(String my_string) {
        String answer = "";
        StringBuffer sb = new StringBuffer(my_string);
        for(int i =sb.length()-1; i>=0;i--){
            char s= sb.charAt(i);
            if(s=='a' ||s=='e'|| s=='i'|| s=='o'||s=='u'){
            sb.deleteCharAt(i);
            }
        }
        answer = sb.toString();
        return answer;
    }
}