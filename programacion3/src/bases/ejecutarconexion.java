/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bases;

import java.sql.Connection;


/**
 *
 * @author DC
 */
public class ejecutarconexion {

    public static void main(String[] args) {
        System.out.println("ventana de conexion");
        Connection con = conexion2.con();
        if(con!=null)
        {
            System.out.println("Conectado Correctamente");}
        else{
            System.out.println("Error: "+ conexion2.mensajeError);}
    }

}
