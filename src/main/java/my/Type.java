package my;

import expession.Expression;

public class Type extends Expression {
    private final String type;

    public Type(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }
}
