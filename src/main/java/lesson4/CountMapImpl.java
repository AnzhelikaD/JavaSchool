package lesson4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountMapImpl<T> implements CountMap<T> {
    private Map<T, Integer> map = new HashMap<T, Integer>();

    public void add(T object) {
        Integer value = map.get(object);
        map.put(object, value == null ? 1 : value + 1);
    }

    public int getCount(T object) {
        Integer count = map.get(object);
        return count == null ? 0 : count;
    }

    public int remove(T object) {
        Integer value = map.get(object);
        if (value == null) {
            return 0;
        }
        if (value == 1) {
            map.remove(object);
            return 1;
        }
        map.put(object, value - 1);
        return value;
    }

    public int size() {
        return map.size();
    }

    public void addAll(CountMap<T> source) {
        Map<T, Integer> sourceMap = source.toMap();
        Set<Map.Entry<T, Integer>> set = sourceMap.entrySet();
        for (Map.Entry<T, Integer> pair : set) {
            Integer value = map.get(pair.getKey());
            map.put(pair.getKey(), value == null ? pair.getValue() : value + pair.getValue());
        }
    }

    public Map<T, Integer> toMap() {
        return map;
    }

    public void toMap(Map<T, Integer> destination) {
        destination = map;
    }
}
