public class Strawberry extends Fruit {

    public Strawberry() {
        super("Strawberry");
    }

    @Override
    public void taste() {
        System.out.println("Strawberry tastes sweet");
    }

    @Override
    public int getSize() {
        return 1;
    }

    @Override
    public boolean hasSeed() {
        return false;
    }
}
