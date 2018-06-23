package money;

public class Money {

    protected int amount;
    protected String currency;

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public boolean equals(Object o) {
        Money money = (Money) o;
        return this.amount == money.amount && currency().equals(money.currency());
    }

    Money times(int multiplier) {
        return new Money(this.amount * multiplier, this.currency);
    }

    String currency() {
        return this.currency;
    }

    public String toString() {
        return this.amount + " " + this.currency;
    }

    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

}