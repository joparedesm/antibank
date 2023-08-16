package antibank;

public abstract class Account {
    protected double balance;
    private int agency;
    private int number;
    private Client holder = new Client();
    private  static int total;

    public Account(int agency, int number){
        Account.total++;
        // System.out.println("The total of accounts is: " + Account.total);
        this.agency = agency;
        this.number = number;
        // System.out.println("I am creating an account " + this.number);
    }

    public abstract void deposit(double value);
    //{this.balance += value;}

    public boolean withdraw(double value){
        if(this.balance >= value){
            this.balance -= value;
            return true;
        } else {
            return false;
        }
    }

    public void transfer(double value, Account destiny){
        if(this.balance >= value){
            this.withdraw(value);
            destiny.deposit(value);
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getAgency() {
        return agency;
    }

    public void setAgency(int agency) {
        if (agency <= 0){
            System.out.println("You can't set a value less than or equal to zero.");
            return;
        }
        this.agency = agency;
    }

    public int getNumber(){
        return this.number;
    }

    public void setNumber(int number){
        if (number <= 0){
            System.out.println("You can't set a value less than or equal to zero.");
            return;
        }
        this.number = number;
    }

    public Client getHolder(){
        return this.holder;
    }

    public void setHolder(Client holder){
        this.holder = holder;
    }
}
