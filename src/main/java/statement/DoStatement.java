package statement;

import expession.Compare;
import my.Abstraction;

import java.util.ArrayList;

public class DoStatement extends Statement {
    private final Compare compare;
    private final ArrayList<Abstraction> statements;

    public DoStatement(Compare compare, ArrayList<Abstraction> statements) {
        this.compare = compare;
        this.statements = statements;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("do {\n");
        for (Abstraction stat : statements) {
            str.append(stat.toString() + "\n");
        }
        str.append("} while(" + compare.toString() + ");\n");

        return str.toString();
    }
}
