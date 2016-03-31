package main.java.day2;

import java.util.*;

/**
 * Created by Ionut on 31.03.2016.
 */
public class PlayingWithInts {

    public static void main(String[] args) {

        List<List<Integer>> data = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(3, 5),
                Arrays.asList(7, 3, 10),
                Arrays.asList(3, 5, 6)
        );

        // if isIntersection is `false` then we do union
        boolean isIntersection =  Math.random() > 0.5;

        Set<Integer> uniqueItems = IntsProcessor.aggregateInts_01(data, isIntersection);
        System.out.println(Arrays.toString(uniqueItems.toArray()));

    }
}
