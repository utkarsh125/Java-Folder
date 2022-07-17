package Classes;

public class account {
    private String number;
    private double balance;
    private String CustomerName;
    private String CustomerEmailAddress;
    private String customerPhoneNumber;

    //this is constructor calling another constructor
    public account(){
        this("6789",2.50,"Default name","Default address","Default phone");
        System.out.println("Empty constructor called.");
    }
    public account(String number, double balance, String CustomerName, String CustomerEmailAddress, String customerPhoneNumber){
        System.out.println("Account constructor with Parameters called");
        this.number = number;
        this.balance = balance;
        this.CustomerName = CustomerName;
        this.customerPhoneNumber = customerPhoneNumber;
        this.CustomerEmailAddress = CustomerEmailAddress;
    }


    public account(String CustomerName, String CustomerEmailAddress, String customerPhoneNumber) {
        this("12455",199.59,CustomerName, CustomerEmailAddress, customerPhoneNumber);
    }
    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of "+depositAmount+" was successful, new balance: "+this.balance);
    }

    public void withdrawal(double withdrawalAmount){
        if(this.balance - withdrawalAmount < 0){
            System.out.println("Only "+ this.balance + " available, withdrawal not possible");
        }else{
            this.balance-=withdrawalAmount;
            System.out.println("Withdrawal of " +withdrawalAmount+" processed. Remaining balance: "+this.balance);
        }
    }

    
    public String getNumber() {
        return number;
    }

  
    public void setNumber(String number) {
        this.number = number;
    }

  
    public double getBalance() {
        return balance;
    }

    
    public void setBalance(double balance) {
        this.balance = balance;
    }

    
    public String getCustomerName() {
        return CustomerName;
    }

    
    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    
    public String getCustomerEmailAddress() {
        return CustomerEmailAddress;
    }

    
    public void setCustomerEmailAddress(String CustomerEmailAddress) {
        this.CustomerEmailAddress = CustomerEmailAddress;
    }

    
    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    
    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

}
