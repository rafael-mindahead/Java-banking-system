import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner options = new Scanner(System.in);
        double balance = 2500.00;
        int operations = 0 ;



        //This is where the system design begins, although it is in its basic stage.
        System.out.println("---------------------------------");
        System.out.println("initial customer data:");


        System.out.println("name:     Rafael Alves");
        System.out.println("account type: Checking Account");
        System.out.printf("Initial balance: U$ %.2f%n", balance);

        System.out.println("---------------------------------");


        while (operations == 0 ) {
            System.out.println("\noperations:");

            System.out.println("1-  check balances  ");
            System.out.println("2-  receive value   ");
            System.out.println("3-  transfer value  ");
            System.out.println("4-       out        ");


            System.out.println("Enter the desired option.");
            int choose = options.nextInt();
            double received = 0;
            if (choose == 1) {
                System.out.printf("The balance is: U$ %s", balance);

            } else if (choose == 2) {
                System.out.println("Please state the amount to be received: U$");
                received = options.nextInt();
                balance += received;

                System.out.printf("it is a new balence: U$ %s", balance);
            } else if (choose == 3) {

                System.out.println("Who do you want to transfer to?");
                System.out.println("What is the value?");
                String who = options.next();
                double transferer = options.nextDouble();
                double newBalance;
                if (transferer > balance) {
                    System.out.println("---------------------------------");
                    System.out.println("Operation denied: Insufficient funds.");
                    System.out.printf("Your current balance is: U$ %.2f%n", balance);
                    System.out.println("---------------------------------");
                }else {
                    newBalance = received + balance - transferer;
                    System.out.println(who);
                    System.out.printf("U$: %s", transferer);
                    System.out.printf("\nit is a new balence: U$ %s", newBalance);
                }
            } else if (choose == 4) {
                System.out.println("the system is closed ");
                operations += 1;
            }else {
                System.out.println("invalid option");
            }
        }
        options.close();
    }
}