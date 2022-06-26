package co.clarap.al.allPatternDesign.creacion.builder.v4;

/*
 * Hace el código más legible y evita usar constructores que pueden
 * afectar a muchas clases cuando se les agrega un nuevo parámetro
 */
public class PersonBuilder {
    private String firstName;
    private String lastName;

    public PersonBuilder firstName(String firstName){
        this.firstName = firstName;
        return this;
    }

    public PersonBuilder lastName(String lastName){
        this.lastName = lastName;
        return this;
    }

    public Person build(){
        return new Person(firstName,lastName);
    }
}
