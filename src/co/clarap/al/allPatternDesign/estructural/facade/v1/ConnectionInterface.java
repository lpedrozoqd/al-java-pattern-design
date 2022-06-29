package co.clarap.al.allPatternDesign.estructural.facade.v1;

/*
 * Facade: proporciona acceso a la funcionalidad
 */
public interface ConnectionInterface {
   StatementInterface createStatement(); 
}
