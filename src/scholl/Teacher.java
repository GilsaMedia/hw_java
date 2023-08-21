package scholl;

public class Teacher extends Person {
    public Person person;
    public int workinTime;
    public Boolean certificate;
    public String teachingSubjects;

    public Teacher(String name, String ID, int workinTime, Boolean certificate, String teachingSubjects) {
        this.person = new Person(name, ID);
        this.workinTime = workinTime;
        this.certificate = certificate;
        this.teachingSubjects = teachingSubjects;
    }

    public Teacher(Teacher t) {
        this.person = new Person(t.person);
        this.workinTime = t.workinTime;
        this.certificate = t.certificate;
        this.teachingSubjects = t.teachingSubjects;
    }

    @Override
    public String toString() {
        String teacher = person.toString() + " he been workin " + workinTime + " certificate" + certificate + " he is teaching " + teachingSubjects;
        return teacher;
    }
}
