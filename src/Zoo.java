import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Zoo {
    private ArrayList<Animal> animals;

    public Zoo() {
        this.animals = new ArrayList<>();
    }

    // Добавить животное в зоопарк
    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    // Удалить животное из зоопарка
    public void removeAnimal(Animal animal) {
        animals.remove(animal);
    }

    // Вызвать makeSound() для каждого животного
    public void makeAllSounds() {
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }

    // Подсчитать количество животных каждого типа
    public Map<String, Integer> countAnimalsByType() {
        Map<String, Integer> countMap = new HashMap<>();
        for (Animal animal : animals) {
            String type = animal.getClass().getSimpleName();
            countMap.put(type, countMap.getOrDefault(type, 0) + 1);
        }
        return countMap;
    }
}
