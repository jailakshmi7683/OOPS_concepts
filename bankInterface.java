interface bankInterface {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
    
}

interface loanInterface {
    void applyForLoan(double amount);
    double getLoanBalance();
}