import searchers.SearchManager;
import utils.Utils;

public class HelloSearchingApp {

    public static void main(String[] args) {
        Integer[] numbers = getNumbers();

        // ❗Ordering MUST BE implemented.

        int numberToBeDiscovered = 100; // Change it at your discretion
        boolean wasFound = SearchManager.findOrFail(numbers, numberToBeDiscovered);
        if (!wasFound) {
            System.err.println("Sorry, " + numberToBeDiscovered + " was not found!");
            System.exit(-1);
        }

        System.out.println("Hooray!, " + numberToBeDiscovered + " was found!");

        System.out.println("Thanks for using this version of search binary");

        System.exit(0);
    }

    private static Integer[] getNumbers() {
        return Utils.getNumbers(10);
    }
}
