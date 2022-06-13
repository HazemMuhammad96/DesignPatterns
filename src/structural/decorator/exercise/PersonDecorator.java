package structural.decorator.exercise;

public class PersonDecorator{

    public Person person;
    public int id;
    public PersonDecorator(Person person) {
        this.person = person;
    }

    public void displayName(){
        person.displayName();
    }
}
