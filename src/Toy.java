public class Toy implements Comparable<Toy> {
    private final String name;
    private final int price;
    private final String description;
    private final int promotion;

    public Toy(String name, int price, String description, int promotion) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.promotion = promotion;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public int getPromotion() {
        return promotion;
    }

    @Override
    public int compareTo(Toy toy2) {
        return Integer.compare(toy2.getPromotion(), this.promotion);
    }
}
