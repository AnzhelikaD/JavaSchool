package lesson4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CollectionUtils {

    public static<T> void addAll(List<? extends T> source, List<? super T> destination) {
        destination.addAll(source);
    }

    public static<T> List<T> newArrayList() {
        return new ArrayList<T>();
    }

    public static<T> int indexOf(List<? extends T> source, T o) {
        return source.indexOf(o);
    }

    public static<T> List<T> limit(List<? extends T> source, int size) {
        List<T> list = new ArrayList<T>();
        list.addAll(source.subList(0, size));
        return list;
    }

    public static<T> void add(List<? super T> source, T o) {
        source.add(o);
    }

    public static<T> void removeAll(List<T> removeFrom, List<? extends T> c2) {
        removeFrom.removeAll(c2);
    }

    public static<T> boolean containsAll(List<? extends T> c1, List<? extends T> c2) {
        return c1.containsAll(c2);
    }

    public static<T> boolean containsAny(List<? extends T> c1, List<? extends T> c2) {
        for (T o : c2) {
            if (c1.contains(o)) {
                return true;
            }
        }
        return false;
    }

    public static<T> List<T> range(List<? extends T> list, Comparable<T> min, Comparable<T> max) {
        List<T> resultList = new ArrayList<T>();
        for (T elem : list) {
            if (max.compareTo(elem) >= 0 && min.compareTo(elem) <= 0) {
                resultList.add(elem);
            }
        }
        return resultList;
    }

    public static<T> List<T> range(List<? extends T> list, T min, T max, Comparator<T> comparator) {
        List<T> resultList = new ArrayList<T>();
        for (T elem : list) {
            if (comparator.compare(elem, max) <= 0 && comparator.compare(elem, min) >= 0) {
                resultList.add(elem);
            }
        }
        return resultList;
    }

}
