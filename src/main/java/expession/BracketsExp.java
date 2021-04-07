package expession;

public class BracketsExp extends Expression{
    private final Expression expression;

    public BracketsExp(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "("+ expression.toString() +")";
    }
}
