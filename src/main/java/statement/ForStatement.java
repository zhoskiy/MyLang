package statement;

import expession.Expression;
import my.Abstraction;

import java.util.List;

public class ForStatement extends Statement {
    private final List<Expression> expressions;
    private final List<Abstraction> statements;

    public ForStatement(List<Expression> expressions, List<Abstraction> statements) {
        this.expressions = expressions;
        this.statements = statements;
    }

    @Override
    public String toString() {

        StringBuilder str = new StringBuilder("for(");
        for (Expression exp : expressions) {
            str.append(exp.toString() + "; ");
        }
        str.deleteCharAt(str.length() - 2);
        str.append(") {\n");

        for (Abstraction stat : statements) {
            str.append(stat.toString() + "\n");
        }
        str.append("}\n");

        return str.toString();
    }
}
