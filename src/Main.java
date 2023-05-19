// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Coralie", 20, 0.5);
        Player player2 = new Player("John", 15, 2);
        player2.setName("John Doe");
        player1.setHealth(18);
        player1.setAttack(0.7);
        player2.damage(5);
        System.out.println("Player 1 name: " + player1.getName() + ", health: " + player1.getHealth() + ", attack: " + player1.getAttack());
        System.out.println("Player 2 name: " + player2.getName() + ", health: " + player2.getHealth() + ", attack: " + player2.getAttack());
    }
}