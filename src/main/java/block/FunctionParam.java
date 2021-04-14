package block;

import my.Abstraction;

import java.util.ArrayList;

public class FunctionParam extends Abstraction {
    private final ArrayList<Abstraction> parameters;

    public FunctionParam(ArrayList<Abstraction> parameters) {
        this.parameters = parameters;
    }

    public ArrayList<Abstraction> getParameters() {
        return parameters;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (Abstraction param: parameters){
            str.append(param.toString()+", ");
        }
        str.delete(str.length()-2, str.length());
        return str.toString();
    }
}
