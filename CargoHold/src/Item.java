public class Item {
    private String name;
    private int weight;
    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {
        if (this.getWeight() == 1) {
            return this.name + " (" + this.getWeight() + "kg)";
        }
        return this.name + " (" + this.getWeight() + "kgs)";
    }


}
