package antibank;

public class VideoEditor extends Functionary{
    @Override
    public double getBonus() {
        System.out.println("\nExec from VideoEditor");
        return 150;
    }
}
