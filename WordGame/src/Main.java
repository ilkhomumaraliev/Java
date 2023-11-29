import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Wordset set = new Wordset();

        UserInterface userInterface = new UserInterface(scanner, set);
        userInterface.start();
        System.out.println(set.palindromes());
    }
}