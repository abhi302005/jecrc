
// Java program to implement
// the above approach
// import java.io.*;
import java.util.*;

class sub_seq {

    // Function to generate all distinct
    // subsequences of the array using backtracking
    public static void backtrack(ArrayList<Integer> nums,
            int start,
            ArrayList<Integer> curr_set) {

        System.out.print(curr_set + " ");
        System.out.println();

        for (int i = start; i < nums.size(); i++) {

            // If the current element is repeating
            if (i > start &&
                    nums.get(i) == nums.get(i - 1)) {
                continue;
            }

            // Include current element
            // into the subsequence
            curr_set.add(nums.get(i));

            // Proceed to the remaining array
            // to generate subsequences
            // including current array element
            backtrack(nums, i + 1, curr_set);

            // Remove current element
            // from the subsequence
            curr_set.remove(curr_set.size() - 1);
        }
    }

    // Function to sort the array and generate
    // subsequences using Backtracking
    public static void AllSubsets(ArrayList<Integer> nums) {

        // Stores the current
        // subsequence
        ArrayList<Integer> curr_set = new ArrayList<>();

        // Sort the vector
        Collections.sort(nums);

        // Backtrack function to
        // generate subsequences
        backtrack(nums, 0, curr_set);
    }

    // Driver Code
    public static void main(String[] args) {
        ArrayList<Integer> v = new ArrayList<>();
        v.add(1);
        v.add(2);
        v.add(3);
        // v.add(4);

        // Function call
        AllSubsets(v);
    }
}

// This code is contributed by hemanthswarna1506
