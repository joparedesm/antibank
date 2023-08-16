package antibank;

public class InnerSystem {
    private String password = "antipass";
    public  boolean auth(IAuth manager){
        if (manager.login(password)){
            System.out.println("Welcome, " + manager.getName());
            return true;
        }
        System.out.println("Wrong password");
        return false;
    }


}
