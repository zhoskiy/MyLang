package expession;

public class NameAndValue extends Expression {
    private final String name;
    private String value;

    public NameAndValue(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public NameAndValue(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        if (value == null)
            return name;
        else
            return name + " = " + value;
    }
}
