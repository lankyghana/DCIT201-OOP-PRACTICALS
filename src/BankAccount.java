public class BankAccount {
    private String accountNumber;
    private double balance;
    private String holdername;

    // constructors
    public BankAccount(String accountNumber, double balance, String holdername) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.holdername = holdername;
    }
    //Getters for AcNum, Balance & Holdername
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {

        return balance;
    }

    public String getHoldername() {

        return holdername;
    }
    //check to see if the deposit amount is more than 0
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 || balance >= amount) {
            this.balance -= amount;
            return true;
        }
        return false;
    }
public static void main(String[] args) {
        BankAccount myaccount = new BankAccount("3445233525", 34.53, "Daniel");
    System.out.println("You're balance is : $" +  myaccount.getBalance());
    myaccount.deposit(7000);
    System.out.println("You're balance after deposit is : $" +  myaccount.getBalance());
    myaccount.withdraw(9000);
    System.out.println("You're balance after withdraw is : $" +  myaccount.getBalance());
}
}