package co.clarap.al.allPatternDesign.creacion.builder.v4;

public class BuilderTester {
    public static void main(String[] args) {
        Person person = Person.builder()
                        .firstName("Leonel")
                        .lastName("Pedrozo")
                        .build();
        System.out.println("Persona: " + person.getFirstName() + " " + person.getLastName());                        
                        
    }
}
