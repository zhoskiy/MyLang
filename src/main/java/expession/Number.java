package expession;

public class Number extends Expression {
    private final String number;

    public Number(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return number;
    }
}
