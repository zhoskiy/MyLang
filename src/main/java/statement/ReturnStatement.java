package statement;

import expession.Expression;

public class ReturnStatement extends Statement {
    private final Expression expression;

    public ReturnStatement(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "return " + expression.toString() + ";\n";
    }
}
