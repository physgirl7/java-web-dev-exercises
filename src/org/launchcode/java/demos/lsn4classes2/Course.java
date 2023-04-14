package org.launchcode.java.demos.lsn4classes2;

import java.util.ArrayList;
import java.util.Objects;

public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    public Course(String topic, Teacher instructor, ArrayList<Student> enrolledStudents){
        this.topic = topic;
        this.instructor = instructor;
        this.enrolledStudents = enrolledStudents;
    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.

    @Override
    public String toString() {
        String courseReturn = String.format("The %s course is taught by %s %s and has the following students: \n", this.topic, this.instructor.getFirstName(),this.instructor.getLastName());
              for (Student student: this.enrolledStudents) {
                  courseReturn += student.getName() + "\n";
        }
        return courseReturn;
    }


    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return topic.equals(course.topic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topic);
    }

    public static void main(String[] args) {
        Student john = new Student("John", 123, 24,4.0);
        Student julie = new Student("Julie",124, 30, 3.8);
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(john);
        studentList.add(julie);
        Teacher msPitney = new Teacher("Julie", "Pitney", "Computer Science",10);
        Course java = new Course("Java", msPitney, studentList);
        System.out.println(java.toString());
    }
}
