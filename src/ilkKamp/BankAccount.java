package ilkKamp;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    //Initializing the Constructor
    public BankAccount() {
        this("12345", 100.0, "default name", "default email", "default phone");
        System.out.println("Empty constructor called");
    }
    //Defining the Major Constructor
    public BankAccount(String number, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber=number;
        this.balance=balance;
        this.customerName=customerName;
        this.email=email;
        this.phoneNumber=phoneNumber;
    }
    // Overloading the Constructor
    public BankAccount(String customerName, String email, String phoneNumber) {
        this("9999", 100.52,customerName,email,phoneNumber);
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber=accountNumber;
    }
    public void setBalance(double balance) {
        this.balance=balance;
    }
    public void setCustomerName(String customerName) {
        this.customerName=customerName;
    }
    public void setEmail(String email) {
        this.email=email;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber=phoneNumber;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void depositFunds(double depositAmount) {
        System.out.println("New Balance = " + (this.balance+depositAmount));
        this.balance+=depositAmount;

    }

    public void withdrawFunds(double withdrawAmount) {
        this.balance=getBalance();
        if (this.balance>=withdrawAmount) {

            this.balance-=withdrawAmount;
            System.out.println("Successful Withdrawal, New Balance = " + this.balance);
        }else
            System.out.println("Insufficient Funds");

    }




}
