import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name, password and balance to create account");

        String name = sc.next();
        String password = sc.next();
        double balance = sc.nextDouble();

        SBIUser user = new SBIUser(name, balance, password);

        // add amount
        String message = user.addMoney(100000);
        System.out.println(message);


        // widthDraw money
        System.out.println("Enter amount to widthDraw");
        int money = sc.nextInt();
        System.out.println("Enter password");
        String pass = sc.next();
        System.out.println(user.withdrawMoney(money,pass));
    }
}