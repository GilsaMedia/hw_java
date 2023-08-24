package scholl;

public class StudentClass {
    private char grade;
    private int number;
    private Teacher educator;
    private int numOfStudent = 0;
    private Student[] students = new Student[30];

    public StudentClass(char grade, int number, Teacher educator, int numOfStudent, Student[] students) {
        this.grade = grade;
        this.number = number;
        this.educator = educator;
        this.numOfStudent = numOfStudent;
        this.students = students;
    }

    public Student numInClass(Student[] students) {
        Student student = students[number];
        return student;
    }
}
