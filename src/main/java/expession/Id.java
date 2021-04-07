package expession;

public class Id extends Expression {
    private final String id;

    public Id(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id;
    }
}
