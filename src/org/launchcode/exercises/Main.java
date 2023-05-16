package org.launchcode.exercises;

import java.util.HashMap;
import java.util.Map;

public class Main extends Exception {

    public static void main(String[] args) {

        // Test out your Divide() function!

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
    }

    public static void Divide(int x, int y)
    {
        // Write code here!
        if(y<0){
            try{
                throw new ArithmeticException("You cannot divide by 0.");
            } catch(ArithmeticException a) {
                a.printStackTrace();
            }
        } else {
            int dividend = x / y;
            }
        }

    public static int CheckFileExtension(String fileName)
    {
        // Write code here!
        if(fileName.contains(".java")){
            return 1;
        } else if (!fileName.contains(".java")){
            return 0;
        }

        if (fileName.isEmpty() || fileName.isBlank()){
            try{
                    throw new IllegalArgumentException("You must submit a valid file name.");
            } catch(IllegalArgumentException i){
                    i.printStackTrace();
                }
            }
        return -1;
        }
}
