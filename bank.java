class bank {
    String name;
    int amount;
    private int balance;
    protected double accountNo ;

    public void setBlance(int balance){
        this.balance=balance;
    }

    public int getBalance(){
        return balance;
    }

    public void setAccountNo(double accountNo){
        this.accountNo=accountNo;
    }

    public double getAccountNo(){
        return accountNo;
    }

    public void deposit(int amount){
        balance += amount;
        System.out.println("Deposited: "+ amount);
    }

    public int withdraw(int amount){
        if(amount > balance){
            System.out.println("Insufficient balance");
            return 0;
        }
        balance -= amount;
        System.out.println("Withdrawn: "+ amount);
        return amount;
    }

    public void printDetails(){
        System.out.println("Account Holder Name: "+ name);
        System.out.println("Account Number: "+ accountNo);
        System.out.println("Account Balance: "+ balance);
    }

}