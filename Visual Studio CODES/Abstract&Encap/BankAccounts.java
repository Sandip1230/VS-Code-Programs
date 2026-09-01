public class BankAccounts
{
    static int n = 20 , t = 0;
    static float amt[] = new float[n];
    static String holders[] = new String[n];
    static String cardNo[]    = new String[n];
    static String DoB[] = new String[n];
    static long phNo[] = new long[n];
    static int pin[] = new int[n];
    //Register Account
    public static void RegisterAcc(String name , String dob, int p , long ph)
    {
        for(int i = 0; i<n ; i++){
            if(holders[i] == null){
                t = i;
                break;
            }
        }
        if(t < holders.length)
        {
            holders[t] = name;
            DoB[t] = dob;
            pin[t] = p;
            phNo[t] = ph;
            cardNo[t] = getCardNo();
            System.out.println("Account Registered successfully ! : ");
            System.out.println("- - - - - - D E T A I L S - - - - - - - - ");
            System.out.println("Name of the Account Holder : " + holders[t]);
            System.out.println("DATE OF BIRTH [DD.MM.YY] : "+DoB[t]);
            System.out.println("Phone Number (as mentioned) : +91 XXXXXX"+ (phNo[t]%10000));
            System.out.println("\nA L L O T E D   A C C O U N T   N U M B E R :   ["+cardNo[t]+"]");
            t++;
        }
        else
             System.out.println("NO MORE ACCOUNTS CAN BE REGISTERED ! : ");
    }
    public static String getCardNo()
    {
        String r = ""+Math.random();
        r = r.substring(2,6)+ " " + r.substring(6,9) + " " + r.substring(9,13);
        return r;
    }
    
    //Delete Account
    public static void deleteAcc(String c , int p)
    {
        int temp = -99;
        for(int i = 0; i<n;i++){
            if(cardNo[i].equals( c )){
                temp = i;
                break;
            }
        }
        if(temp != -99){
            if(p == pin[temp]){
                holders[temp] = null;
                cardNo[temp] = null;
                System.out.println("Account Removed Successfully ! : ");
            }
            else
                System.out.println("Incorrect Pin Entered ! : ");
        }
        else
            System.out.println("No such Account found ! : ");
    }
    
    //Cash Deposit
    public static void Deposit(String c , int p , float a)
    {
        int temp = -99;
        for(int i = 0; i<n;i++){
            if(cardNo[i].equals(c) ){
                temp = i;
                System.out.println("Account found !");
                break;
            }
        }
        if(temp != -99)
        {
            if(p == pin[temp]){
                if(a > 0){
                    amt[temp] = amt[temp] + a;
                    System.out.println("\nAccount Holder - "+holders[temp]);
                    System.out.println("Rs "+a+" is credited to your  bank account");
                    System.out.println("\nNet Balance >>>> Rs "+ amt[temp]);
                }
                else
                    System.out.println("Invalid Amount Entered !");
            }
            else
                System.out.println("Incorrect Pin Entered ! : ");
        }
        else
            System.out.println("No such Account found ! : ");
    }
    
    //Cash Withdraw
    public static void Withdraw(String c , int p , float a)
    {
        int temp = -99;
        for(int i = 0; i<n;i++){
            if(cardNo[i].equals(c) ){
                temp = i;
                System.out.println("Account found !");
                break;
            }
        }
        if(temp != -99)
        {
            if(p == pin[temp]){
                if(a < amt[temp]){
                    amt[temp] = amt[temp] - a;
                    System.out.println("\nAccount Holder - "+holders[temp]);
                    System.out.println("Rs "+a+" is credited from your  bank account");
                    System.out.println("\nNet Balance >>>> Rs "+ amt[temp]);
                }
                else
                    System.out.println("Amount to be withdrawn is greater than present Principle Amount ! : ");
            }
            else
                System.out.println("Incorrect Pin Entered ! : ");
        }
        else
            System.out.println("No such Account found ! : ");
    }
    
    public static void checkBalance(String c , int p)
    {
        int temp = -99;
        for(int i = 0; i<n;i++){
            if(cardNo[i].equals(c) ){
                temp = i;
                System.out.println("Account found !");
                break;
            }
        }
        if(temp != -99)
        {
            if(p == pin[temp]){
                System.out.println("Account Holder - "+holders[temp]);
                System.out.println("Date of Birth - "+DoB[temp]);
                System.out.println("\nNet Balance > > Rs "+ amt[temp]);
            }
            else
                System.out.println("Incorrect Pin Entered ! : ");
        }
        else
            System.out.println("No such Account found ! : ");
    }
}