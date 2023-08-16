import antibank.Manager;

public class TestManager {
    public static void main(String[] args) {
        Manager m1 = new Manager("John", "123456789", 1000.0);
        m1.setType(2);
        System.out.println("Name: " + m1.getName());
        System.out.println("Id: " + m1.getId());
        System.out.println("Salary: " + m1.getSalary());
        System.out.println("Salary + Bonus: " + m1.getBonus());
        System.out.println("Authenticated: " + m1.login("antipass"));
    }
}
