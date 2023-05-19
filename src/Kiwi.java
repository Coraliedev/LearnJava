public class Kiwi extends Fruit implements PeelFruit {
    public Kiwi() {
        super("Kiwi");
    }

    @Override
    public void taste() {
        System.out.println("Kiwi tastes sour");
    }

    @Override
    public int getSize() {
        return 1;
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
        return "Furry";
    }
}
