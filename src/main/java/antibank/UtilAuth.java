package antibank;

public class UtilAuth {
    private String password;

    public boolean login(String pswd) {
        return pswd.equals(this.password);
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
