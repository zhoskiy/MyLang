package expession;

import my.Type;

public class DefineVar extends Expression {
    private final Type type;
    private final NameAndValue nameAndValue;
    private Expression expression;

    public DefineVar(Type type, NameAndValue nameAndValue) {
        this.type = type;
        this.nameAndValue = nameAndValue;
    }

    public DefineVar(Type type, NameAndValue nameAndValue, Expression expression) {
        this.type = type;
        this.nameAndValue = nameAndValue;
        this.expression = expression;
    }

    public Type getType() {
        return type;
    }

    public NameAndValue getNameAndValue() {
        return nameAndValue;
    }

    @Override
    public String toString() {
        if (expression == null) {
            return type + " " + nameAndValue.toString();
        } else {
            return type + " " + nameAndValue.getName() + " = " + expression.toString();
        }
    }
}
