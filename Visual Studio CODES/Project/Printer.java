import java.util.*;
public class Printer 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        while(true)
        {
            System.out.println("Enter the number according to the requirements :: ");
            System.out.println("1 ] Print the vowels in the screen  \n2 ] Print the consonents in the screen\n3 ] Count no. of UpperCase Characters \n4 ] Count no. of LowerCase Characters");
            int ch = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the String:: ");
            String str = sc.nextLine();

            switch(ch)
            {
                case 1 :
                    PrintVowels    (str);
                    break;
                
                case 2 :
                    PrintConsonents(str);
                    break;
                    
                case 3 : 
                    int count = CountUpperCase(str);
                    System.out.println("The number of the Upper Case Characters in the string is : "+   count);
                    break;
                    
                case 4 : 
                    int count2 = CountLowerCase(str);
                    System.out.println("The number of the Lower Case Characters in the string is : "+ count2);
                    break;
            }  
        }
    }
        
        private static int CountLowerCase(String str) 
        {
            int count = 0;
            
            for( int i = 0; i < ( str.length() ) ; i++)
            {
                if(Character.isLowerCase( ( str.charAt(i) )))
                {
                   count++;
                }
            }
        return count;
       }

    private static int CountUpperCase(String str) 
    {
         int count = 0;

        for( int i = 0; i < ( str.length() ) ; i++)
        {
           if(Character.isUpperCase( ( str.charAt(i) )))
           {
                count++;
           }
        }

        return count;
    }

    private static void PrintConsonents(String str) 
    {
        String ch;
        
        System.out.println("The Consonents in the String are shown below :: \n");
        for( int i = 0; i < ( str.length() ) ; i++)
        {
            ch = str.charAt(i)+"";
           if(ch.equalsIgnoreCase("a") || ch.equalsIgnoreCase("e") || ch.equalsIgnoreCase("i") || ch.equalsIgnoreCase("o") ||  ch.equalsIgnoreCase("u") ){}

           else
           {
                System.out.print(ch+ " ");
           }
        }
        System.out.println("\n\n// Rest of the characters are vowels ");
    }

    private static void PrintVowels(String str) 
    {
        String ch;
        
        System.out.println("The Vowels in the String are shown below :: \n");
        for( int i = 0; i < ( str.length() ) ; i++)
        {
            ch = str.charAt(i)+"";

           if(ch.equalsIgnoreCase("a") || ch.equalsIgnoreCase("e") || ch.equalsIgnoreCase("i") || ch.equalsIgnoreCase("o") ||  ch.equalsIgnoreCase("u") )
           {
                System.out.print(ch+ " ");
           }
        }
        System.out.println("\n\n// Rest of the characters are consonents ");
    }
}