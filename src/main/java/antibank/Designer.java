package antibank;

public class Designer extends Functionary{
    @Override
    public double getBonus() {
        System.out.println("\nExec from Designer");
        return 200;
    }
}
