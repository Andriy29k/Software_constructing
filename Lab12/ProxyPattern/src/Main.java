public class Main {
    public static void main(String[] args) {
        Account account = new Account("12345", "qwerty1234", 5432.0);
        BankProxy atm = new BankProxy(account);

        System.out.println("Balance: "+atm.getBalance("qwerty1234"));
        atm.withdraw("qwerty1234", 432.0);
        System.out.println("Balance: "+atm.getBalance("qwerty1234"));
        atm.deposit("qwerty1234", 660.0);
        System.out.println("Balance: "+atm.getBalance("qwerty1234"));

    }
}