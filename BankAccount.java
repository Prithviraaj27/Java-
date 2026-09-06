import java.util.Scanner;

public class BankAccount {
    private int balance;

    public void  deposit(int amount) {
        balance += amount ;
        System.out.println("Deposited Successfully");
    }
    public void  withdraw(int amount) {
        if(amount < balance){
            balance -= amount;
            System.out.println("Withdrawn Successfully");
        }else{
            System.out.println("Insufficient Balance");
        }
    }
    public void getBalance() {
        System.out.println("Balance: "+balance);
    }
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Bank Account");


        while (true) {

            System.out.println(" ");
        System.out.println("1.Check Balance");
        System.out.println("2.Deposit");
        System.out.println("3.Withdraw");
        System.out.println("4.Exit");
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();

        int amount = 0;



            if (choice == 2 || choice == 3) {
                System.out.println("Enter amount: ");
                amount = sc.nextInt();

            }


            switch (choice) {
                case 1:
                    ba.getBalance();
                    break;

                case 2:
                    ba.deposit(amount);
                    break;

                case 3:
                    ba.withdraw(amount);
                    break;

                case 4:
                    System.out.println("Thank you for using Bank Account");
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}