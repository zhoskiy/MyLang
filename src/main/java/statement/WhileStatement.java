package statement;

import expession.Compare;
import my.Abstraction;

import java.util.ArrayList;

public class WhileStatement extends Statement {
    private final Compare compare;
    private final ArrayList<Abstraction> statements;

    public WhileStatement(Compare compare, ArrayList<Abstraction> statements) {
        this.compare = compare;
        this.statements = statements;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("while(");
        str.append(compare.toString() + ") {\n");
        for (Abstraction stat : statements) {
            str.append(stat.toString() + "\n");
        }
        str.append("}\n");

        return str.toString();
    }
}
