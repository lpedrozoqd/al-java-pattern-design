package co.clarap.al.allPatternDesign.estructural.facade.v1.mySql;

import co.clarap.al.allPatternDesign.estructural.facade.v1.StatementInterface;

public class MySQLStatement implements StatementInterface{

    @Override
    public void executeQuery(String query) {
        System.out.println("MySQL JDBC Driver executing query: " + query);
    }
}
