package money;

public class Pair {

    private String from;
    private String to;

    Pair(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public boolean equals(Object obj) {
        Pair other = (Pair) obj;
        return this.from.equals(other.from) && this.to.equals(other.to);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}