import java.util.Arrays;

public class ProductsOfArrayExceptSelf {
    public static void main(String[] args) {
        ProductsOfArrayExceptSelf obj = new ProductsOfArrayExceptSelf();
        int[] nums = {1, 2, 4, 6};
//        int[] nums2 = {-1, 0, 1, 2, 3};
        System.out.println(Arrays.toString(obj.productExceptSelf(nums)));
//        System.out.println(Arrays.toString(obj.productExceptSelf(nums2)));
    }

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];

        // Step 1: Compute Prefix products
        // output[i] will store the product of all elements to the left of i
        output[0] = 1;
        for (int i = 1; i < n; i++) {
            output[i] = output[i - 1] * nums[i - 1];
        }


        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            output[i] = output[i] * suffix;
            suffix = suffix * nums[i];
        }

        return output;

    }
}
//[-1,0,1,2,3]
//[0,-6,0,0,0]