package main.java.day1;

import java.util.HashSet;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collector;

/**
 * Created by Ionut on 10.03.2016.
 */
public class StudentProcessor {

    /**
     * Separate students in two distinct buckets <romania & other>
     */
    public Pair<Student, Student> getStudentsByOriginCountry_01(Set<Student> students) {

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


    /**
     * Separate students in two distinct buckets <romania & other>
     */
    public Pair<Set<Student>, Set<Student>> getStudentsByOriginCountry_02(Set<Student> students) {

        Predicate<Student> isRomanian = (student) -> student.getAddress().getCountry().equals("Romania");

        BiConsumer<Pair<Set<Student>, Set<Student>>, Student> consumer = (pair, st) -> {
            if (isRomanian.test(st)) pair._1.add(st);
            else pair._2.add(st);
        };

        Supplier<Pair<Set<Student>, Set<Student>>> supplier = () -> new Pair<>(new HashSet<>(), new HashSet<>());

        return students.stream().collect(
                Collector.of(
                        supplier,
                        consumer,
                        (left, right) -> {
                            left._1.addAll(right._1);
                            left._2.addAll(right._2);
                            return left;
                        })
        );
    }
}
