import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name, password and balance to create account");

        // create User
        String name = sc.next();
        String password = sc.next();
        double balance = sc.nextDouble();

        SBIUser user = new SBIUser(name, balance, password);
        System.out.println("Welcome, your account no is: " + user.getAccountNo());

        System.out.println("press 1 to add money\n" + "press 2 to withdraw money\n" + "press 3 to calculate ROI");
        System.out.println("press 0 to exit");
        int input = sc.nextInt();

        switch(input) {

            case 1 :
                int yOrN;
                do{
                    System.out.println("Enter amount to add");
                    int amount = sc.nextInt();
                    String message = user.addMoney(amount);
                    System.out.println(message);

                    System.out.println("press 1 to continue or press 0 ");
                    yOrN = sc.nextInt();
                }while (yOrN == input);
                System.out.println("Thank you!, have a great day");
                break;

            case 2 :
                do{
                    System.out.println("Enter amount to widthDraw");
                    int money = sc.nextInt();
                    System.out.println("Enter password");
                    String pass = sc.next();
                    System.out.println(user.withdrawMoney(money,pass));

                    System.out.println("press 2 to continue or press 0 ");
                    yOrN = sc.nextInt();
                }while (yOrN == input);
                System.out.println("Thank you!, have a great day");
                break;

            case 3 :
                do{
                    System.out.println("Enter years on which you have to calculate interest");
                    int yrs = sc.nextInt();
                    double roi = user.calculateInterest(yrs);
                    System.out.println("Rate of Interest on your balance is: " + roi);

                    System.out.println("press 3 to continue or press 0 ");
                    yOrN = sc.nextInt();
                }while (yOrN == input);
                System.out.println("Thank you!, have a great day");
                break;

            case 0 :
                System.out.println("Thank you!, have a great day");
                break;

            default:
                System.out.println("Wrong Input");
                break;
        }


        // add amount
//        System.out.println("Enter amount to add");
//        int amount = sc.nextInt();
//        String message = user.addMoney(amount);
//        System.out.println(message);


        // widthDraw money
//        System.out.println("Enter amount to widthDraw");
//        int money = sc.nextInt();
//        System.out.println("Enter password");
//        String pass = sc.next();
//        System.out.println(user.withdrawMoney(money,pass));

        // calculate rateOfInterest
//        System.out.println("Enter years on which you have to calculate interest");
//        int yrs = sc.nextInt();
//        double roi = user.calculateInterest(yrs);
//        System.out.println("Rate of Interest on your balance is: " + roi);
    }
}