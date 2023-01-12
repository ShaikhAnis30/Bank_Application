import java.util.Objects;
import java.util.UUID;

public class SBIUser implements BankInterface{
    private String name;
    private String accountNo;
    private double balance;
    private String password;
    private static double rateOfInterest;

    // shortcut for constructor - alt+insert
    public SBIUser(String name, double balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;

        this.rateOfInterest = 6.5;
        this.accountNo = String.valueOf(UUID.randomUUID()); // its generates unique 128bit number
        // 36 characters
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static double getRateOfInterest() {
        return rateOfInterest;
    }

    public static void setRateOfInterest(double rateOfInterest) {
        SBIUser.rateOfInterest = rateOfInterest;
    }

    @Override
    public double checkBalance() {
        return this.balance;
    }

    @Override
    public String addMoney(int amount) {
        balance = balance + amount;
        return "Your Balance is: " + balance;
    }

    @Override
    public String withdrawMoney(int amount, String inputPassword) {
        if(Objects.equals(inputPassword,password)) { // Object is ultimate Parent for all classes in Java
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
        return (balance * years * rateOfInterest)/100;
    }
}
