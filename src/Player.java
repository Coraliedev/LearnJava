public class Player {
    private final String name;
    private final double health;


    public Player(String name, double health) {
        this.name = name;
        this.health = health;
    }

    public Player(String name) {
        this(name, 500);
    }

    public String getName() {
        return name;
    }

    public void sendMessage() {
        sendMessage("We have " + health + " life points");
    }

    public void sendMessage(String message) {
        System.out.println(name + " " + message);
    }

    public double getHealth() {
        return health;
    }
}
