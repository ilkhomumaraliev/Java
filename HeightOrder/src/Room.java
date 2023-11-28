import java.util.ArrayList;

public class Room {

    public ArrayList<Person> people;
    public Room() {
        people = new ArrayList<>();
    }
    public void add(Person person) {
        people.add(person);
    }

    public boolean isEmpty() {
        return people.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return this.people;
    }

    public Person shortest() {
        if (people.isEmpty()) {
            return null;
        }
        int index = 0;
        for (int i = 0; i < people.size(); i++) {
            int minimumHeight = people.get(0).getHeight();

            if (minimumHeight >= people.get(i).getHeight()) {
                index = i;
            }

        }
        return people.get(index);
    }
}
