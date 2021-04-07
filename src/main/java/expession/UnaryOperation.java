package expession;

public class UnaryOperation extends Expression {
    private final Id id;
    private final String operation;

    public UnaryOperation(Id id, String operation) {
        this.id = id;
        this.operation = operation;
    }

    @Override
    public String toString() {
        return id.toString() + operation;
    }
}
