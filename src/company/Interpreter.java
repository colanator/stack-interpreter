package company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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

    void start(){

        String instr = "";

        double temp1;
        double temp2;
        double temp3;

        boolean sana = false;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){

            try {
                instr = instructions.pop().toString();
            } catch (EmptyStackException e){
                //e.getStackTrace();
            }

            //System.out.println(instr);

            //Summa
            if(instr.equals("+")){
                try {
                    temp1 = parseDouble(data.pop().toString());
                    temp2 = parseDouble(data.pop().toString());
                    temp3 = temp1+temp2;
                    data.push(temp3);
                }catch (EmptyStackException r){
                    System.out.println("TARKISTA KOODI!");
                }
                sana = true;
            }
            //Erotus
            else if(instr.equals("-")){
                try {
                    temp1 = parseDouble(data.pop().toString());
                    temp2 = parseDouble(data.pop().toString());
                    temp3 = temp2-temp1;
                    data.push(temp3);
                }catch (EmptyStackException r){
                    System.out.println("TARKISTA KOODI!");
                }
                sana = true;
            }
            //Kertolasku
            else if(instr.equals("*")){
                try {
                    temp1 = parseDouble(data.pop().toString());
                    temp2 = parseDouble(data.pop().toString());
                    temp3 = temp1*temp2;
                    data.push(temp3);
                }catch (EmptyStackException r){
                    System.out.println("TARKISTA KOODI!");
                }
                sana = true;
            }
            //Jakolasku
            else if(instr.equals("/")){
                try {
                    temp1 = parseDouble(data.pop().toString());
                    temp2 = parseDouble(data.pop().toString());
                    temp3 = temp2/temp1;
                    data.push(temp3);
                }catch (EmptyStackException r){
                    System.out.println("TARKISTA KOODI!");
                }
                sana = true;
            }
            //Printtaa stackin ylin literaali
            else if(instr.equals("print")){
                try {
                    System.out.println(data.pop());
                }catch (EmptyStackException r){
                    System.out.println("TARKISTA KOODI!");
                }
                sana = true;
            }
            //Lue käyttäjän syöte ja laita se data-stackiin
            else if(instr.equals("read")){
                try {
                    System.out.println("Input:");
                    data.push(br.readLine());
                }catch (IOException e){
                    System.out.println("TARKISTA INPUTTISI!");
                }
                sana = true;
            }


            //Literaali
            if(!sana){
                data.push(instr);
            }

            sana = false;

            //PINO ON TYHJÄ
            if(instructions.empty()){
                break;
            }
        }
    }
}