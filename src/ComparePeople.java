import java.util.Comparator;

public class ComparePeople implements Comparator<Person> {
    private int maxSurNameLength;

    public ComparePeople(int maxSurNameLength) {
        this.maxSurNameLength = maxSurNameLength;
    }

    @Override
    public int compare(Person o1, Person o2) {

        int lengthSurname1 = (o1.getSurname()).split(" ").length;
        int lengthSurname2 = (o2.getSurname()).split(" ").length;

        if (lengthSurname1 >= maxSurNameLength && lengthSurname2 >= maxSurNameLength) {
            return Integer.compare(o2.getAge(), o1.getAge());
        } else if (lengthSurname1 > lengthSurname2) {
            return -1;
        } else if (lengthSurname1 < lengthSurname2) {
            return 1;
        } else {
            return Integer.compare(o2.getAge(), o1.getAge());
        }
    }
}

