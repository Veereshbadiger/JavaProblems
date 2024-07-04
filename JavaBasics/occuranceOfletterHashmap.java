import java.util.HashMap;

public class occuranceOfletterHashmap {
    public static void main(String[] args) {
        String s ="jfndsnkflsdfefewjpfxzvxbd";
        HashMap <Character,Integer> letters = new HashMap<>();

        for(char ch : s.toCharArray()){
            if (letters.containsKey(ch)) {
                letters.put(ch, letters.get(ch)+1);
            
                
            }
            else{
                letters.put(ch,1);
            }
        }
        System.out.println(letters);

    }
    
}
