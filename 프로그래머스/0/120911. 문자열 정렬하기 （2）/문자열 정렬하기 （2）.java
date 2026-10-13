import java.util.*;

class Solution {
    public String solution(String my_string) {
        
        char[] arr = my_string.toCharArray();
        for(int i=0; i< arr.length; i++){
            if(arr[i] >= 65 && arr[i] <= 90) {
                arr[i] += 32;
        }
        }
        Arrays.sort(arr);
        String answer = new String(arr);        
        
        return answer;
    
}
}