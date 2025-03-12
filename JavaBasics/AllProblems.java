package JavaBasics;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AllProblems {

    public static void main(String[] args) {
        // reverseWords("Let's take LeetCode contest");

        // Two sum
        // int[] nums = { 6, 3, 11, 15 };
        // int target = 9;

        // brute force
        // int[] out = twoSum(nums,target);

        // Two-pass Hash Table
        // int[] out = twoSum(nums, target, "hash");

        // System.out.printf("Indices: %d, %d%n", out[0], out[1]);

        // sub array

        int[] nums = {2,3,8, 3, 1, 3, 1, -4, -2, -2 };

        if (hasZeroSumSubarray(nums)) {
            System.out.println("Subarray exists");
        } else {
            System.out.println("Subarray does not exist");
        }

    }

    public static String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder out = new StringBuilder();
        for (String word : arr) {
            for (int j = word.length() - 1; j >= 0; j--) {
                out.append(word.charAt(j));
            }
            out.append(" ");
        }
        return out.toString().trim();
    }

    // brute force way
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {}; // No solution found
    }

    // Two-pass Hash Table
    public static int[] twoSum(int[] nums, int target, String type) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        // Build the hash table
        for (int i = 0; i < n; i++) {
            numMap.put(nums[i], i);
        }

        // Find the complement
        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement) && numMap.get(complement) != i) {
                return new int[] { i, numMap.get(complement) };
            }
        }

        return new int[] {}; // No solution found
    }

    public static Boolean hasZeroSumSubarray(int[] nums)
    {
        // create an empty set to store the sum of elements of each
        // subarray `nums[0…i]`, where `0 <= i < nums.length`
        Set<Integer> set = new HashSet<>();
 
        // insert 0 into the set to handle the case when subarray with
        // zero-sum starts from index 0
        set.add(0);
 
        int sum = 0;
 
        // traverse the given array
        for (int value: nums)
        {
            // sum of elements so far
            sum += value;
 
            // if the sum is seen before, we have found a subarray with zero-sum
            if (set.contains(sum)) {
                return true;
            }
 
            // insert sum so far into the set
            set.add(sum);
        }
 
        // we reach here when no subarray with zero-sum exists
        return false;
    }
}
