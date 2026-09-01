class Student
{
    private int age;
    private String name;

    public void setAge(int age)
    {
        if(age >= 18) this.age = age;
        else System.out.println("error");
    }
    public int getAge()
    {
        return this.age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
public class Encapsulation 
{
    public static void main(String[] args) 
    {
        Student obj = new Student();
         obj.setAge(18);
         System.out.println(obj.getAge());
         obj.setName("gjhxdgjxgsjxgjsgxjs");
         System.out.println(obj.getName());
    }
}
