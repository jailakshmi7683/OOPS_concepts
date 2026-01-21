package p2;
import p1.bank;


public class Account extends bank {
    // Additional functionalities can be added here
    public Account(double accountNo, String name, int initialBalance) {
        this.accountNo = accountNo;
        this.name = name;
        setBalance(initialBalance);                
    }
}