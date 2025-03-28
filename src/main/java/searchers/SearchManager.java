package searchers;

public class SearchManager {

    public static boolean findOrFail(Integer[] sortedCollection, int numberToBeFound) {
        int left = 0;
        int right = sortedCollection.length - 1;
        boolean wasFound = false;

        while(left <= right && !wasFound) {
            int mid = left + (right -left) / 2;
            if (sortedCollection[mid] == numberToBeFound) {
                wasFound = true;
            }
            if (!wasFound) {
                if (sortedCollection[mid] < numberToBeFound) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return wasFound;
    }

}
