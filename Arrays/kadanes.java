public class kadanes {
    public static int kadane(int numbers[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for(int j=0;j<numbers.length;j++){
            if(numbers[j]>0){
                for(int i=0;i<numbers.length;i++){
            cs = cs + numbers[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
       
            }else
            
            {if(numbers[j] > ms)
                ms = numbers[j];
            }   
        } System.out.println("THE MAXIMUM SUM OF Arrays:" + ms);
         
  return 0;
  }
    public static void main(String[] args){
      int  numbers[] = {-1,-3,-4,-3,-5,-6,-2}; 
      kadane(numbers);
        
    }
}
