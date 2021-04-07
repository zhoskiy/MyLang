package expession;

public class BinaryOperation extends Expression {
    private final Expression left;
    private final Expression right;
    private final String operation;

    public BinaryOperation(Expression left, Expression right, String operation) {
        this.left = left;
        this.right = right;
        this.operation = operation;
    }

    @Override
    public String toString() {
        return left.toString() + " " + operation + " " + right.toString();
    }
}
