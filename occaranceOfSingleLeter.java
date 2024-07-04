import java.util.Scanner;
public class occaranceOfSingleLeter {
    

    public static void main(String[] args) {
        String s="veeresh";
        //occurenace of letrers
        Scanner scan= new Scanner(System.in);
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

