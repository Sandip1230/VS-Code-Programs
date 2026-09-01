import java.util.*;
public class SubjectAvg
{    
    public static void main(String[] args)
    {
        System.out.println("\u000C");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the no of the students :");
        int n = sc.nextInt();
        
        System.out.println("Enter the total marks of each subject in the exam :");
        int total = sc.nextInt();
        total = total * 4;
        
        int arr[][] = new int[n][4];
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0; j < 4 ; j++)
            {
                if(j == 0)
                {
                    System.out.println("\nEnter the mark in PHYSICS of student no : "+(i+1));
                    arr[i][0]= sc.nextInt();
                }
                else if (j==1)
                {
                    System.out.println("Enter the mark in CHEMISTRY of student no : "+(i+1));
                    arr[i][1]= sc.nextInt();
                }
                else if (j==2)
                {
                    System.out.println("Enter the mark in COMPUTER of student no : "+(i+1));
                    arr[i][2]= sc.nextInt();
                }
                else if (j==3)
                {
                    System.out.println("Enter the mark in MATHS of student no : "+(i+1));
                    arr[i][3]= sc.nextInt();
                }
            }
        }
        int physSum = 0,chemSum = 0, MathsSum = 0, CompSum = 0;
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0; j < 4 ; j++)
            {
                if(j == 0)
                    physSum = physSum + arr[i][j];
                else if (j==1)
                    chemSum = chemSum + arr[i][j];

                else if (j==2)
                    CompSum = CompSum + arr[i][j];
                else if (j==3)
                    MathsSum = MathsSum + arr[i][j];
            }
        }
        
        System.out.println("Student no.    PHYSICS       CHEMISTRY     COMPUTER       MATHS       AVERAGE     GRADE");
        for(int i = 0 ; i < n ; i++)
        {
             System.out.print("   "+(i+1)+"           ");
             int SumMarks = 0;
               for(int j = 0; j < 4 ; j++)
               {
                  int num = arr[i][j];
                  System.out.print("   "+num+"         ");
                  SumMarks = SumMarks + num;
               }
            System.out.print( (float)(SumMarks/4)+"           ");
            double temp = SumMarks/total ;
            int perc = (int)temp*100;
            
                 if(perc <= 100 && perc >= 90)
                            System.out.print("A");
                 else if(perc < 90  && perc >= 80)
                            System.out.print("B");
                 else if(perc < 80  && perc >= 70)
                            System.out.print("C");
                 else if(perc < 70  && perc >= 50)
                            System.out.print("D");
                 else
                            System.out.print("F");
                
            System.out.println();
            System.out.println(SumMarks+" is the sum of the row..");
        }
    }
}