package antibank;

public class Manager extends Functionary implements IAuth {

    private String password = "";
    public  Manager(){
        super();
        this.setType(1);
    }
    public Manager(String name, String id, double salary) {
        super(name, id, salary);
        this.setType(1);
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean login (String pswd){
        if ( this.password.isEmpty() )
            return "antipass" == pswd;
        else return password == pswd;
    }

    public double getBonus(){
        System.out.println("\nExec from Manager");
        if (this.getType() == 0){
            return super.getSalary() * 0.1;
        } else if (this.getType() == 1){
            return super.getSalary() * 1.2;
        } else {
            return super.getSalary() * 1.3;
        }
    }
}
