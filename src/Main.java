import java.util.*;

public class Main {
    private static final int MAXIMUM_AGE = 99;
    private static final int LIMIT_WORDS_IN_SURNAME = 0;

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
        peoplesList.sort((o1, o2) -> {
            int o1NumOfWords, o2NumOfWords;
            String[] sn1 = o1.getSurname().split(" ", LIMIT_WORDS_IN_SURNAME);
            String[] sn2 = o2.getSurname().split(" ", LIMIT_WORDS_IN_SURNAME);
            o1NumOfWords = sn1.length;
            o2NumOfWords = sn2.length;
            if (o1NumOfWords == o2NumOfWords) {
                return o2.getAge() - o1.getAge();
            } else {
                return o2NumOfWords - o1NumOfWords;
            }
        });

        System.out.print("\nСписок на входе:\n");
        for (Person person : someGuys) {
            System.out.printf("Фамилия: %-25s, Возраст: %3d\n", person.getSurname(), person.getAge());
        }
        System.out.print("\nСписок List:\n");
        for (Person person : peoplesList) {
            System.out.printf("Фамилия: %-25s, Возраст: %3d\n", person.getSurname(), person.getAge());
        }
    }
}
