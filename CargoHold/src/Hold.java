import java.util.ArrayList;

public class Hold {
    private int maxWeight;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }
    private ArrayList<Suitcase> luggage = new ArrayList<>();
    public void addSuitcase(Suitcase suitcase) {
        if (suitcase.calculateWeight() <= this.getMaxWeight()) {
            luggage.add(suitcase);
        }
    }

    public int overallWeight() {
        int overallWeight = 0;
        for (Suitcase suitcase : luggage) {
            overallWeight += suitcase.calculateWeight();
        }
        return overallWeight;
    }
    public String toString() {
        if (luggage.isEmpty()) {
            return "Luggage is empty";
        }

        if (luggage.size() == 1) {
            return luggage.size() + " item " + overallWeight() + "kg";
        }

        return luggage.size() + " items " + overallWeight() + "kgs";
    }

    public void printItems() {
        for (Suitcase suitcase : luggage) {
            suitcase.printItems();
        }
    }
}
