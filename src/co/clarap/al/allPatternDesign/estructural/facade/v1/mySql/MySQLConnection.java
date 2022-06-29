package co.clarap.al.allPatternDesign.estructural.facade.v1.mySql;

import co.clarap.al.allPatternDesign.estructural.facade.v1.ConnectionInterface;
import co.clarap.al.allPatternDesign.estructural.facade.v1.StatementInterface;

public class MySQLConnection implements ConnectionInterface {

    @Override
    public StatementInterface createStatement() {
        return new MySQLStatement();
    }
}
