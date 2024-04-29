public class Account {
    private double balance;
    private int accountNumber;
    private static int numberOfAccounts=1000;


    public Account(double balance){
        this.balance=balance;
        this.accountNumber=numberOfAccounts++;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public double getBalance(){
        return balance;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public void deposit(Double amount){
        balance+=amount;
        System.out.println("Deposit");
    }
    public void withdraw(Double amount){
        if (balance>=amount){
            balance-=amount;
        }else{
            System.out.println("Withdraw");
        }
    }
    @Override
    public String toString(){return String.format("Account Details \n Account Number: "+accountNumber+" Account balance: ");}
}
