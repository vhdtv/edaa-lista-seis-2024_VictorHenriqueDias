import java.util.ArrayList;
import java.util.Collections;

public class AnimalList implements AnimalListInterface {
    ArrayList<Animal> animals;

    public AnimalList() {
        this.animals = new ArrayList<>();
    }

    @Override
    public void addAnimal(String name) {
        animals.add(new Animal(name));
    }

    @Override
    public void organizeAnimalList() {
        Collections.sort(animals, (animal1, animal2) -> animal1.getName().compareTo(animal2.getName()));

    }

    @Override
    public void showAnimalList() {
        for (Animal animal : animals) {
            System.out.println(animal.getName());
        }
    }

}
