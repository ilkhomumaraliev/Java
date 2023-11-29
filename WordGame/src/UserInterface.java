import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private Wordset wordset;


    public UserInterface(Scanner scanner, Wordset wordset) {
        this.scanner = scanner;
        this.wordset = wordset;
    }

    public void start() {
        while (true) {
            System.out.println("Enter a word");
            String word = scanner.nextLine();

            if (this.wordset.contains(word)) {
                break;
            }
            this.wordset.add(word);
        }
        System.out.println("You have entered the same word twice");
    }
}
