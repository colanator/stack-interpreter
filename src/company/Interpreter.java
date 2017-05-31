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
    }
}