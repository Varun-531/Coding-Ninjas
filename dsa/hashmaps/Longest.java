import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
        ArrayList<Integer> array = new ArrayList<>();
        HashMap<Integer, Boolean> map = new HashMap<>();

        // Populate the map with the values in the array
        for (int i : arr) {
            map.put(i, true);
        }

        int maxLength = 0;
        int start = 0;

        for (int i : arr) {
            if (map.get(i) != false) {
                int currentStart = i;
                int currentLength = 1;

                while (map.containsKey(currentStart + 1)) {
                    currentStart = currentStart + 1;
                    currentLength = currentLength + 1;
                    map.put(currentStart, false);
                }

                while (map.containsKey(i - 1)) {
                    i = i - 1;
                    currentStart = i;
                    currentLength = currentLength + 1;
                    map.put(i, false);
                }

                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    start = currentStart;
                }
            }
        }

        for (int i = start; i < start + maxLength; i++) {
            array.add(i);
        }

        return array;
    }
}
