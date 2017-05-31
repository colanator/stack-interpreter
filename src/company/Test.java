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

        Stack instr = new Stack();
        Stack data = new Stack();

        FileReader source = null;
        File ohjelma = new File("C:\\Users\\Aapo\\IdeaProjects\\okp_pinotulkki_harkkatyö\\src\\com\\company\\testiohjelma.txt");
        try {
            source = new FileReader(ohjelma);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        char[] koodi = new char[100];
        try {
            source.read(koodi);
        } catch (Exception e) {
            e.printStackTrace();
        }

        HashSet<String> käskyt = new HashSet<>();
        käskyt.add("+");
        käskyt.add("-");
        käskyt.add("*");
        käskyt.add("/");
        käskyt.add("||");
        käskyt.add("!!");
        käskyt.add("&&");

        Stack temp = new Stack();

        for (int c = koodi.length - 1; c >= 0; c--) {
            System.out.print(koodi[c]);
            /*ei käsitellä välilyöntejä tai rivinvaihtoa
            if(koodi[c] == '\n' || koodi[c] == ' '){
                System.out.println("ENTER");
            }*/
            //kokonaisluvut
            if (c == 1) {

            }
            //merkkijonoliteraali
            if (c == '"') {
                for (int i = c; i >= 0; i--) {

                }
            }
        }
    }
}