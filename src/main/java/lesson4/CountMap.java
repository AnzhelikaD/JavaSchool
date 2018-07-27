package lesson4;

import java.util.Map;

public interface CountMap<T> {
    void add(T object);
    int getCount(T object);
    int remove(T object);
    //количество разных элементов
    int size();
    void addAll(CountMap<T> source);
    Map toMap();
    void toMap(Map<T, Integer> destination);
}
