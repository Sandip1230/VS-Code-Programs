import java.util.*;
public class WordWise
{
    String str;
    public WordWise()
    {
        str ="";
    }
    public static void main(String [] args)
    {
        WordWise obj = new WordWise();
        obj.readsent();
    }
    public static void arrange(String str)
    {
        System.out.println(str);
    }
    public void readsent()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        
        StringTokenizer sT = new StringTokenizer(str);
        int noOfTokens = sT.countTokens();
        
        for(int i = 0;i < noOfTokens;i++)
        {
            String word = sT.nextToken();
            arrange(word);
            int freq = freq_vowel(word);
            System.out.println("frequency of vowel in the word is : "+freq);
        }
    }
    public static int freq_vowel(String w)
    {
        int count = 0;
        for(int i = 0; i< w.length();i++)
        {
            String ch = w.charAt(i) +"";
            ch = ch.toLowerCase();
            if(ch.equalsIgnoreCase("a")||
            ch.equalsIgnoreCase("e")||
            ch.equalsIgnoreCase("i")||
            ch.equalsIgnoreCase("o")||
            ch.equalsIgnoreCase("u" ))
                count++;
        }
        return count;
    }
}
