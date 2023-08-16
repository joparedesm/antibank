import antibank.Functionary;
import antibank.Manager;

public class TestReferences {
    public static void main(String[] args) {
        // El elemento mas generico puede ser
        // adaptado al elemento mas especifico
        Functionary functionary = new Manager();
        functionary.setName("Dante");

        // Todos los manager son funcionaries pero
        // no todos los funcionaries son manager
        // Manager manager = new Functionary(); // error
        Manager manager = new Manager();
        manager.setName("Gorge");

        functionary.setSalary(2200);
        manager.setSalary(11000);

        // functionary.login("antipass");
        // // la referencia no tiene el metodo login
        manager.login("antipass");
    }
}
