import antibank.CheckingAccount;
import antibank.LifeInsurance;
import antibank.TaxCalculator;

public class TestTaxation {
    public static void main(String[] args) {

        CheckingAccount ca = new CheckingAccount(123, 456);
        ca.deposit(3000.0);

        LifeInsurance insurance = new LifeInsurance();

        TaxCalculator calc = new TaxCalculator();

        calc.register(ca);
        calc.register(insurance);

        System.out.println(calc.getTotalTaxes());
    }
}
