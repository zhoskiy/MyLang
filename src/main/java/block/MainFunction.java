package block;

import my.Abstraction;

import java.util.ArrayList;

public class MainFunction extends Abstraction {
    private final ArrayList<Abstraction> blocks;

    public MainFunction(ArrayList<Abstraction> blocks) {
        this.blocks = blocks;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("public static void main(String[] args) {\n");
        for (Abstraction block: blocks){
            str.append(block.toString());
        }
        str.append("}\n");
        return str.toString();
    }
}
