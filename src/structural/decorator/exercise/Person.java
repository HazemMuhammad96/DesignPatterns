package structural.decorator.exercise;

public class Person {
    private final String firstname;
    private final String lastname;

    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public void displayName() {
        System.out.println(firstname + ", " + lastname);
    }
}
