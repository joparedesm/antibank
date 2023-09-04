package antibank;

public class Client implements IAuth {

    private String name;
    private String document;
    private String phone_number;
    private final UtilAuth utilAuth;

    public Client(){
        this.utilAuth = new UtilAuth();
        this.utilAuth.setPassword("antipass123");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    @Override
    public void setPassword(String password) {
        this.utilAuth.setPassword(password);
    }

    @Override
    public boolean login(String pswd) {
        return this.utilAuth.login(pswd);
    }
}
