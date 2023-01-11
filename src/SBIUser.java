import java.util.Objects;
import java.util.UUID;

public class SBIUser implements BankInterface{
    private String name;
    private String accountNo;
    private double balance;
    private String password;
    private double rateOfInterest;

    // shortcut for constructor - alt+insert
    public SBIUser(String name, double balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;

        this.rateOfInterest = 6.5;
        this.accountNo = String.valueOf(UUID.randomUUID()); // its generates unique 128bit number
    }

    public String getName() {
        return name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public String getPassword() {
        return password;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public String addMoney(int amount) {
        balance = balance + amount;
        return "Your Balance is: " + balance;
    }

    @Override
    public String withdrawMoney(int amount, String inputPassword) {
        if(Objects.equals(inputPassword,password)) { // Object is Parent for all classes in Java
            if(amount > balance) {
                return "Insufficient balance";
            }else{
                balance -= amount;
                return balance + "\nyou are rich(Andha Paisa)";
            }
        }else {
            return "Wrong Password!";
        }
    }

    @Override
    public double calculateInterest(int years) {
        return 0;
    }
}
