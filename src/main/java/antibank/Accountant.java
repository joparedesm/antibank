package antibank;

public class Accountant extends Functionary{
    public Accountant(){}
    public Accountant(String name, String id, double salary) {
        super(name, id, salary);
    }
    @Override
    public double getBonus() {
        System.out.println("\nExec from Accountant");
        return 200;
    }
}
