package p1;
public class bank {
    public String name;
    private int balance;
    protected double accountNo ;

    public void setBalance(int balance){
        this.balance=balance;
    }

    public int getBalance(){
        return balance;
    }

    public void setAccountNo(double accountNo){
        this.accountNo = accountNo;
    }

    public double getAccountNo(){
        return accountNo;
    }

    public void deposit(int amount){
        balance += amount;
        System.out.println("Deposited: "+ amount);
    }

    public void withdraw(int amount){
        if(amount > balance){
            System.out.println("Insufficient balance");
            return;
        }
        balance -= amount;
        System.out.println("Withdrawn: "+ amount);
    }

    public void printDetails(){
        System.out.println("Account Holder Name: "+ name);
        System.out.println("Account Number: "+ accountNo);
        System.out.println("Account Balance: "+ getBalance());
    }

}