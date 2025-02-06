package hu.vtg;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Reader {
    public ArrayList<> readFile (){
        try {
            File file = new File("termes.txt");
            Scanner sc = new Scanner(file);

        } catch (Exception e) {
            System.err.println("Szar vagy");
            System.err.println(e.getMessage());
        }
        
    }
}
