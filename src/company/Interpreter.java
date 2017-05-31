package company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Stack;

/**
 * Created by Aapo Torkkeli on 31.5.2017.
 */
class Interpreter {

    private Stack instructions;
    private Stack data;

    Interpreter(Stack instructions){
        this.instructions = instructions;
    }

    //TODO
    void start(){

        System.out.println(Arrays.toString(instructions.toArray()));

        /*
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
            ei käsitellä välilyöntejä tai rivinvaihtoa
            if(koodi[c] == '\n' || koodi[c] == ' '){
                System.out.println("ENTER");
            }
            //kokonaisluvut
            if (c == 1) {

            }
            //merkkijonoliteraali
            if (c == '"') {
                for (int i = c; i >= 0; i--) {

                }
            }
        }*/
    }
}