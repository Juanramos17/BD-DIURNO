/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.iesruizgijon.diurno.programacionbasededatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juanramoscaro
 */
public class BaseDatos {
    private Connection conexion;
    private  String USER ;
    private  String PASS ;
    private  String nameBD ;
    private  String URL = "jdbc:mysql://localhost:3306/";

    public BaseDatos(String USER, String PASS, String nameBD) {
        this.conexion = conexion;
        this.USER = USER;
        this.PASS = PASS;
        this.nameBD = nameBD;
    }

    public void conecta(){
        try
        {
            Connection conexion = DriverManager.getConnection(URL + nameBD, USER, PASS);
            System.out.println("Conexión establecida");
        } catch (SQLException ex)
        {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
   
    public void desconecta(){
        try
        {
            if(conexion!=null){
                conexion.close();
            }
        } catch (SQLException ex)
        {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
