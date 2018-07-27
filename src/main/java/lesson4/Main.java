package lesson4;

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
    }
}
