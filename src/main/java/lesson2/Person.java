package lesson2;

public class Person {
    private final boolean man;
    private final String name;
    private Person spouse;

    public Person(boolean man, String name) {
        this.man = man;
        this.name = name;
    }

    /**
     * This method checks gender of persons. If genders are not equal - tries to marry.
     * If one of them has another spouse - execute divorce(sets spouse = null for husband and wife.
     * Example: if both persons have spouses - then divorce will set 4 spouse to null) and then executes marry().
     *
     * @param person - new husband/wife for this person.
     * @return - returns true if this person has another gender than passed person and they are not husband and wife,
     * false otherwise
     */

    public boolean merry(Person person) {
        if (person == null || person.man == man || person.equals(spouse)) {
            return false;
        }
        if (spouse != null) {
            spouse.divorce();
            divorce();
        }
        if (person.spouse != null) {
            person.spouse.divorce();
            person.divorce();
        }
        this.spouse = person;
        person.spouse = this;
        return true;
    }

    /**
     * Sets spouse = null if spouse is not null
     *
     * @return true - if person status has been changed
     */

    public boolean divorce() {
        if (spouse == null) {
            return false;
        }
        spouse = null;
        return true;
    }

    public void printState() {
        if (man) {
            System.out.println(spouse != null ? "женат на " + spouse.name : "не женат");
        } else {
            System.out.println(spouse != null ? "замужем за " + spouse.name : "не замужем");
        }
    }
}

