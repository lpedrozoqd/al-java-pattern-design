package co.clarap.al.allPatternDesign.estructural.facade.v1.mySql;

import co.clarap.al.allPatternDesign.estructural.facade.v1.ConnectionInterface;
import co.clarap.al.allPatternDesign.estructural.facade.v1.DriverManager;
import co.clarap.al.allPatternDesign.estructural.facade.v1.JDBCDriverInterface;

public class MySQLJDBCDriver implements JDBCDriverInterface {
    /*
     * Registra el driver en el DriverManager de la facade
     */
    static{
        DriverManager.registerDriver(new MySQLJDBCDriver());
    }

    @Override
    public String getDBVendor() {
        return "mySql";
    }

    @Override
    public ConnectionInterface getConnection() {
        return new MySQLConnection();
    }
    
}
