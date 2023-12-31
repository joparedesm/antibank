package antibank;

public class CheckingAccount extends Account implements Taxation{
    public CheckingAccount(int agency, int number){
        super(agency, number);
    }

    @Override
    public void deposit(double value) {
        this.balance += value;
    }

    @Override
    public boolean withdraw(double value){
        double withdrawTax = value + 0.2;
        return super.withdraw(withdrawTax);
    }

    @Override
    public double getTaxValue() {
        return super.getBalance() * 0.01;
    }
}
