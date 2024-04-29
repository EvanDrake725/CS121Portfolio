import java.util.ArrayList;
public class Customer {
    String first;
    String last;
    int pin;
    ArrayList<Account> accountList=new ArrayList<>();

    public Customer(String first, String last, int pin){
        this.first=first;
        this.last=last;
        this.pin=pin;
    }
    public void setFirst(String first){
        this.first=first;
    }
    public void setLast(String last){
        this.last=last;
    }
    public void setPin(int pin){
        this.pin=pin;
    }
    public String getFirst(){
        return first;
    }
    public String getLast(){
        return last;
    }
    public int getPin(){
        return pin;
    }
    public void addAccount(Account newAccount){
        accountList.add(newAccount);
    }
    public void removeAccount(Account newAccount){
        accountList.remove(newAccount);
    }
    public ArrayList<Account> getAccountList(){
        return accountList;
    }
    public Account getAccount(int accountNumber){
        Account foundAcount=null;
        for(Account anAccount:accountList){
            if (anAccount.getAccountNumber()==accountNumber){
                foundAcount=anAccount;
                break;
            }
        }
        return foundAcount;
    }
    public StringBuilder getAllAccount(){
        StringBuilder accountString=new StringBuilder();
        for (Account accounts:accountList){
            accountString.append(String.format("Account Number: %s \nBalance: %s", accounts.getAccountNumber(), accounts.getBalance()));
        }
        return accountString;
    }
    @Override
    public String toString(){
        return String.format("Customer Name: %s %s\nPin: %s\n",first,last,pin);
    }
}
