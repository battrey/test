/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author s326lab
 */
public class NewClass {
    
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        InetAddress ia;
        System.out.print("Enter host[: ");
        String input = kbd.nextLine();
        for (int x = 1; x <= 1024; x++) {
            try {
                Socket sock = new Socket(input, x);
                System.out.println(":" + x + " ---Connection open!");
            } catch (IOException ex) {
            }
        }
    }
    
}
