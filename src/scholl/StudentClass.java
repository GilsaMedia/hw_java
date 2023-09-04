package scholl;

import java.util.Scanner;

public class StudentClass {
    Scanner scan = new Scanner(System.in);
    private char grade;
    private int number;
    private Student student;
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

    public Student getStudentFromTheClass(Student[] students, int number) {
        this.student = students[number];
        return this.student;
    }
}
