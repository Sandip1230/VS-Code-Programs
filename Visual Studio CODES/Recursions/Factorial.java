import java.util.*;
// NUMBER      = 5 
// Factorial   =        << 5 X 4 X 3 X 2 X 1 >>   
     
// ANSWER                == >  [ 120 ]
public class Factorial
{
    int sum = 1, num = 1;
    public int Show(int n)
    {
        this.num = n;
        if(num > 0)
        {
            sum = sum * (num--);
            Show(num);
        }
            return sum;
    }
    
    public static void main(String[] args)
    {   
        Scanner sc = new Scanner(System.in);
        System.out.println("\u000C");
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        Factorial obj = new Factorial();
        int ans = obj.Show(n);
        System.out.println("The answer is : "+ans);
    }
}