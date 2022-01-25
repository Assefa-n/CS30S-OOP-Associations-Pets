import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;

/** ***************************************************
 *  Name:           Sveinson
 *  Class:          CS30S
 * 
 *  Assignment:     OOP Association example 2
 * 
 *  Description:    an examle of class associations betwen
 *                  a Pet class and a PetOwner class
 * 
 *************************************************************/

public class PetOwnerDriver {

    public static void main(String[] args) throws IOException{
    // ***** constants *******
    
    // ***** variables *****
    
        String banner = "";             // output banner
        String prompt = "";             // prompt for user input
        
        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output
        
        String delim = "[ ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records
        
        // a new line character that works on every computer system
        String nl = System.lineSeparator();
    
    // ***** objects *****
        ProgramInfo pi = new ProgramInfo("OOP Association example 2");
    
        Pet p1 = new Pet("Mittens", "Iguana");
        Pet p2 = new Pet("Frank", "Cat");
        
        PetOwner o1 = new PetOwner("Peter Parker");
        PetOwner o2 = new PetOwner("Franz Klammer");
        
    // ***** print banners *****

        System.out.println(pi.getBanner());
    
    // ***** Get Input *****
    // ***** Main Processing *****
    
        //System.out.println(p1.getName());
        //System.out.println(p2);
        
        //System.out.println(o1);
        
        // set up associations
        associations(p1, o1);
        associations(p2, o2);
        
        PetOwner o3 = new PetOwner("Don o");
        associations(new Pet("Pihchy", "Lobster"), o3);
        
        System.out.println(o3.getPet());
        
        System.out.println(p1.getOwner().getName());
    
        System.out.println("---- Pets ----");
        System.out.println(p2.toString());
        System.out.println(p1);
        
        System.out.println();
        System.out.println("---- Owners ----");
        System.out.println(o1);
        System.out.println(o2);
        
    // ***** Print Formatted Output *****
    
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println(pi.getClosingMessage());
        //fout.println("End of Processing");
        
    // **** close io buffers *****
    
        //fin.close();
        //fout.close();
    } // end main 
    
    public static void associations(Pet p, PetOwner o){
        p.setOwner(o);
        o.setPet(p);
    }// end associations
    
} // end FormatTemplate
