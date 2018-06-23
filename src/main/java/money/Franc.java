package money;

public class Franc {

    private int amount;

	public Franc(int amount){
        this.amount = amount;
    }

	public Franc times(int multiplier) {
        return new Franc(this.amount * multiplier);
    }
    
    public boolean equals(Object o){
        Franc dollar = (Franc)o;
        return this.amount == dollar.amount;
    }

}