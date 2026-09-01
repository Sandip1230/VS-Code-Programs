import java.util.*;
public class Loader
{       
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\u000C");
        int temp = 25;
        double arr[] = new double[temp];
        for(int i = 0; i< temp; i++)
            arr[i] = (int)(Math.random()*100);
        Arrays.sort(arr);
        
        for(int i = 0; i< temp; i++)
        {
            System.out.println("\u000C");
            try
            {
                System.out.println("Loading ..."+arr[i]+" %");
                if(arr[i] < 20)
                {
                     System.out.println("Initiating Configurations ..");
                     Bar((int)arr[i]);
                }
                if(arr[i] >= 20 && arr[i] < 30)
                {
                     System.out.println("Initiating Materials ..");
                     Bar((int)arr[i]);
                }
                if(arr[i] >= 30 && arr[i] < 40)
                {
                     System.out.println("Initiating Data Variables ..");
                     Bar((int)arr[i]);
                }
                if(arr[i] >= 40 && arr[i] < 50)
                {
                     System.out.println("Initiating Data Packs ..");
                     Bar((int)arr[i]);
                }
                if(arr[i] >= 50 && arr[i] < 60)
                {
                     System.out.println("Initiating Back-ups ..");
                     Bar((int)arr[i]);
                     Thread.sleep(300);
                }
                if(arr[i] >= 60 && arr[i] < 70)
                {
                     System.out.println("Initiating Functions ..");
                     Bar((int)arr[i]);
                }
                if(arr[i] >= 70 && arr[i] < 80)
                {
                     System.out.println("Initiating  Effects..");
                     Bar((int)arr[i]);
                }
                if(arr[i] >= 80 && arr[i] < 90)
                {
                     System.out.println("Initiating Animation Config ..");
                     Bar((int)arr[i]);
                }
                if(arr[i] >= 90 && arr[i] < 100)
                {
                    System.out.println("Getting Biometric Data .Almost Done..");
                    Bar((int)arr[i]);
                }
                Thread.sleep(350);
            }
            catch (InterruptedException ie)
            {
                ie.printStackTrace();
            }
        }
        System.out.println("\u000C");
        System.out.println("Completed Initialisation ..");
        Bar(100);
    }
    
    public static void Bar(int perc)
    {
        int rest = 100 - perc;
        System.out.print("|");
        for(int i = 1; i <=(int)(perc/5) ; i++)
        {
            System.out.print("/");
        }
        for(int i = 1; i <=(int)(rest/5) ; i++)
            System.out.print(" ");
        System.out.println("|");

        try
        {
            Thread.sleep(800);
        }
        catch (InterruptedException ie)
        {
            ie.printStackTrace();
        }
    }
}