package lesson3;

import java.util.Comparator;

/**
 * Created by David on 20.07.2018.
 */
public class WordComparator implements Comparator<String> {

    public int compare(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        return len1 == len2 ?
                str1.toLowerCase().compareTo(str2.toLowerCase())
                : len1 - len2;
    }
}
