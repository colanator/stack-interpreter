package company;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Double.parseDouble;

/**
 * Created by Aapo Torkkeli on 31.5.2017.
 */
class Interpreter {

    private Stack instructions;
    private Stack data = new Stack();

    Interpreter(Stack instructions){
        this.instructions = instructions;
    }

    //TODO
    void start(){

        String instr = "";

        double temp1;
        double temp2;
        double temp3;

        while(true){

            try {
                instr = instructions.pop().toString();
            } catch (EmptyStackException e){
                //e.getStackTrace();
            }

            //Summa
            if(instr.matches("\\Q +\\E")){
                temp1 = parseDouble((String) data.pop());
                temp2 = parseDouble((String) data.pop());;
                temp3 = temp1+temp2;
                data.push(temp3);
            }
            //Erotus
            else if(instr.matches("\\Q -\\E")){

            }
            //Kertolasku
            else if(instr.matches("\\Q *\\E")){

            }
            //Jakolasku
            else if(instr.matches("\\Q /\\E")){

            }
            //Literaali
            else if(!instr.matches(";")){
                data.push(instr);
            }

            System.out.println("Data: "+data.peek().toString());

            //PINO ON TYHJÄ
            if(instructions.empty()){
                break;
            }
        }


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