package exercise2;

import java.net.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This program checks ports 1 to 1024 that have connection.
 * 
 * @author Rey Meljohn S. Guieb
 */
public class Exercise2{
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        InetAddress ia;
        System.out.print("Enter host: ");
        String input = kbd.nextLine();
        
        for(int x = 1; x <=1024; x++){
            try {
                Socket sock = new Socket(input, x);
                System.out.println(":" +x +" ---Connection open!");
            } catch (IOException ex) {   
            }
        }
    }   
}
