public class BankAccount implements bankInterface, loanInterface {
    private double balance;
    private double loanBalance;

    public BankAccount() {
        this.balance = 0.0;
        this.loanBalance = 0.0;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void applyForLoan(double amount) {
        if (amount > 0) {
            loanBalance += amount;
            System.out.println("Loan applied for: " + amount);
        } else {
            System.out.println("Loan amount must be positive.");
        }
    }

    @Override
    public double getLoanBalance() {
        return loanBalance;
    }
}

