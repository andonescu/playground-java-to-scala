package main.java;

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
    public Pair<Student, Student> getStudentsByOriginCountry(Set<Student> students) {

        Predicate<Student> isRomanian = (student) -> student.getAddress().getCountry().equals("Romania");

        BiConsumer<Pair<Student, Student>, Student> consumer = (pair, st) -> {
            if (isRomanian.test(st)) pair._1.add(st);
            else pair._2.add(st);
        };

        Supplier<Pair<Student, Student>> supplier = () -> new Pair<>(new HashSet<>(), new HashSet<>());

        return students.stream().collect(
                Collector.of(
                        () -> new Pair<>(new HashSet<>(), new HashSet<>()),
                        consumer,
                        (left, right) -> {
                            left._1.addAll(right._1);
                            left._2.addAll(right._2);
                            return left;
                        })
        );
    }
}
