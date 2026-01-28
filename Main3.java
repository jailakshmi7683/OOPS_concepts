public class Main3 {

    public static void main(String[] args) {
        bankInterface myAccount = new BankAccount();
        
        myAccount.deposit(500);
        myAccount.withdraw(200);
        System.out.println("Current Balance: " + myAccount.getBalance());
        
        loanInterface myLoanAccount = (loanInterface) myAccount;
        myLoanAccount.applyForLoan(1000);
    }
    
}
