package statement;

import expession.Expression;
import my.Abstraction;

import java.util.ArrayList;

public class IfStatement extends Statement {
    private final Expression expression;
    private final ArrayList<Abstraction> statements;

    public IfStatement(Expression expression, ArrayList<Abstraction> statements) {
        this.expression = expression;
        this.statements = statements;
    }

    @Override
    public String toString() {

        StringBuilder str = new StringBuilder();

//        System.out.println(statements.toString());
//        System.out.println(statements.size());
        str.append("if(" + expression.toString() + ") {\n");
        for (Abstraction statement : statements) {
            str.append(statement.toString()+"");
        }
        str.append("}\n");
        return str.toString();
    }
}
