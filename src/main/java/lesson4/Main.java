package lesson4;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CountMap<Integer> map = new CountMapImpl<Integer>();
        map.add(10);
        map.add(10);
        map.add(5);
        map.add(6);
        map.add(5);
        map.add(10);
        System.out.println("size " + map.size());
        System.out.println(map.getCount(5));
        System.out.println(map.getCount(6));
        System.out.println(map.getCount(10));
        System.out.println();

        map.remove(10);
        map.remove(6);
        map.remove(2);
        System.out.println("size " + map.size());
        System.out.println(map.getCount(5));
        System.out.println(map.getCount(6));
        System.out.println(map.getCount(10));
        System.out.println();

        CountMap<Integer> countMap = new CountMapImpl<Integer>();
        countMap.add(10);
        System.out.println(countMap.size());
        countMap.addAll(map);
        System.out.println(countMap.size());
        System.out.println();

        List<Integer> list = CollectionUtils.range(Arrays.asList(8,1,3,5,6, 4), 3, 6);
        System.out.println(list);
        list = CollectionUtils.limit(list, 3);
        System.out.println(list);
        System.out.println(CollectionUtils.containsAll(list, Arrays.asList(3, 5)));
        System.out.println(CollectionUtils.containsAny(list, Arrays.asList(1, 2, 6)));

    }
}
