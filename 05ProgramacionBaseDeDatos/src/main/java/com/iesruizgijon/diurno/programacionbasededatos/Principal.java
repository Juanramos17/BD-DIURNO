/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.iesruizgijon.diurno.programacionbasededatos;

/**
 *
 * @author juanramoscaro
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        final String User="root";
        final String PASS="123qweASD_";
        final String nameBD="northwind";
        final String URL="jdbc:mysql://localhost:3306/";
        
        BaseDatos BD = new BaseDatos(User, PASS, nameBD);
        
        BD.conecta();
        BD.desconecta();
        
    }
    
}
