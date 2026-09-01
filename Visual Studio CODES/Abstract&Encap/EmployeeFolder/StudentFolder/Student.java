package StudentFolder;

public class Student 
{
    private int roll;
    private String name;
    private int phys;
    private int chem;
    private int maths;
// -----------------------------------------------------------------------------------------------


    public void setRoll(int roll) 
    {
        
        this.roll = roll;
    }
    public int getRoll() 
    {
        return roll;
    }
// ------------------------------------------------------------------------------------------------


    public void setName(String name) 
    {
        this.name = name;
    }
    public String getName() 
    {
        return name;
    }
// -------------------------------------------------------------------------------------------------


   public void setPhys(int phys)  //121  100
    {
        this.phys = phys;
        if(phys < 100 && phys > 0)
            this.phys = phys;
        else 
            throw new RuntimeException("Marks must NOT be less than 0 OR greater than 100 ");

    }
        public int getPhys() 
        {
            return phys; 
        }
 // -------------------------------------------------------------------------------------------------


   public void setChem(int chem) 
    {
         if(chem < 100 && chem > 0)
            this.chem = chem;
        else 
            throw new RuntimeException("Marks must NOT be less than 0 OR greater than 100 "); 
        
    }
   public int getChem() 
    {
        return chem;
    }
//---------------------------------------------------------------------------------------------------


    public void setMaths(int maths) 
    {
          if(maths < 100 && maths > 0)
            this.maths = maths;
        else 
            throw new RuntimeException("Marks must NOT be less than 0 OR greater than 100 ");
    }
   public int getMaths() 
    {
        return maths;
    }
}
