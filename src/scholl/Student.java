package scholl;

public class Student extends Person {
    public Person person;
    private int math;
    private int english;
    private int hebrew;

    public Student(String name, String ID, int math, int english, int hebrew) {
        this.person = new Person(name, ID);
        this.math = math;
        this.english = english;
        this.hebrew = hebrew;
    }


    public Student(Student s) {
        this.person = new Person(s.person);
        this.math = s.math;
        this.english = s.english;
        this.hebrew = s.hebrew;
    }

    public String toString() {
        String student = person.toString() + " math = " + math + " english = " + english + " hebrew = " + hebrew;
        return student;
    }

    public int getHebrew() {
        return hebrew;
    }

    public void setHebrew(int hebrew) {
        this.hebrew = hebrew;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public float avrage() {
        float avrage = (this.math + this.english + this.hebrew) / 3;
        return avrage;
    }
}
