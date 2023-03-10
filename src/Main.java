import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person ("Раджиб", "Харрамос", 85));
        people.add(new Person("Чандана", "Перера Кушантха Сингх", 33));
        people.add(new Person("Фагуни", "Кевин Сильва", 29));
        people.add(new Person("Индика", "Валлумулаге Бентхара Эскамос", 30));

        System.out.println(people);

        Collections.sort(people, new ComparePeople());
        System.out.println("Наиболее знатные люди Королевства Шри-Ланка");
        for (int i=0; i< people.size(); i++) {
            System.out.println((i+1) + ". " + people.get(i));
        }
    }
}