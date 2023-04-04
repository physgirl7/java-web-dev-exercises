package org.launchcode.java.demos.lsn3classes1;


public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student newStudent = new Student("Julie Pitney", 1000, 1, 4.0);
        System.out.println(newStudent.getName());
        System.out.println(newStudent.getStudentId());
        System.out.println(newStudent.getNumberOfCredits());
        System.out.println(newStudent.getGpa());
    }
}
