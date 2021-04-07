package statement;

import expession.Expression;

public class ExpressionStatement extends Statement {
    private final Expression expression;
    private final boolean newline;

    public ExpressionStatement(Expression expression, boolean newline) {
        this.expression = expression;
        this.newline = newline;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder(expression.toString()+";");
        if (newline) {
            str.append("\n");
        }

        return str.toString();
    }
}
