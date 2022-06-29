package co.clarap.al.allPatternDesign.estructural.facade.v1;

public interface JDBCDriverInterface {
    String getDBVendor();
    ConnectionInterface getConnection();
}
