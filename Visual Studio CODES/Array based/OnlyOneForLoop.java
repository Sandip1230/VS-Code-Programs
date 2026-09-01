import java.util.Scanner;

public class OnlyOneForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers you want to give :");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the array elements ");
        System.out.println("* The elements will be printed after accepting the inputs *\n");

        // LOGIC
        int flag = 0;
        for (int i = 0; i < n; i++) {
            if (flag == 0)
                arr[i] = sc.nextInt(); // If flag is 0 , it will take the inputs

            if (i == n - 1) // Once the loop takes the n th input , flag will be changed to 1
            {
                flag++; // Flag shifts to 1
                i = 0; // i again changes to 0 i.e. The loop will execute again
                System.out.println("\n\n");
            }
            if (flag == 1) {
                System.out.print(arr[i] + " "); // Printing the array elements

                if (flag == 1 && i == n - 2) // To print the last element [ EXCEPT THIS , THE LAST ELEMENT WILL NOT BE
                                             // PRINTED ]
                    System.out.print(arr[i + 1] + " ");
            }

            else if (flag > 1) // Once the loop prints the accepted elements , the loop will break
                               // automatically
                break;
        }
    }
}