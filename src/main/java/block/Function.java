package block;

import my.Abstraction;

import java.util.ArrayList;

public class Function extends Abstraction {
    private final String type;
    private final String name;
    private FunctionParam parameters;
    private final ArrayList<Abstraction> blocks;

    public Function(String type, String name, FunctionParam parameters, ArrayList<Abstraction> blocks) {
        this.type = type.toLowerCase();
        this.name = name.toLowerCase();
        this.parameters = parameters;
        this.blocks = blocks;
    }

    public Function(String type, String name, ArrayList<Abstraction> blocks) {
        this.type = type.toLowerCase();
        this.name = name.toLowerCase();
        this.blocks = blocks;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("public static " + type + " " + name+"(");
        if (parameters != null){
            str.append(parameters.toString());
        }
        str.append(") {\n");
        for (Abstraction block: blocks) {
            str.append(block.toString());
        }
        str.append("}\n");
        return str.toString();
    }
}
