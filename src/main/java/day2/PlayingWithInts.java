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


        List<Integer> aggregation = new ArrayList<>();

        for (int index = 0; index < data.size(); index++) {
            List<Integer> newCol = data.get(index);

            if (!isIntersection) {
                // simple case , we just add the new element to the set
                aggregation.addAll(newCol);
            } else {
                if (index == 0) {
                    aggregation.addAll(newCol);
                } else {
                    for (Iterator<Integer> iter = aggregation.listIterator(); iter.hasNext(); ) {
                        Integer elem = iter.next();
                        if (!newCol.contains(elem)) {
                            // remove the element
                            iter.remove();
                        }

                    }
                }

            }
        }

        Set<Integer> uniqueItems = new HashSet<>(aggregation);
        System.out.println(Arrays.toString(uniqueItems.toArray()));


    }
}
