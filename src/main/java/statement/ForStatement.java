package statement;

import expession.Expression;
import my.Abstraction;

import java.util.ArrayList;

public class ForStatement extends Statement {
    private final ArrayList<Expression> expressions;
    private final ArrayList<Abstraction> statements;

    public ForStatement(ArrayList<Expression> expressions, ArrayList<Abstraction> statements) {
        this.expressions = expressions;
        this.statements = statements;
    }

    @Override
    public String toString() {

        StringBuilder str = new StringBuilder("for(");
        for (Expression exp : expressions) {
            str.append(exp.toString() + ";");
        }
        str.deleteCharAt(str.length() - 1);
        str.append(") {\n");

        for (Abstraction stat : statements) {
            str.append(stat.toString() + "\n");
        }
        str.append("}\n");

        return str.toString();
    }
}
