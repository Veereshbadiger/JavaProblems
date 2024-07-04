package gfg;
import java.util.Arrays;

public class SecondHighest {

    
    public static void main(String[] args) {
        int [] arr = {10,5,10};

       int i= getSecondHighest(arr);
       System.out.println(i);
    }
    public static int getSecondHighest(int [] arr){
        Arrays.sort(arr);
        for(int i=arr.length-2;i>=0;i--){
            if (arr[i]!=arr[arr.length-1]) {
               return arr[i];
                
            }
        }
        return -1;
    }
    
}
