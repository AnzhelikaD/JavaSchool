package lesson3;

import java.util.*;

/**
 * Created by David on 20.07.2018.
 */
//public class MyArrayList<E> extends ArrayList<E> {
//
//    @Override
//    public Iterator<E> iterator() {
//        return super.iterator();
//    }
//
//    private class ReverseIterator implements Iterator<E> {
//        int cursor;
//        int lastRet = -1;
//        int expectedModCount = modCount;
//
//        public E next() {
//            checkForComodification();
//            int i = cursor;
//            if (i >= size())
//                throw new NoSuchElementException();
//            Object[] elementData = ArrayList.this.elementData;
//            if (i >= elementData.length)
//                throw new ConcurrentModificationException();
//            cursor = i + 1;
//            return (E) elementData[lastRet = i];
//        }
//
//        public boolean hasNext() {
//            return cursor != 0;
//        }
//
//        public void remove() {
//
//        }
//
//        final void checkForComodification() {
//            if (modCount != expectedModCount)
//                throw new ConcurrentModificationException();
//        }
//    }
//}
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
