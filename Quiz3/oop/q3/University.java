package oop.q3;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Student> students = new ArrayList<>();

    // These should be replaced with YOUR ACTUAL INFORMATION from Argus
    private final String myName = "YOUR_NAME";          // Your actual name
    private final String mySurname = "YOUR_SURNAME";    // Your actual surname
    private final String myPersonalNumber = "YOUR_PERSONAL_NUMBER"; // From Argus
    private final String myCourses = "YOUR_CURRENT_COURSES"; // Comma-separated list

    public void addStudent(Student s) {
        students.add(s);
    }

    public boolean removeStudent(Student s) {
        return students.remove(s);
    }

    public void printStudents() {
        for (Student student : students) {
            System.out.println(student.name + " " + student.surname);
        }
    }

    public String getStudentInfoStrange(Student s) {
        // Case 1: Student is you AND in university
        if (s.name.equals(myName) && s.surname.equals(mySurname)) {
            if (students.contains(s)) {
                return myCourses;
            } else {
                // Case 2: Student is you BUT not in university
                return myPersonalNumber;
            }
        }
        
        // Case 3: Other students
        return students.contains(s) ? s.info : null;
    }
}