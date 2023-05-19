public class Apple extends Fruit {

    public Apple() {
        super("Apple");
    }

    @Override
    public void taste() {
        System.out.println("Apple tastes sweet");
    }

    @Override
    public int getSize() {
        return 1;
    }

    @Override
    public boolean hasSeed() {
        return true;
    }
}
