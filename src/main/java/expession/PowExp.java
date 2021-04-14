package expession;

public class PowExp extends Expression {
    private final Expression left;
    private final Expression right;

    public PowExp(Expression left, Expression right) {

        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "(int) Math.pow(" + left + ", " + right + ")";
    }
}
