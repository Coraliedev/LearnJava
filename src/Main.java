
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        substract(5, 7, new CalculListener() {
            @Override
            public void onPositiveResult() {
                System.out.println("Positive result");
            }

            @Override
            public void onNegativeResult() {
                System.out.println("Negative result");
            }
        });

    }

    private static void substract(int a, int b, CalculListener listener) {
        int result = a - b;
        System.out.println("Result: " + result);
        if (result > 0) {
            listener.onPositiveResult();
        } else {
            listener.onNegativeResult();
        }
    }
}
