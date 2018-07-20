package lesson3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Created by David on 20.07.2018.
 */
public class Main {
    public static void main(String[] args) {
        FileReader fileReader;
        Scanner scanner;
        StringBuilder stringBuilder = new StringBuilder();
        try {
           fileReader = new FileReader("TextFile.txt");
           scanner = new Scanner(fileReader);
           while (scanner.hasNext()) {
               stringBuilder.append(scanner.nextLine())
                       .append("\n");
           }
           fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String text = stringBuilder.toString();
        //System.out.println(stringBuilder.toString());
        System.out.println("Различных слов в файле: " + TextUtils.numberWords(text));
        System.out.println();

        System.out.println("В порядке возрастания длины: ");
        TextUtils.printWordsAscOrder(text);
        System.out.println();

        System.out.println("Количество повторений: ");
        TextUtils.printCountEveryWord(text);
        System.out.println();

        System.out.println("Строки в обратном порядке: ");
        TextUtils.printReverse(text);
        System.out.println();

        System.out.println("Итератор");
        List<String> strings = Arrays.asList(text.split("\n"));
        MyList<String> list = new MyList<String>(new ArrayList<String>(strings));
        for (String word : list) {
            System.out.println(word);
        }

        //TextUtils.printLineNumber(text);
    }
}
