package co.clarap.al.allPatternDesign.estructural.facade.v1;

/**
 * El cliente no necesita saber nada sobre la implementación del subsistema,
 * excepto la inicialización de la clase controladora para la base de datos requerida.
 * El cliente simplemente interactúa con las interfaces de la fachada en lugar de clases
 * específicas de la base de datos.
 * DriverManager actúa como una fachada para el subsistema subyacente.
 * Entre los ejemplos más conocidos tenemos JDBC y SLF4J.
 */

public class FacadeTester {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("co.clarap.al.allPatternDesign.estructural.facade.v1.mySql.MySQLJDBCDriver");
        ConnectionInterface connection = DriverManager.getConnection("mySql");
        StatementInterface statement = connection.createStatement();
        statement.executeQuery("Select * from employee");
    }
}
