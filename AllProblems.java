public class AllProblems {

    public static void main(String[] args) {
        // reverseWords("Let's take LeetCode contest");
        int[] out = twoSum();
        System.out.printf("Indices: %d, %d%n", out[0], out[1]);
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

    public static int[] twoSum() {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] out = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    out[0] = i;
                    out[1] = j;
                    return out;
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
