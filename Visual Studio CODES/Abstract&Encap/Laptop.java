public interface Laptop
{
   public static void Company(String name)
   {
    System.out.println(name);
   }

    public abstract void Battery(); 
    public abstract void Speaker(); 
    public abstract void Keyboard(); 
}
//------------------------------------------------------------------------------------------------------------
class HP implements Laptop
{
    @Override
    public void Battery() 
    {
        System.out.println("    Lithium-ion batteries    of    HP");
    }
    
    @Override
    public void Speaker() 
    {
        System.out.println("    HyperX 7.1. speakers     of    HP");
    }
    
    @Override
    public void Keyboard() 
    {
        System.out.println("    HIGH Resolution KEYBOARD of    HP \n");
    }

    public void Company(String string) 
    {
        System.out.println("Hp");
    } 
}
//------------------------------------------------------------------------------------------------------------
class Dell implements Laptop
{
    public void Battery() 
    {
        System.out.println("    Rapid re-charge capability  battery       of DELL ");
    }
    public void Speaker() 
    {
        System.out.println("    Dell Stereo Soundbar  AC511M speakers     of DELL ");
    }
    public void Keyboard() 
    {
        System.out.println("    Long - Lasting  Keyboard                  of DELL \n");
    }
    
    public void Company(String string) 
    {
        System.out.println("Dell");
    }
}
//------------------------------------------------------------------------------------------------------------

class ASUS implements Laptop
{
    public void Battery() 
    {
        System.out.println("    High Coloumbic and energy efficiency battery      of ASUS ");
    }
    public void Speaker() 
    {
        System.out.println("    Quad-speaker array speaker                        of ASUS ");
    }
    public void Keyboard() 
    {
        System.out.println("    Faster text entry controller  keyboard            of ASUS \n");
    }
    public void Company(String string) 
    {
        System.out.println("ASUS");
    }
    
}

//------------------------------------------------------------------------------------------------------------

class Test 
{
     public static void main(String[] args) 
     {
        HP obj1 = new HP();

        obj1.Company("HP"); 
        obj1.Battery();
        obj1.Speaker();
        obj1.Keyboard();


        Dell obj2 = new Dell();

        obj2.Company("Dell");
        obj2.Battery();
        obj2.Speaker();
        obj2.Keyboard();


        ASUS obj3 = new ASUS();

        obj3.Company("ASUS");
        obj3.Battery();
        obj3.Speaker();
        obj3.Keyboard();
     }
}
