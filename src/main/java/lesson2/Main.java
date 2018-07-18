package lesson2;

public class Main {
    public static void main(String[] args) {
        Person man1 = new Person(true, "Jason");
        Person woman1 = new Person(false, "Dorthy");

        man1.printState();
        woman1.printState();
        System.out.println("");

        man1.merry(woman1);

        man1.printState();
        woman1.printState();
        System.out.println("");

        Person man2 = new Person(true, "Matthew");
        Person woman2 = new Person(false, "Adele");

        man2.merry(woman2);

        man2.printState();
        woman2.printState();
        System.out.println("");

        man1.merry(woman2);
        man1.printState();
        woman1.printState();
        man2.printState();
        woman2.printState();
        System.out.println("");

        man1.merry(man2);
        man1.printState();
        man2.printState();

        //еще не женаты
        System.out.println(man2.merry(woman1));
        //уже женаты
        System.out.println(man1.merry(woman2));

    }
}
