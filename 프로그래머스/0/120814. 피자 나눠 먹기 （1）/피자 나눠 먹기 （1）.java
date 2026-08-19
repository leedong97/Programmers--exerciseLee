class Solution {
    public int solution(int n) {
    
        int answer = n/7;
           answer=n%7==0? answer :answer+1 ;
       
     
        
        return answer;
    }

    
}