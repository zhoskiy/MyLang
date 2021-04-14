import VisitorAndWalker.Visitor;
import VisitorAndWalker.Walker;
import antlr4.GrammaticaLexer;
import antlr4.GrammaticaParser;
import my.Abstraction;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

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
        parser.removeErrorListeners(); // remove ConsoleErrorListener
        parser.addErrorListener(new Walker()); // add ours

        ParseTree tree = parser.program(); //parse
        Visitor visitor = new Visitor();

        Abstraction result = visitor.visit(tree);
        if (Walker.isErrors())
            return;

        String className = "src/main/java/MyLanguage";
        obj.writeInFile(visitor.visit(tree).toString(), Paths.get(className+".java"));

        String command1 = "javac " + className+".java";
        String output = obj.executeCommand(command1);

//        String command2 = "java " + className+".class";

//        System.out.println(obj.executeCommand(command2));
//        System.out.println(output);

    }

    private void writeInFile(String code, Path path) {

        if (Files.exists(path)) {

            System.out.println("File already exists");
        } else {

            try {
                Files.createFile(path);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            Files.writeString(path, code);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String executeCommand(String command) {
        StringBuilder output = new StringBuilder();
        Process p;

        try {
            p = Runtime.getRuntime().exec(command);
            p.waitFor();
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line = "";
            while ((line = reader.readLine()) != null) {
                output.append(line).append("\n");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return output.toString();

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