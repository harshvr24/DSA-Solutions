import java.util.Arrays;

public class SortedSquares {

    public static int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; ++i) {
            result[i] = nums[i] * nums[i];
        }

        Arrays.sort(result);

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] result = sortedSquares(nums);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
