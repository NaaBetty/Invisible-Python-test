public class ATMSimulator {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.addAccount(new Account("12345", "John Doe", 1000.00));
        atm.addAccount(new Account("67890", "Jane Doe", 1500.00));
        atm.start();
    }
}
