import java.util.ArrayList;
public class Bank {
    ArrayList<Customer> allCustomers=new ArrayList<>();

    public void addCustomer(Customer newCustomer){
        allCustomers.add(newCustomer);
    }
    public void removeCustomer(Customer newCustomer){
        allCustomers.remove(newCustomer);
    }
    public Customer getCustomer(int pin){
        Customer foundCustomer=null;
        for(Customer customer:allCustomers){
            if (customer.getPin()==pin){
                foundCustomer=customer;
            }
        }
        return foundCustomer;
    }
    public StringBuilder getAllCustomers(){
        StringBuilder stringCustomer=new StringBuilder();
        for (Customer customer:allCustomers){
            stringCustomer.append(customer.toString());
        }
        return stringCustomer;
    }
}
