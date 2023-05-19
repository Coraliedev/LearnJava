public class PineApple extends Fruit implements PeelFruit {

    public PineApple() {
        super("Pineapple");
    }

    @Override
    public void taste() {
        System.out.println("Pineapple tastes sour");
    }

    @Override
    public int getSize() {
        return 2;
    }

    @Override
    public boolean hasSeed() {
        return false;
    }

    @Override
    public boolean isPeeled() {
        return true;
    }

    @Override
    public String getSkinType() {
        return "Piquant";
    }
}
