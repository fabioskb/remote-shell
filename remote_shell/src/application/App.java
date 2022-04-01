/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package application;

import application.RemoteShell;

/**
 *
 * @author fabio
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RemoteShell rcmd = new RemoteShell();
        rcmd.setVisible(true);
    }
    
}
