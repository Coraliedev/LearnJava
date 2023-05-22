import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Toy> toys = new ArrayList<>();
        toys.add(new Toy("Teddy Bear", 10, "A cute teddy bear", 5));
        toys.add(new Toy("Lego", 20, "A Lego set", 10));
        toys.add(new Toy("Barbie", 20, "A Barbie doll", 5));
        toys.add(new Toy("Bicycle", 100, "A bicycle", 20));
        toys.add(new Toy("Puzzle", 20, "A puzzle", 20));

        toys.sort(new PriceComparator());

        for (Toy toy : toys) {
            System.out.println(toy.getName() + " " + toy.getPrice() + " " + toy.getDescription() + " " + toy.getPromotion());
        }
    }

}
