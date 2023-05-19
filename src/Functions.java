public class Functions {
    public static void main(String[] args) {
        sendMessage("test", 1);

        int money = 100;
        int pricePhone = 50;
        boolean hasPhone = false;
        System.out.println("La différence est de " + getResultat(money, pricePhone, hasPhone));
    }

    private static void sendMessage(String messag, int number) {
        System.out.println("Message : " + messag + " " + number);
    }

    private static int getResultat(int money, int pricePhone, boolean hasPhone) {
        if (money >= pricePhone && !hasPhone) {
            System.out.println("Vous avez acheté un téléphone");
        } else if (money >= pricePhone && hasPhone) {
            System.out.println("Vous avez déjà un téléphone");
        } else {
            System.out.println("Vous n'avez pas assez d'argent");
        }
        return money - pricePhone;
    }

}
