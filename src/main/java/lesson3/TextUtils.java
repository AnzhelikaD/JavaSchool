package lesson3;

import java.util.*;

/**
 * Created by David on 20.07.2018.
 */
public class TextUtils {

    //Задание1. Подсчитайте количество различных слов в файле.
    public static int numberWords(String text) {
        if (text == null) {
            return 0;
        }
        int number = 0;
        Set<String> set = new HashSet<String>();
        ArrayList<String> words = getWords(text);
        for (String word : words) {
            if (set.add(word)) {
                number++;
                //System.out.println(number + word);
            }
        }
        return number;
    }

    public static ArrayList<String> getWords(String text) {
        if (text == null) {
            return new ArrayList<String>();
        }
        text = text.replace('\uFEFF', ' ');
        text = text.trim();
        String[] strings = text.split("\n");
        ArrayList<String> stringArrayList = new ArrayList<String>();
        for (String str: strings) {
            String[] words = str.split("\\s");
            for (String word : words) {
                if (!word.equals("")) {
                    stringArrayList.add(word);
                }
            }
        }
        return stringArrayList;
    }

    public static ArrayList<String> getLines(String text) {
        String[] strings = text.split("\n");
        return new ArrayList<String>(Arrays.asList(strings));
    }

    //Задание 2: Выведите на экран список различных слов файла, отсортированный по возрастанию их длины
    // (компаратор сначала по длине слова, потом по тексту).

    public static void printWordsAscOrder(String text) {
        if (text == null) {
            return;
        }
        ArrayList<String> words = getWords(text);
        WordComparator comparator = new WordComparator();
        Set<String> treeSet = new TreeSet<String>(comparator);
        for (String word : words) {
            treeSet.add(word);
        }
        for (String word : treeSet) {
            System.out.println(word);
        }
    }

    //Задание 3: Подсчитайте и выведите на экран сколько раз каждое слово встречается в файле.
    public static void printCountEveryWord(String text) {
        if (text == null) {
            return;
        }
        ArrayList<String> words = getWords(text);
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String word : words) {
            Integer value = map.get(word);
            map.put(word, value == null ? 1 : value + 1);
        }

        Set<Map.Entry<String, Integer>> set = map.entrySet();
        for (Map.Entry<String, Integer> pair : set) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    //Задание 4: Выведите на экран все строки файла в обратном порядке.
    public static void printReverse(String text) {
        if (text == null) {
            return;
        }
        ArrayList<String> strings = getLines(text);
        Collections.reverse(strings);
        for (String string : strings) {
            System.out.println(string);
        }
    }

    //Задание 6: Выведите на экран строки, номера которых задаются пользователем в произвольном порядке.
    public static void printLineNumber(String text) {
        if (text == null) {
            return;
        }
        ArrayList<String> strings = getLines(text);
        int length = strings.size();
        Scanner scanner = new Scanner(System.in);
        int k = 0;
        try {
            while (k != -1) {
                System.out.println("Введите номер строки. Введите -1, чтобы выйти");
                String str = scanner.nextLine();
                k = Integer.parseInt(str);
                if (k >= 0 && k < length) {
                    System.out.println(strings.get(k));
                }
            }

        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

    }

}
