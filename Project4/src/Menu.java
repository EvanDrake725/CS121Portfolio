import java.util.ArrayList;
import java.util.Scanner;
public class Menu {
    Bank myBank=new Bank();
    Scanner input=new Scanner(System.in);
    public void runMenu(){
        String choice="";
        while(!choice.equalsIgnoreCase("4")) {
            System.out.println("---Menu---");
            System.out.println("1. Access Account");
            System.out.println("2. Open a New Account");
            System.out.println("3. Close all Accounts");
            System.out.println("4. Exit");
            System.out.print(">>> ");
            choice = input.next();
            switch(choice){
                case "1":
                    goToAccount();
                    break;
                case "2":
                    openAccount();
                    break;
                case "3":
                    closeAccount();
                    break;
                case "4":
                    System.out.println("Thanks for using the BSU bank :)");
                    break;
                default:
                {System.out.println("Invalid :(");}
            }
        }
    }
    public int goToAccount(){
        Customer currentCustomer=null;
        Account currentAccount=null;
        System.out.println("Please type account Pin:");
        int choice= input.nextInt();
        if (myBank.getCustomer(choice) != null) {
            currentCustomer = myBank.getCustomer(choice);
            System.out.println(currentCustomer.toString());
        } else {
            System.out.println("Customer not found");
            return 0;
        }
        System.out.println(currentCustomer.getAllAccount());
        System.out.println("Please enter the account number youd like to see:");
        choice=input.nextInt();
        if (currentCustomer.getAccount(choice)!=null){
            currentAccount=currentCustomer.getAccount(choice);
        }
        else{
            System.out.println("Account not found");
            return 0;
        }
        accountMenu(currentAccount,currentCustomer);
        return 0;
    }
    public void openAccount(){
        Customer currentCustomer=null;
        String choice="";
        if (!myBank.allCustomers.isEmpty()){
            System.out.println("Is the customer new Y/N");
            input.nextLine();
            choice=input.nextLine();
        }
        else{
            input.nextLine();
        }
        if (choice.equalsIgnoreCase("N")){
            System.out.println("Please enter your PIN:");
            int pin=input.nextInt();
            if (myBank.getCustomer(pin)!=null){
                currentCustomer=myBank.getCustomer(pin);
                System.out.println("Please enter an initial deposit");
                double dep =input.nextDouble();
                Account newAccount=new Account(dep);
                currentCustomer.addAccount(newAccount);
                System.out.printf("New account opened!\nAccount Number: %s\n", newAccount.getAccountNumber());
            }
            else{
                System.out.println("Pin not found!");
            }
        }
        else{
            System.out.println("Enter your first name");
            String first=input.nextLine();
            System.out.println("Enter your last name");
            String last=input.nextLine();
            System.out.println("Enter your pin");
            int pin=input.nextInt();
            Customer newCustomer=new Customer(first,last,pin);
            System.out.println("Please enter an initial deposit");
            double deposit=input.nextDouble();
            Account newAccount=new Account(deposit);
            SuperAccount account=new SuperAccount(deposit);
            if (deposit>=10000.00){
                account.test(deposit);
            }
            newCustomer.addAccount(newAccount);
            System.out.printf("New account opened\nAccount number: %s\n", newAccount.getAccountNumber());
            myBank.addCustomer(newCustomer);
        }
    }
    public void closeAccount(){
        System.out.println("Please enter your pin to remove account");
        int pin=input.nextInt();
        if(myBank.getCustomer(pin)!=null){
            myBank.removeCustomer(myBank.getCustomer(pin));
            System.out.println("Customer account deleted");
        }
        else{
            System.out.println("Could not find customer.");
        }
    }
    public void accountMenu(Account currentAccount, Customer currentCustomer){
        String choice="";
        Double deposit=0.0;
        SuperAccount acc=new SuperAccount(deposit);
        while(!choice.equals("5")&&!choice.equals("4")){
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Account Balance");
            System.out.println("4. Close Account");
            System.out.println("5. Exit");
            choice=input.next();
            switch(choice){
                case "1":
                    System.out.println("Please enter deposit amount: ");
                    deposit=input.nextDouble();
                    currentAccount.deposit(deposit);
                    if (deposit>=1){
                        acc.test(deposit);
                    }
                    break;
                case "2":
                    System.out.println("Please enter withdraw amount: ");
                    Double withdraw=input.nextDouble();
                    currentAccount.withdraw(withdraw);
                    break;
                case "3":
                    System.out.printf("Account balance %.2f\n", currentAccount.getBalance());
                    break;
                case "4":
                    System.out.println("Deleting Account...");
                    currentCustomer.removeAccount(currentAccount);
                    break;
                case "5":
                    break;
                default:
                    System.out.println("Invalid selection");
            }
        }
    }
}
