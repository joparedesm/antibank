import antibank.CheckingAccount;
import antibank.SavingsAccount;

public class TestAccount {
    public static void main(String[] args) {
        CheckingAccount CA = new CheckingAccount(1, 2);
        SavingsAccount SA = new SavingsAccount(3, 4);
        CA.deposit(2_000);
        CA.transfer(1, SA);
        System.out.println("Checking: "+CA.getBalance());
        System.out.println("Savings: "+SA.getBalance());
    }
}
