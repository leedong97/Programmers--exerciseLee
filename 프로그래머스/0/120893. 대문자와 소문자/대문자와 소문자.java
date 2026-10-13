class Solution {
    public String solution(String my_string) {
        String answer = "";
        StringBuffer sb = new StringBuffer(my_string);
        for(int i= 0; i<my_string.length(); i++){
            if(sb.charAt(i)>95){
              sb.setCharAt(i, (char)(sb.charAt(i) - 32));
            }else{
              sb.setCharAt(i, (char)(sb.charAt(i) + 32));
            }
        }
      return sb.toString();
    }
}