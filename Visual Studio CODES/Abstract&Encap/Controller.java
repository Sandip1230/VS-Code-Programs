import java.util.*;
public class Controller extends BankAccounts
{
    public static void main(String[] args) {
        System.out.println("\u000C");
        Scanner sc = new Scanner(System.in);
        //BankAccounts obj = new BankAccounts();
        while (true) {
            System.out.println("\n > > > > > > > > > > > > > ");
            System.out.println("Enter according to required operation:");
            System.out.println("1] Register Account\n2] Delete Account\n3] Cash Deposit\n4] Cash Withdrawal");
            System.out.println("5] Check Balance \n0] Exit");
            String temp = sc.nextLine();
            switch (temp.charAt(0)) {
                case '1': // Register Account
                    try {
                        System.out.println("Register Account ::");
                        System.out.println("Enter the Account Holder Name [String format]: ");
                        String nR = sc.nextLine();
                        System.out.println("Enter Date of Birth [DD/MM/YY] [String format]: ");
                        String dob = sc.nextLine();
                        System.out.println("Enter the registered phone number [Long format]: ");
                        long ph = Long.parseLong(sc.nextLine());
                        System.out.println("Enter a 4-DIGIT PIN CODE [Integer format]: ");
                        int pR = Integer.parseInt(sc.nextLine());
                        RegisterAcc(nR, dob, pR, ph);
                    } catch (Exception e) {
                        System.out.println("Invalid input! Please try again.");
                    }
                    break;
                case '2': // Delete Account
                    try {
                        System.out.println("Delete Account ::");
                        System.out.println("Enter the Card Number [String Format]: ");
                        String c = sc.nextLine();
                        System.out.println("Enter the 4-DIGIT PIN CODE [Integer Format]: ");
                        int pD = Integer.parseInt(sc.nextLine());
                        deleteAcc(c, pD);
                    } catch (Exception e) {
                        System.out.println("Invalid input! Please try again.");
                    }
                    break;
                case '3': // Cash Deposit
                    try {
                        System.out.println("Cash Deposit ::");
                        System.out.println("Enter the Card Number [String Format]: ");

                        String cDep = sc.nextLine();
                        System.out.println("Enter the 4-DIGIT PIN CODE [Integer Format]: ");
                        int pDep = Integer.parseInt(sc.nextLine());
                        System.out.println("Enter the Amount to be credited [float Format]: ");
                        float amtDep = Float.parseFloat(sc.nextLine());  
                        Deposit(cDep, pDep, amtDep);
                    } catch (Exception e) {
                        System.out.println("Invalid input! Please try again.");
                    }
                    break;
                case '4': // Cash Withdrawal
                    try {
                        System.out.println("Cash WithDrawal ::");
                        System.out.println("Enter the Card Number [String Format]: ");
                        String cWith = sc.nextLine();
                        System.out.println("Enter the 4-DIGIT PIN CODE [Integer Format]: ");
                        int pWith = Integer.parseInt(sc.nextLine());
                        System.out.println("Enter the Amount to be withdrawn [float Format]: ");
                        float amtWith = Float.parseFloat(sc.nextLine());
                        Withdraw(cWith, pWith, amtWith);
                    } catch (Exception e) {
                        System.out.println("Invalid input! Please try again.");
                    }
                    break;
                    case '5': // Delete Account
                    try {
                        System.out.println("Check Balance ::");
                        System.out.println("Enter the Card Number [String Format]: ");
                        String cCB = sc.nextLine();
                        System.out.println("Enter the 4-DIGIT PIN CODE [Integer Format]: ");
                        int pCB = Integer.parseInt(sc.nextLine());
                        checkBalance(cCB, pCB);
                    } catch (Exception e) {
                        System.out.println("Invalid input! Please try again.");
                    }
                    break;
                case '0': // Exit
                    System.out.println("Program terminates!");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Choose a valid option.");
                    break;
            }
        }
    }
}