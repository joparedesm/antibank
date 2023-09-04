package antibank;

public class TaxCalculator {
    private double totalTaxes;

    public void register(Taxation taxation) {
        double tax = taxation.getTaxValue();
        this.totalTaxes += tax;
    }

    public double getTotalTaxes() {
        return this.totalTaxes;
    }
}
