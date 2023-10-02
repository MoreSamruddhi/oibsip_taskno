import java.util.Scanner;

public class ATMInterface {
   
    public static void main(String[]args)
    {
        System.out.println("____________Welcome to ATM Interface____________");
        int balance =0, withdraw, deposit;
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println("");
            System.out.println("1: WITHDRAW");
            System.out.println("2: DEPOSIT");
            System.out.println("3: BALANCE");
            System.out.println("4: EXIT");
            System.out.println("_________________________________");
            System.out.println("");
            System.out.println("Select option to perform operation : ");
            System.out.println("_________________________________");
            System.out.println("");
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                System.out.println("_________________________________");
                System.out.println("Enter Money to withdraw - ");
                withdraw = sc.nextInt();
                if(balance >= withdraw)
                {
                    balance = balance - withdraw;
                    System.out.println("Withdraw Completed");
                }
                else
                {
                    System.out.println("_________________________________");
                    System.out.println("");
                    System.out.println("Balance is Insufficient...");
                }
                System.out.println("_________________________________");
                break;

                case 2:
                System.out.println("_________________________________");
                System.out.println("Enter Money to Deposit - ");
                deposit = sc.nextInt();
                balance = balance + deposit;
                System.out.println("_________________________________");
                System.out.println("");
                System.out.println("Money Deposited Successfully");
                System.out.println("________________________");
                break;

                case 3:
                System.out.println("_________________________________");
                System.out.println("");
                System.out.println("Balance -" +balance);
                System.out.println("________________________");
                break;

                case 4:
                System.out.println("________________________");
                System.out.println("");
                System.out.println("______Thank You for using ATM Interface______");
                System.out.println("________________________");
                System.exit(0);
            }
        }
    }
 
}
