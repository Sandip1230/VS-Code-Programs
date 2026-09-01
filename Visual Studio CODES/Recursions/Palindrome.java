import java.util.*;
// NUMBER  = 111 
// Reverse = 111    
     
// ANSWER   == >  [ PALINDROME NUMBER ]
public class Palindrome
{
    int sum = 0, num = 1, temp = 0, rem = 0,flag = 0;
    public int Show(int n)
    {
        if(flag == 0)
             this.temp = n;

        flag ++;
        this.num  = n;
        if(num > 0)
        {
            rem = num % 10;
            sum = (sum * 10 )+ rem; 
            Show(num/10);
        }
        if(temp == sum)
            return 1;
        else
            return 0;
    }
    
    public static void main(String[] args)
    {   
        Scanner sc = new Scanner(System.in);
        System.out.println("\u000C");
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        Palindrome obj = new Palindrome();
        int ans = obj.Show(n);
        
        if(ans == 1)
                System.out.println("The number is a palindrome number ");
        else
                System.out.println("The number is not a palindrome number ");
    }
}