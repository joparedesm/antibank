package antibank;
public class Administrator extends Functionary implements IAuth {

    private final UtilAuth utilAuth;

    public Administrator(){
        this.utilAuth = new UtilAuth();
        this.utilAuth.setPassword("admin123");
    }
    public void setPassword(String password) {
        this.utilAuth.setPassword(password);
    }

    public boolean login (String pswd){
        return this.utilAuth.login(pswd);
    }

    public double getBonus() {
        return this.getSalary() * 0.1;
    }
}
