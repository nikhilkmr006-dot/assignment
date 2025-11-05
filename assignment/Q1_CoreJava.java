// File: Q1_CoreJava.java
class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo);
    }
}

class BCAStudent extends Student {
    int semester;

    BCAStudent(String name, int rollNo, int semester) {
        super(name, rollNo);
        this.semester = semester;
    }

    @Override
    void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo + ", Semester: " + semester);
    }
}

public class Q1_CoreJava {
    public static void main(String[] args) {
        try {
            BCAStudent[] Nikhil_students = new BCAStudent[3];
            Nikhil_students[0] = new BCAStudent("Nikhil", 101, 3);
            Nikhil_students[1] = new BCAStudent("Aryan", 102, 4);
            Nikhil_students[2] = new BCAStudent("Riya", 103, 2);

            for (int i = 0; i < Nikhil_students.length; i++) {
                Nikhil_students[i].display();
            }

            // Example of exception
            System.out.println(Nikhil_students[5].name); // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception Caught: " + e);
        }
    }
}
