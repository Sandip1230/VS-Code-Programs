import java.util.*;
class Node
{
    int data ;
    Node next;
    public Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
public class LinkedList
{
    Node head = null;
    public void add(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
            head = newNode;
        else
        {
            Node tempNode = head;
            while(tempNode.next != null)
                tempNode = tempNode.next;
            tempNode.next = newNode;
        }
        System.out.println("Data added successfull");
    }
    public void delete()
    {
        if(head.next == null)
        {
            System.out.println("Data deleted "+head.data);
            head = null;
        }
        else 
        {
            Node prevNode = head;
            Node nextNode = head.next;
            while(nextNode.next != null)
            {
                prevNode = nextNode;
                nextNode = nextNode.next;
            }
            prevNode.next = null;
            System.out.println("Data deleted " + nextNode.data);
        }
    }
    public void printList()
    {
        if(head == null)
            System.out.println("No element present in the List");
        else 
        {
            if(head.next == null)
                System.out.println(head.data);
            else
            {
                Node tempNode = head;
                while(tempNode.next != null)
                {
                    System.out.print(tempNode.data + "->");
                    tempNode = tempNode.next;
                }
                System.out.print(tempNode.data);
            }
        }
        System.out.println();
    }
    public static void main(String [] args)
    {
        System.out.println("\u000C");
        Scanner sc = new Scanner(System.in);
        LinkedList obj = new LinkedList();
        
        while(true)
        {
            System.out.println("\n > > > > > > > > > > > > > ");
            System.out.println("Enter according to required operation : ");  
            System.out.println("1] Add Element to list   \n2] Delete an Element to list from last   \n3] Print list     \n0] Exit");
            char ch  = sc.next().charAt(0);
            
            switch(ch)
            {
                case '1' : 
                    System.out.println("\u000C");
                    System.out.println("Element to be added :: \n\nEnter the element : ");
                    int n = sc.nextInt();
                    obj.add(n);
                    break;
                case '2' : 
                    System.out.println("\u000C");
                    System.out.println("Deleting an Element :::");
                    obj.delete();
                    break;
                case '3' : 
                    System.out.println("\u000C");
                    System.out.println("Printing the list :::");
                    obj.printList();
                    break;
                case '0' :
                    System.out.println("\u000C");
                    System.out.println("Program terminates ! ");
                    System.exit(0);
                default :
                    System.out.println("Invalid choice ! . Choose options below >>>");
            }
        }
    }
}