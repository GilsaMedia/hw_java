package scholl;

public class Person {
    public String name;
    public String ID;

    public Person(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }

    public Person() {
        this.name = "jon doh";
        this.ID = "00000000";
    }

    public Person(Person p) {
        this.name = p.name;
        this.ID = p.ID;
    }

    @Override
    public String toString() {
        String person = "the person name is " + name + " and the ID is " + ID;
        return person;
    }
}


