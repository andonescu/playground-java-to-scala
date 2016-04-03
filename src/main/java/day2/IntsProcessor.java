package java.day2;

import java.util.*;

/**
 * Created by Ionut on 31.03.2016.
 */
public class IntsProcessor {

    /**
     * Aggregates the given input. If isIntersection is true - intersect all the values
     * if is false - use union
     */
    public static Set<Integer> aggregateInts_01(List<List<Integer>> data, boolean isIntersection) {
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

        return new HashSet<>(aggregation);
    }
}
