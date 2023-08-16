package antibank;

public interface IAuth {


    void setPassword(String password);

    public abstract boolean login (String pswd);
    /*{
        if ( this.password.isEmpty() )
            return "antipass" == pswd;
        else return password == pswd;
    }*/

    String getName();
}
