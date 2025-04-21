package array_and_string;

public class find_closest_number_to_zero {
    public static void main(String[] args) {
        int nums[] = { -4, -2, 1, 4, 8 };
        System.out.println(findClosestNumber(nums));
    }

    public static int findClosestNumber(int[] nums) {
        // return nums[0];
        // Initialize the closest number to the first element of the array
        int closest = nums[0];

        // Iterate through the array to find the closest number to zero
        for (int i = 1; i < nums.length; i++) {
            // Check if the absolute value of the current number is less than the absolute
            // value of the closest number
            if (Math.abs(nums[i]) < Math.abs(closest)) {
                closest = nums[i];
            } else if (Math.abs(nums[i]) == Math.abs(closest)) {
                // If they are equal, choose the positive one
                closest = Math.max(closest, nums[i]);
            }
        }

        return closest;
    }
}
