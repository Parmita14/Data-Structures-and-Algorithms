public class prefixsum {
    public static int maxsumarr(int numbers[]){
        int currsum =0;
        int max = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];
    for(int i = 1;i<numbers.length;i++){
        prefix[i] = prefix[i-1] + numbers[i];
    }
    for(int i = 0;i<numbers.length;i++){
        int start = i;
        for(int j =i;j<numbers.length;j++){
            int end = j;
            currsum = start==0? prefix[end] : prefix[end] - prefix[start-1];
            if(currsum > max ){
                max = currsum;
            }
        }
    }
    return max;
    }
    public static void main(String[] args){
        int  numbers[] = {2,3,4,5};
        System.out.println(maxsumarr(numbers));
           
    }
}
