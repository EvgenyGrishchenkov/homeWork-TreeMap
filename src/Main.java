import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Раджиб", "Харрамос", 85));
        people.add(new Person("Чандана", "Перера Кушантха Сингх ", 33));
        people.add(new Person("Фагуни", "Кевин Сильва", 35));
        people.add(new Person("Индика", "Валлумулаге Бентхара Эскамос Фоэс", 30));

        int maxSurNameLength = 3;
        Comparator<Person> comparator = (o1, o2) -> {
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
        };

        Collections.sort(people, comparator);

        System.out.println("Наиболее знатные люди Королевства Шри-Ланка");

        for (int i = 0; i < people.size(); i++) {
            System.out.println((i + 1) + ". " + people.get(i));
        }
    }
}