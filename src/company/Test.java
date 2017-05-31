package company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Stack;

/**
 * Created by Aapo Torkkeli on 31.5.2017.
 */
public class Test {

    public static void main(String[] args) {

        String file = "C:\\Users\\Aapo\\IdeaProjects\\okp_pinotulkki_harkkatyö\\src\\com\\company\\testiohjelma.txt";

        Parser parser = new Parser(file);
        Interpreter interpreter = new Interpreter(parser.parse());
        interpreter.start();
    }
}