package antibank;

public abstract class Functionary {
    // si una clase es abstracta, no se puede instanciar
    private String name = "Unknown";
    private String id;
    private double salary;

    private int type;

    public  Functionary(){}
    public Functionary(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // existe conceptualmente, pero no se implementa
    public abstract double getBonus();

    public int getType() {
        return this.type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
