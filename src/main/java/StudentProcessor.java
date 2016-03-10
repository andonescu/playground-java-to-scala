package main.java;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Ionut on 10.03.2016.
 */
public class StudentProcessor {

    /**
     * Separate students in two distinct buckets <romania & other>
     */
    public Pair<Student, Student> getStudentsByOriginCountry(Set<Student> students) {

        Set<Student> romaniaStudents = new HashSet<Student>();
        Set<Student> otherStudents = new HashSet<Student>();

        for (Student student : students) {
            if (student.getAddress().getCountry().equals("Romania")) {
                romaniaStudents.add(student);
            } else {
                otherStudents.add(student);
            }
        }

        return new Pair(romaniaStudents, otherStudents);
    }
}
