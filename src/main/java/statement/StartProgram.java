package statement;

import block.MainFunction;
import my.Abstraction;

import java.util.ArrayList;

public class StartProgram extends Abstraction {
    private ArrayList<Abstraction> functions;
    private final MainFunction main;

    public StartProgram(ArrayList<Abstraction> functions, MainFunction main) {
        this.functions = functions;
        this.main = main;
    }

    public StartProgram(MainFunction main) {
        this.main = main;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("public class MyLanguage {\n");
        if (functions != null){
            for (Abstraction fun: functions){
                str.append(fun.toString());
            }
        }
        str.append(main.toString());
        str.append("}");
        return str.toString();
    }
}
