package block;

public class FunctionCall extends Block {
    private final String functionName;
    private FunctionParam parameters;

    public FunctionCall(String functionName, FunctionParam parameters) {
        this.functionName = functionName.toLowerCase();
        this.parameters = parameters;
    }

    public FunctionCall(String functionName) {
        this.functionName = functionName.toLowerCase();
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("MyLanguage." + functionName + "(");
        if (parameters != null) {
            str.append(parameters.toString());
        }
        str.append(");\n");

        return str.toString();
    }
}
