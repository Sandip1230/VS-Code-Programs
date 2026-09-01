package StudentFolder;
import java.util.*;

public class TestStudent 
{
    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);
        Student obj = new Student();
            System.out.println("Enter the roll no of the Student : ");
            int roll = sc.nextInt();
            obj.setRoll(roll);

            sc.nextLine();

            System.out.println("\nEnter the name of the Student : ");
            String name = sc.nextLine();
            obj.setName(name);

            System.out.println("<<   Enter the marks of the Students in 100   >>");
            System.out.println("\nEnter the Marks in phys of the Student : ");
            int phys = sc.nextInt();
            obj.setPhys(phys);


            System.out.println("\nEnter the Marks in chem of the Student : ");
            int chem = sc.nextInt();
            obj.setChem(chem);


            System.out.println("\nEnter the Marks in Maths of the Student : ");
            int maths = sc.nextInt();
            obj.setMaths(maths);

            
            System.out.println("   >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println("         | The Name is:               " + obj.getName());
            System.out.println("         | Roll no    :               " + obj.getRoll());
            System.out.println("         | Marks in Physics     :     " + obj.getPhys());
            System.out.println("         | Marks in Chemistry   :     " + obj.getChem());          
            System.out.println("         | Marks in Mathematics :     " + obj.getMaths());
            sc.close();

            AVG(  obj.getPhys(),obj.getChem(),obj.getMaths()  );

    }

    public static void AVG(int phys , int chem , int maths)
    {
        System.out.println(phys);
        System.out.println("\n\nThe Average Marks is >>>>   " + ((phys + chem + maths) / 3));

    }
}
