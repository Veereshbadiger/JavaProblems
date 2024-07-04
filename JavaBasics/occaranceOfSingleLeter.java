import java.util.Scanner;
import java.util.stream.IntStream;
public class occaranceOfSingleLeter {
    

    public static void main(String[] args) {
        String s="veeresh";
        try (//occurenace of letrers
        Scanner scan = new Scanner(System.in)) {
            System.out.println("please enter charecter to find:");
            char input =scan.next().charAt(0);
            // char input ='e';
            int count=0;
            s=s.toLowerCase();
            char [] arr =s.toCharArray();
            for (int i=0;i<arr.length;i++){
                if(arr[i]==input){
                count++;
                
                }
            }
            System.out.print("found:"+input+count);
        }
    }

    public static void printAlternativeNumStream() {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        IntStream.range(0, arr.length)
                .filter(i -> i % 2 == 0)
                .forEach(i -> System.out.print(arr[i]));
        System.out.println("************"); 
    }
}

