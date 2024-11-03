public class Dog extends Animal {
    public Dog(String name, int order) {
        super(name, order);
    }

    @Override
    public String getType() {
        return "Dog";
    }
}
