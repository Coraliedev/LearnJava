public abstract class Fruit {

    private String name;

    public Fruit(String name) {
        this.name = name;
    }

    public abstract void taste();

    public abstract int getSize();

    public abstract boolean hasSeed();

    public void miam() {
        System.out.println("Miam" + " " + getName() + "!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
