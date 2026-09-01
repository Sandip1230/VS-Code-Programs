public abstract class Schools
{
    public void School(String SName)
    {
        System.out.println("School's name is : ");
        System.out.println( SName );
        System.out.println();
    }
    
    public abstract void percentage();
}
//__________________________________________________________________________________________________________________
class  ANMS extends Schools
{
    public void percentage()
    {
        float perc = (float)((97.0 / 100.0) *100 );
        System.out.println("School's highest percentage is : " + perc);
        System.out.println();
    }
}
//__________________________________________________________________________________________________________________
class  StAugs extends Schools
{

    public  void percentage()
    {
        double perc =(float) ((99.0 / 100.0) *100);
        System.out.println("School's highest percentage is : " + perc);
        System.out.println();
    }
}

//__________________________________________________________________________________________________________________
class  Douglas extends Schools
{

    public void percentage()
    {
        double perc =(float) ((79.0 / 100.0) *100); 
        System.out.println("School's highest percentage is : " + perc);
        System.out.println();
    }
}



class Caller
{
    public static void main(String[] args) 
    {
        ANMS obj1 = new ANMS();
        obj1.School("ANMS");
        obj1.percentage();

        StAugs obj2 = new StAugs();
        obj2.School("St. Augustines Day School ");
        obj2.percentage();

        Douglas obj3 = new Douglas();
        obj3.School("Douglas Day School ");
        obj3.percentage();
    }
}
