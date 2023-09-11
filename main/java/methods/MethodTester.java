public class MethodTester {
    public static void main(String[] args) {
        int[] nums = { -1, 5, -1, 3, -1, 17 };
        // int[] nums = {-5, -3, -1, 4, 6, 8};
        // int[] nums = { -1, 12, -3, 14, -4, 3 };
        // int[] nums = { 2, -3, 5, -1, 0, 7};
        int result = algorithm2(nums);

        System.out.println("Max sum: " + result);
    }

    public static int algorithm1(int[] nums) {
        int maxSum = 0;

        // 1st loop is iterating through the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxSum)
                maxSum = nums[i];
        }
        // 2 elements subarray loop

        for (int i = 0; i < nums.length - 1; i++) {
            int subArraySum = nums[i] + nums[i + 1];

            if (subArraySum > maxSum)
                maxSum = subArraySum;
        }

        // 3 elements subarray loop

        for (int i = 0; i < nums.length - 2; i++) {
            int subArraySum = nums[i] + nums[i + 1] + nums[i + 2];

            if (subArraySum > maxSum)
                maxSum = subArraySum;
        }
        return maxSum;
    }

    public static int algorithm2(int[] nums) {
        int maxSum = 0;

        // loop
        for (int i = 0; i < nums.length; i++) {
            // From the current index, we want to get the 1, 2, and 3 element subarray sums
            // ex: if we're at index 0, we want to get the sums of nums[0], nums[0] +
            // nums[1], nums[0] + nums[1] + nums[2]
            // [1, 2, 3, 4]
            int subArrayOne = 0, subArrayTwo = 0, subArrayThree = 0;
            subArrayOne = nums[i];

            if (subArrayOne > maxSum)
                maxSum = subArrayOne;

            // if there's 2 elements left in the array from our current index
            if (i < nums.length - 1) {
                subArrayTwo = subArrayOne + nums[i + 1];

                if (subArrayTwo > maxSum)
                    maxSum = subArrayTwo;
            }

            if (i < nums.length - 2) {
                subArrayThree = subArrayTwo + nums[i + 2];

                if (subArrayThree > maxSum)
                    maxSum = subArrayThree;
            }

        }

        return maxSum;
    }

    // Optional
    public static int algorithm3(int[] nums) {
        int maxSum = 0;

        // TODO

        return maxSum;
    }
}
