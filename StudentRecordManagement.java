
import java.util.*;

class Student {
    int rollNumber;
    String name;
    int age;
    String grade;
    Student next;

    Student(int rollNumber, String name, int age, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

class StudentRecordList {
    private Student head;

    void addAtBeginning(int rollNumber, String name, int age, String grade) {
        Student newStudent = new Student(rollNumber, name, age, grade);
        newStudent.next = head;
        head = newStudent;
    }

    void addAtEnd(int rollNumber, String name, int age, String grade) {
        Student newStudent = new Student(rollNumber, name, age, grade);
        if (head == null) {
            head = newStudent;
            return;
        }
        Student temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newStudent;
    }

    void addAtPosition(int rollNumber, String name, int age, String grade, int position) {
        Student newStudent = new Student(rollNumber, name, age, grade);
        if (position == 1) {
            newStudent.next = head;
            head = newStudent;
            return;
        }
        Student temp = head;
        for (int i = 1; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            return;
        }
        newStudent.next = temp.next;
        temp.next = newStudent;
    }

    void deleteByRollNumber(int rollNumber) {
        if (head == null) {
            return;
        }
        if (head.rollNumber == rollNumber) {
            head = head.next;
            return;
        }
        Student temp = head;
        while (temp.next != null && temp.next.rollNumber != rollNumber) {
            temp = temp.next;
        }
        if (temp.next == null) {
            return;
        }
        temp.next = temp.next.next;
    }

    Student searchByRollNumber(int rollNumber) {
        Student temp = head;
        while (temp != null) {
            if (temp.rollNumber == rollNumber) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    void updateGrade(int rollNumber, String newGrade) {
        Student student = searchByRollNumber(rollNumber);
        if (student != null) {
            student.grade = newGrade;
        }
    }

    void displayRecords() {
        Student temp = head;
        while (temp != null) {
            System.out.println("Roll Number: " + temp.rollNumber + ", Name: " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
            temp = temp.next;
        }
    }
}

public class StudentRecordManagement {
    public static void main(String[] args) {
        StudentRecordList list = new StudentRecordList();
        list.addAtEnd(1, "John", 20, "A");
        list.addAtEnd(2, "Alice", 21, "B");
        list.addAtBeginning(3, "Bob", 22, "C");
        // list.displayRecords();
        list.updateGrade(2, "A+");
        // list.displayRecords();
        // list.deleteByRollNumber(3);
        list.displayRecords();
    }
}
