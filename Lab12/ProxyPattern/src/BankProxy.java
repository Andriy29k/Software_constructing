class BankProxy {
    private Account account;

    public BankProxy(Account account) {
        this.account = account;
    }

    public double getBalance(String password){
        return account.getBalance(password);
    }

    public void withdraw(String password, double amount){
        account.widthdraw(password, amount);
    }

    public void deposit(String password, double amount){
        account.deposit(password, amount);
    }
}
