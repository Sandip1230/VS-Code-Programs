public abstract class Shape
{
   public void category(String shape)
   {
    System.out.println(shape);
   }

    public abstract void perimeter(); //to be implemented, prototype
}
//-------------------------------------------------------------
class Circle extends Shape
{
    public void perimeter() 
    {
        float radius = 5.6f;
        System.out.println("Perimeter: " + (2 * Math.PI * radius));
    }
}
//-------------------------------------------------------------

class Rectangle extends Shape
{
    public void perimeter() 
    {
        System.out.println("perimeter: " + (2 * (6 + 4)));
    }
}
//-------------------------------------------------------------

class Square extends Shape 
{
  public void perimeter() 
  {
    int side = 7;
    System.out.println("perimeter: " + (4 * side));
  }  
} 


class TestShape 
{
     public static void main(String[] args) 
     {
        Circle obj1 = new Circle();
        obj1.category("sphere"); 
        obj1.perimeter();
        Rectangle obj2 = new Rectangle();
        obj2.category("cuboid");
        obj2.perimeter();
        Square obj3 = new Square();
        obj3.category("cube");
        obj3.perimeter();
     }
}