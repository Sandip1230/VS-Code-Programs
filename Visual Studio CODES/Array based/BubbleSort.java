import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the array elements ");

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        // Logic
        int flag = 0;
        for (int i = 0; i < n - 1; i++) 
        {
            for (int j = 0; j < n - 1 - i; j++) 
            {
                
                if (arr[j + 1] < arr[j]) 
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = 1;
                }
            }

            if (flag == 0)
                break;
        }

        System.out.println("The array elements are : ");

        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}