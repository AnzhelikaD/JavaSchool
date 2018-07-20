package lesson3;

import java.util.*;

public class MyList<T> implements Iterable<T> {

    private ArrayList<T> arrayList;
    private int currentSize;

    public MyList(){
        arrayList = new ArrayList<T>();
    }

    public MyList(ArrayList<T> newArray) {
        this.arrayList = newArray;
        this.currentSize = arrayList.size();
    }

    public boolean add(T t) {
        return arrayList.add(t);
    }

    public T get(int index) {
        return arrayList.get(index);
    }

    public int size() {
        return arrayList.size();
    }

    public void set(int index ,T t) {
        arrayList.set(index, t);
    }

    public Iterator<T> iterator() {
        Iterator<T> it = new Iterator<T>() {

            private int currentIndex = size() - 1;

            public boolean hasNext() {
                return currentIndex >= 0 && arrayList.get(currentIndex) != null;
            }

            public T next() {
                return arrayList.get(currentIndex--);
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
        return it;
    }
}
