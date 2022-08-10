import java.util.*;

public class Main {
    private static final int MAXIMUM_AGE = 99;

    public static void main(String[] args) {
        Random random = new Random();
        Person[] someGuys = new Person[]{
                new Person("Bill", "Еще по одной!", random.nextInt(MAXIMUM_AGE) + 1),
                new Person("Steve", "Вышел в лес", random.nextInt(MAXIMUM_AGE) + 1),
                new Person("Ricchard", "Первыми делают люди", random.nextInt(MAXIMUM_AGE) + 1),
                new Person("Senna", "Сделал дело", random.nextInt(MAXIMUM_AGE) + 1),
                new Person("Alen", "Закон и порядок", random.nextInt(MAXIMUM_AGE) + 1),
                new Person("Mike", "Сто раз отмерь", random.nextInt(MAXIMUM_AGE) + 1),
                new Person("Jack", "Гений", random.nextInt(MAXIMUM_AGE) + 1)
        };

        List<Person> peoplesList = new ArrayList<>(List.of(someGuys));
        peoplesList.sort(new PeopleComparator());


        TreeSet<Person> ts = new TreeSet<>(new PeopleComparator());
        ts.addAll(List.of(someGuys));

        System.out.print("\nСписок на входе:\n");
        for (Person person: someGuys) {
            System.out.printf("Фамилия: %-25s, Возраст: %3d\n", person.getSurname(), person.getAge());
        }
        System.out.print("\nСписок List:\n");
        for (Person person: peoplesList) {
            System.out.printf("Фамилия: %-25s, Возраст: %3d\n", person.getSurname(), person.getAge());
        }
        System.out.print("\nСписок TreeSet:\n");
        for (Person person: ts) {
            System.out.printf("Фамилия: %-25s, Возраст: %3d\n", person.getSurname(), person.getAge());
        }
    }
}
