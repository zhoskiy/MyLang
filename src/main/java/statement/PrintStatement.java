package statement;

import expession.Expression;

public class PrintStatement extends Statement{
    private final Expression expression;

    public PrintStatement(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "System.out.println("+expression+");";
    }
}
