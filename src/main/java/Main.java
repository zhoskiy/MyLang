import antlr4.GrammaticaLexer;
import antlr4.GrammaticaParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Main obj = new Main();
        CharStream input = null;
        try {
          input = CharStreams.fromString(obj.readFileAsString("src/main/resources/test1"));
        } catch (IOException e) {
            e.printStackTrace();
        }


        GrammaticaLexer lexer = new GrammaticaLexer(input);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        GrammaticaParser parser = new GrammaticaParser(tokenStream);

        ParseTree tree = parser.program();
        Visitor visitor = new Visitor();

        FileWriter fileWriter = new FileWriter("Lang.java");
        fileWriter.append(visitor.visit(tree).toString());


        System.out.println(visitor.visit(tree));
    }

    private String readFileAsString(String filePath) throws IOException {
        StringBuffer fileData = new StringBuffer();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        char[] buf = new char[1024];
        int numRead = 0;
        while ((numRead = reader.read(buf)) != -1) {
            String readData = String.valueOf(buf, 0, numRead);
            fileData.append(readData);
        }
        reader.close();
        return fileData.toString();
    }
}