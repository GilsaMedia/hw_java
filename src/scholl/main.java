package scholl;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Person person1 = new Person("yakov", "32453234");
        Person person2 = new Person();
        Student student1 = new Student("gil", "218478824", 85, 94, 87);
        Student student2 = new Student("zoe", "456734867", 100, 100, 100);
        Student student3 = new Student("meow", "24143234", 32, 90, 100);
        Student student4 = new Student("almog", "218131985", 68, 98, 55);
        Teacher teacher1 = new Teacher("neomi", "45366832", 20, true, "tanah, hebrew, tarbut");
        Student[] students1 = {student1, student2, student3, student4};
        StudentClass studentClass1 = new StudentClass('9', 7, teacher1, 4, students1);

//        student1.setMath(100);
        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(teacher1.toString());
        System.out.println(student1.avrage());
    }
}
