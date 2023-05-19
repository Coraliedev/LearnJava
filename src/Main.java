// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        for (Day moment : Day.values()) {
            System.out.println("We are at " + moment.name().toLowerCase() + " and it's " + moment.getHour() + " o'clock" + " " + moment.getMessage());
        }

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