package EmployeeFolder;

public class Employee 
{
    private int level;
    private double salary;

    public void setLevel(int level)
    {
        if(level > 0 && level <= 13)
            this.level = level;
        else 
        // System.out.println("Level must be less 13 & positive"); //not a good approach because it will run further
            throw new RuntimeException("Level must be less than 13 & positive"); 
            
    }
    public int getLevel()
    {
        return this.level;
    }
    public double getSalary() 
    {
        return salary;
    }
    public void setSalary(double salary) 
    {
        if(this.level >= 1 && this.level <= 5) 
        {
            this.salary = salary;
        }
        else if(this.level > 5 && this.level <= 10)
        {
            this.salary = salary;
        } 
        else
        {
            this.salary = salary;
        }
    }
}