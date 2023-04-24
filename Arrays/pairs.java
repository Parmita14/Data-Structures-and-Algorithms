public class pairs {
    public static int pairs(int numbers[]){
    for(int i=0;i<numbers.length;i++){
        int start = numbers[i];
        for(int j=i+1;j<numbers.length;j++){
            int end = numbers[j];
            System.out.print("("+start+","+end+")");
            }
            System.out.println();   
        }
    return 0;
}

public static void main(String[] args){
    int numbers[] = {3,4,2,7,5};
pairs(numbers);
}
}
