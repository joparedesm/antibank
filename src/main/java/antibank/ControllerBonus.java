package antibank;

public class ControllerBonus {
    private double sum;

    // Esto llama al metodo mas especifico: manager.getBonus(),
    // accountant.getBonus(), etc
    public double registerSalary(Functionary functionary){
        this.sum += functionary.getBonus();
        System.out.println("Suma actual: "+this.sum);
        return this.sum;
    }

    public double getSum() {
        return this.sum;
    }
}
