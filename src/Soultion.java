import java.util.Arrays;

public class Soultion {
	public int[] twoSum(int[] nums, int target) {
        
	       for(int i = 0; i < nums.length; i++) {
	        for(int j = i + 1; j < nums.length; j++) {
	            if(nums[i] + nums[j] == target) {
	                return new int[]{i, j};
	            }
	        }
	    }
	    return new int[]{-1, -1};
	}
	public static void main(String[] args) {

	    Soultion s = new Soultion();

	    int[] nums = {3, 4, 5, 6, 1};
	    int target = 7;

	    int[] result = s.twoSum(nums, target);
	    
	    int[] nums2 = {4, 5, 6};
        int target2 = 10;
        System.out.println(Arrays.toString(s.twoSum(nums2, target2)));

        // Example 3
        int[] nums3 = {5, 5};
        int target3 = 10;
        System.out.println(Arrays.toString(s.twoSum(nums3, target3)));

	    System.out.println(result[0] + " " + result[1]);
	}
}
