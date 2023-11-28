import java.util.ArrayList;

public class Suitcase {
    private int maximum_weight;
    private ArrayList<Item> items = new ArrayList<>();

    public Suitcase(int maximum_weight) {
        this.maximum_weight = maximum_weight;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public int calculateWeight() {
        if (items.isEmpty()) {
            return 0;
        }
        int overallWeight = 0;
        for (Item item : items) {
            overallWeight += item.getWeight();
        }
        return overallWeight;
    }
    public String toString() {
        if (calculateWeight() > 0) {
            if (items.size() == 1) {
                return items.size() + " item and " + calculateWeight() + " kg";
            }
            return items.size() + " items and " + calculateWeight() + " kg";
        }
        return "Empty suitcase";
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item.getName() + " and it weighs " + item.getWeight() + "kg");
        }
    }

    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }

        int index = 0;
        int heaviestItem = items.get(0).getWeight();

        for (int i = 0; i < items.size(); i++) {
            if (heaviestItem < items.get(i).getWeight()) {
                index = i;
            }
        }
        return items.get(index);
    }
}
