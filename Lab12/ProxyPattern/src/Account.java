public class Account {
    private String accountNumber;
    private String password;
    private double balance;

    public Account(String accountNumber, String password, double balance) {
        this.accountNumber = accountNumber;
        this.password = password;
        this.balance = balance;
    }

    public double getBalance(String password){
        if(this.password.equals(password)){
            return balance;
        }
        throw new SecurityException("Invalid password");
    }

    public void widthdraw(String password, double amount){
        if (this.password.equals(password)) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdraw: " + amount);
            } else {
                System.out.println("Insufficient funds");
            }
        } else {
            throw new SecurityException("Invalid password");
        }
    }

    public void deposit(String password, double amount){
        if (this.password.equals(password)) {
            balance += amount;
            System.out.println("Deposit: " + amount);
        } else {
            throw new SecurityException("Invalid password");
        }
    }
}
