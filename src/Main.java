import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {


        Zoo zoo = new Zoo();

        // Создаем животных
        Dog dog1 = new Dog("Бобик", 3);
        Dog dog2 = new Dog("Шарик", 5);
        Cat cat1 = new Cat("Мурка", 2);
        Bird bird1 = new Bird("Кеша", 1);

        // Добавляем животных в зоопарк
        zoo.addAnimal(dog1);
        zoo.addAnimal(dog2);
        zoo.addAnimal(cat1);
        zoo.addAnimal(bird1);

        // Заставляем всех животных издавать звуки
        System.out.println("Звуки животных:");
        zoo.makeAllSounds();

        // Подсчитываем количество животных каждого типа
        Map<String, Integer> countMap = zoo.countAnimalsByType();
        System.out.println("\nКоличество животных по типам:");
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Удаляем одно животное и проверяем снова
        zoo.removeAnimal(dog1);
        System.out.println("\nПосле удаления одного собаки:");
        countMap = zoo.countAnimalsByType();
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}