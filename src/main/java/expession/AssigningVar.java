package expession;

public class AssigningVar extends Expression {
    private final NameAndValue nameAndValue;
    private final Expression expression;

    public AssigningVar(NameAndValue nameAndValue, Expression expression) {
        this.nameAndValue = nameAndValue;
        this.expression = expression;
    }

    @Override
    public String toString() {
        return nameAndValue.toString() + " = " + expression.toString();
    }
}
