import antibank.*;

public class TestControllerBonus {
    public static void main(String[] args) {
        Functionary daniel = new Accountant();
        daniel.setSalary(2_000);

        Manager gorge = new Manager();
        gorge.setSalary(10_000);

        Accountant alex = new Accountant();
        alex.setSalary(5_000);

        ControllerBonus ctrlBonus = new ControllerBonus();

        ctrlBonus.registerSalary(daniel);
        ctrlBonus.registerSalary(gorge);
        ctrlBonus.registerSalary(alex);
    }
}
