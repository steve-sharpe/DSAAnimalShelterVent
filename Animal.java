public abstract class Animal {
    private String name;
    private int order; // To keep track of the arrival order

    public Animal(String name, int order) {
        this.name = name;
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public int getOrder() {
        return order;
    }

    public abstract String getType();
}
