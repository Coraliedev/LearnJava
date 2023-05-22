public class Bank {
    private final String name;

    public Bank(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public <T, S> void transferMoney(Account<T> sourceAccount, Account<S> targetAccount, int amount) {
        if (sourceAccount.getAmount() < amount) {
            System.out.println("Not enough money in " + sourceAccount.getOwner() + " account.");
            return;
        }

        sourceAccount.removeMoney(amount);
        targetAccount.addMoney(amount);

        System.out.println("Successfully transferred " + amount + " " + sourceAccount.getCurrency() + " from " + sourceAccount.getOwner() + " to " + targetAccount.getOwner());
    }
}
