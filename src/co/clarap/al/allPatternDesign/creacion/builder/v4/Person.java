package co.clarap.al.allPatternDesign.creacion.builder.v4;


/**
 * Se puede agregar un método 'builder' que instancia un objeto 'builder'
 * para esta clase, y así evitar usar constructores
 */
public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static PersonBuilder builder(){
        return new PersonBuilder();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person [firstName=" + firstName + ", lastName=" + lastName + "]";
    }

    
    
}
