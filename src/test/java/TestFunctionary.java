import antibank.Accountant;
import antibank.Functionary;

public class TestFunctionary {
    public static void main(String[] args) {
        Functionary f1 = new Accountant("John", "123456789", 1000.0);
        Functionary f2 = new Accountant("Mary", "987654321", 2000.0);
        f1.setType(0);
        f2.setType(1);
        System.out.println("Name: " + f1.getName());
        System.out.println("Id: " + f1.getId());
        System.out.println("Salary: " + f1.getSalary());
        System.out.println("Bonus: " + f1.getBonus());
        System.out.println("Name: " + f2.getName());
        System.out.println("Id: " + f2.getId());
        System.out.println("Salary: " + f2.getSalary());
        System.out.println("Bonus: " + f2.getBonus());
    }
}
