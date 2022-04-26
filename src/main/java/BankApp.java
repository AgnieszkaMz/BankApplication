import java.util.Scanner;
public class BankApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello in our bank!");
        System.out.println("How many users you want to add?");
        int amountNewAccount = scanner.nextInt();
        Account tableOfNewAccounts [] = new Account[amountNewAccount];
        for(int i = 0; 1 < tableOfNewAccounts.length; i++){
            tableOfNewAccounts[i] = new Account();
            tableOfNewAccounts[i].createAccount();
            tableOfNewAccounts[i].showAccount();
        }

        int choice;
        do {System.out.println("1. Display all accounts");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdrawal money");
            System.out.println("4. Exit app");
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
//                   account.showAccount();
                    break;
                case 2:
                    System.out.println("Enter account number to deposit: ");
                    String accountNumber = scanner.next();
                    boolean found = false;
                    for(int i = 0; i < tableOfNewAccounts.length; i++){
                        found = tableOfNewAccounts[i].search(accountNumber);
                        if(found){
                            tableOfNewAccounts[i].depositMoney();
                        }
                }
//                    account.depositMoney();
                    break;
                case 3:
//                    account.withdrawal();
                    break;
                case 4:
                    System.out.println("Thank you, bye bye");
                    break;
            }
        }
        while(choice != 4);


    }
}

