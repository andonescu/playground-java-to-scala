package main.java;

import java.util.Set;

/**
 * Created by Ionut on 10.03.2016.
 */
public class Pair<T, V> {
    public final Set<T> _1;
    public final Set<T> _2;

    public Pair(Set<T> _1, Set<T> _2) {
        this._1 = _1;
        this._2 = _2;
    }
}
