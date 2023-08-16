import antibank.Administrator;
import antibank.InnerSystem;
import antibank.Manager;

public class TestInnerSystem {
    public static void main(String[] args) {
        InnerSystem system = new InnerSystem();
        Manager manager1 = new Manager("Joseph", "123456789", 1000);
        Administrator admin1 = new Administrator();

        system.auth(manager1);
        system.auth(admin1);

    }
}
