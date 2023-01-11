public interface BankInterface {
    double checkBalance();
    String addMoney(int amount);

    String withdrawMoney(int amount, String inputPassword);

    double calculateInterest(int years);

}
