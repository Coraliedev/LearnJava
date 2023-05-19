// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.miam();
        apple.taste();
        PineApple pineApple = new PineApple();
        pineApple.miam();
        if (!(apple instanceof PeelFruit)) {
            System.out.println("Apple is not a PeelFruit");
        }

    }
}