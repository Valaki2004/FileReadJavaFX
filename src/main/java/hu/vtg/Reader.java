package hu.vtg;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Reader {
    public ArrayList<Termes> readFile (){
        try {
            ArrayList<Termes> termeslist = new ArrayList<>();
            File file = new File("termes.txt");
            Scanner sc = new Scanner(file);
            sc.nextLine();
            while(sc.hasNext()){
                String line = sc.nextLine();
                String [] lineArray = line.split(":");
                Termes termes = new Termes();
                termes.setId(Integer.parseInt(lineArray[0]));
                termes.setNev(lineArray[1]);
                termes.setDulo(lineArray[2]);
                termes.setMennyiseg(Integer.parseInt(lineArray[3]));
                termes.setBetakaritasVege(LocalDate.parse(lineArray[4]));
                termeslist.add(termes);
            }
            sc.close();
            return termeslist; 
            
        } catch (FileNotFoundException e) {
            System.err.println("Szar vagy");
            System.err.println(e.getMessage());
        }
                return null;
               
                
    
    }
}
