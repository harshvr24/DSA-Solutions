import java.util.Arrays;

public class WiggleSort {

    public static void wiggleSort(int[] nums) {
        Arrays.sort(nums);

        for (int i = 1; i < nums.length - 1; i += 2) {
            int temp = nums[i];
            nums[i] = nums[i + 1];
            nums[i + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = {3, 5, 2, 1, 6, 4};

        wiggleSort(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
