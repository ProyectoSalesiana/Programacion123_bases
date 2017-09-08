/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bases;


import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.Connection;

/**
 *
 * @author DC
 */
public class conexion2 {

    public static String mensajeError = null;

    public static Connection con() {
        Connection con = null;
        try {
            SQLServerDataSource ds = new SQLServerDataSource();
            ds.setUser("sa");
            ds.setPassword("sa.1");
            ds.setServerName("localhost");
            ds.setPortNumber(1433);
            ds.setDatabaseName("ejemplo");
            con = ds.getConnection();
        } catch (Exception e) {
            mensajeError = e.getMessage();
        }
        return con;
    }
}
