import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static ArrayList<ArrayList<Integer>> getSubsets(int[] input) {
        Arrays.sort(input);
        ArrayList<ArrayList<Integer>> subsets = new ArrayList<>();
        ArrayList<Integer> currentSubset = new ArrayList<>();
        generateSubsets(input, 0, currentSubset, subsets);
        return subsets;
    }

    private static void generateSubsets(int[] input, int index, ArrayList<Integer> currentSubset, ArrayList<ArrayList<Integer>> subsets) {
        subsets.add(new ArrayList<>(currentSubset));
        for (int i = index; i < input.length; i++) {
            if (i > index && input[i] == input[i - 1])
                continue;

            currentSubset.add(input[i]);
            generateSubsets(input, i + 1, currentSubset, subsets);
            currentSubset.remove(currentSubset.size() - 1);
        }
    }

    public static void printSubsets(int[] input) {
        ArrayList<ArrayList<Integer>> subsets = getSubsets(input);
        for (ArrayList<Integer> subset : subsets) {
            for (int num : subset) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 2};
        printSubsets(input);
    }
}
