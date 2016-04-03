package java.day1;

/**
 * Created by Ionut on 10.03.2016.
 */
public class Pair<T, V> {
    public final T _1;
    public final V _2;

    public Pair(T _1, V _2) {
        this._1 = _1;
        this._2 = _2;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "_1=" + _1 +
                ", _2=" + _2 +
                '}';
    }
}
