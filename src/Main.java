// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        try {
            System.out.println(numbers[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(5 / 0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

        double balance = 1000;
        double price = 1200;

        try {
            buy(balance, price);
        } catch (NoMoneyException e) {
            e.printStackTrace();
        }
    }

    private static void buy(double balance, double price) throws NoMoneyException {
        if (balance < price) {
            throw new NoMoneyException();
        }
    }
}