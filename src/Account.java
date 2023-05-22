public class Account<T> {
    private final String owner;
    private double amount;
    private final T currency;

    public Account(String owner, double amount, T currency) {
        this.owner = owner;
        this.amount = amount;
        this.currency = currency;
    }

    public String getOwner() {
        return owner;
    }

    public double getAmount() {
        return amount;
    }

    public T getCurrency() {
        return currency;
    }

    public void addMoney(int amount) {
        this.amount += amount;
    }

    public void removeMoney(int amount) {
        this.amount -= amount;
    }

    public void showBalance() {
        System.out.println("You currently have: " + amount + " " + currency);
    }
}
