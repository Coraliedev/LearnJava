
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Account<Character> myAccount = new Account<>("John", 1000, '€');
        myAccount.showBalance();

        Account<String> otherAccount = new Account<>("Jane", 200, "euros");
        otherAccount.showBalance();

        Bank bank = new Bank("JohnBank");
        bank.transferMoney(otherAccount, myAccount, 100);
        myAccount.showBalance();
        otherAccount.showBalance();
    }

}
