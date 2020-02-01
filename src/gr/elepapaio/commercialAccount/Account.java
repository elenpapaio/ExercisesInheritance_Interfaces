package gr.elepapaio.commercialAccount;

public class Account {
    private String owner;
    private double balance;
    private int numberOfTransactions;

    public Account(){

    }

    public Account(String owner, double balance, int numberOfTransactions) {
        this.owner = owner;
        this.balance = balance;
        this.numberOfTransactions = numberOfTransactions;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getNumberOfTransactions() {
        return numberOfTransactions;
    }

    public void setNumberOfTransactions(int numberOfTransactions) {
        this.numberOfTransactions = numberOfTransactions;
    }

    public void withdraw(double withdrawAmount) {
        if (withdrawAmount < balance) {
            balance -= withdrawAmount;
            System.out.println("Withdrawal of " + withdrawAmount + " is successful");
            numberOfTransactions = numberOfTransactions+1;
        } else {
            System.out.println("Withdrawal of " + withdrawAmount+ " is not possible!");
        }
    }

    public void deposit(double depositAmount){
        balance+=depositAmount;
        System.out.println("Deposit of " + depositAmount + " is successful");
        numberOfTransactions = numberOfTransactions+1;
    }
}
