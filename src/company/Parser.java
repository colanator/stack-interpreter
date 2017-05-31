package company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Stack;

/**
 * Created by Aapo Torkkeli on 31.5.2017.
 */
class Parser {

    private String file;

    //TODO
    Parser(String file){
        this.file = file;
    }

    //TODO
    Stack parse(){

        //pino käskyjä varten
        Stack instructions = new Stack();

        //luetaan lähdekooditiedosto
        FileReader source = null;
        File ohjelma = new File(this.file);
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


        StringBuilder temp = new StringBuilder("");

        //tunnistetaan käskyt ja laitetaan ne pinoon
        for (int i = 0; i <= koodi.length-1; i++) {
            if(koodi[i] == ' ' || koodi[i] == '\n' || i == koodi.length-1){
                //System.out.print("PUSH: " + temp.toString());
                instructions.push(temp.toString());
                temp = new StringBuilder("");
            }
            temp.append(koodi[i]);
        }

        //käännetään pino ympäri, jotta tulkki lukee ohjelman oikeassa järjestyksessä.
        reverseStack(instructions);

        return instructions;
    }

    private static void reverseStack(Stack s)
    {
        Object curr = s.pop();

        if (s.size() != 1)
            reverseStack (s);

        placeCurrAtBottomOfStack (s, curr);
    }

    private static void placeCurrAtBottomOfStack(Stack s, Object curr)
    {
        Object top = s.pop();
        if (s.size() == 0)
            s.push(curr);
        else
            placeCurrAtBottomOfStack(s, curr);
        s.push(top);
    }
}