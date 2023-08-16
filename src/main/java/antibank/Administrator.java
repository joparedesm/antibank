package antibank;
public class Administrator extends Functionary implements IAuth {

    private String password = "admin123";
    public void setPassword(String password) {
        this.password = password;
    }

    public boolean login (String pswd){
        if ( this.password.isEmpty() )
            return "antipass" == pswd;
        else return password == pswd;
    }

    public double getBonus() {
        return 0;
    }
}
