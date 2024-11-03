import java.util.LinkedList;
import java.util.Queue;

public class AnimalShelter {
    private Queue<Dog> dogs;
    private Queue<Cat> cats;
    private int orderCount; // To maintain the order of arrival

    public AnimalShelter() {
        dogs = new LinkedList<>();
        cats = new LinkedList<>();
        orderCount = 0;
    }

    public int getNextOrder() {
        return ++orderCount; // Return the next order and increment it
    }

    public void addAnimal(Animal animal) {
        if (animal instanceof Dog) {
            dogs.add((Dog) animal);
        } else if (animal instanceof Cat) {
            cats.add((Cat) animal);
        }
    }

    public Animal adoptAny() {
        if (dogs.isEmpty() && cats.isEmpty()) {
            return null;
        } else if (dogs.isEmpty()) {
            return cats.poll();
        } else if (cats.isEmpty()) {
            return dogs.poll();
        } else {
            Dog dog = dogs.peek();
            Cat cat = cats.peek();
            return (dog.getOrder() < cat.getOrder()) ? dogs.poll() : cats.poll();
        }
    }

    public Dog adoptDog() {
        return dogs.poll();
    }

    public Cat adoptCat() {
        return cats.poll();
    }

    public void listCatsWithAdditionDate() {
        if (cats.isEmpty()) {
            System.out.println("No cats in the shelter.");
            return;
        }
        for (Cat cat : cats) {
            System.out.println("Cat Name: " + cat.getName() + ", Add Order: " + cat.getOrder());
        }
    }

    public void listDogsWithAdditionDate() {
        if (dogs.isEmpty()) {
            System.out.println("No dogs in the shelter.");
            return;
        }
        for (Dog dog : dogs) {
            System.out.println("Dog Name: " + dog.getName() + ", Add Order: " + dog.getOrder());
        }
    }
}
