class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int max= 0;
        
        for(int i=0;  i<numbers.length; i++){
            for(int j =i+1; j< numbers.length; j++){
                if(numbers[i]<numbers[j]){                    
                     max =numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i]= max;                 
                }
            }            
        }
        answer=numbers[0]*numbers[1];
        return answer;
    }
}