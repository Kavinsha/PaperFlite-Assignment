import java.util.*;

public class Problem3 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Given a pattern and a string s, find if s follows the same pattern.");
        System.out.println();
        System.out.println("Enter the patternn:");
        String pattern=sc.nextLine();
        System.out.println("Enter the String:");
        String s=sc.nextLine();
        Solution3 obj=new Solution3();
        boolean result=obj.wordPattern(pattern,s);
        System.out.println(result);
    }
}
class Solution3 {
    public boolean wordPattern(String pattern, String s) {
        String[] words=s.split(" ");
        Map<Character,String> chartoWord=new HashMap<>();
        Map<String,Character> wordtoChar=new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            String word=words[i];
            if(chartoWord.containsKey(ch)){
                if(!chartoWord.get(ch).equals(word)){
                    return false;
                }
            } 
            else{
                chartoWord.put(ch, word);
            }
            if(wordtoChar.containsKey(word)) {
                if (wordtoChar.get(word)!=ch) {
                    return false;
                }
            } 
            else {
                wordtoChar.put(word, ch);
            }
        }

        return true;
    }
}
