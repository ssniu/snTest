package class005_BinarySearch;

public class FirstLastIndex {

	public static void main(String[] args) {
		int[] nums = {5,7,7,8,10};
		int target = 8;
		//>=8 first index
		int lowbound = binarySearchLeft(nums, target);
        System.out.println(lowbound);
        //>8 first index
        int highbound = binarySearchLeft(nums, 9);
        System.out.println(highbound);
        //<8 last index === >=8 first index - 1
        int h2 = binarySearchLeft(nums, 8) - 1;
        System.out.println(h2);
        //<=8 last index == >= 9 first index - 1
        int h3 = binarySearchLeft(nums, 9) - 1;
        System.out.println(h3);
        
        
      //<8 total element number
      		int h01 = binarySearchLeft(nums, 8);
              System.out.println(h01);
              //<=8 total element number
              int h02 = binarySearchLeft(nums, 9);
              System.out.println(h02);
              //>=8 total element number
              int h03 = nums.length - binarySearchLeft(nums, 8);
              System.out.println(h03);
              //>8 total element number
              int h04 = nums.length - binarySearchLeft(nums, 9);
              System.out.println(h04);
	}


	private static int binarySearchLeft(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;
		while(left < right) {
			int m = left + (right - left) / 2;
			if(nums[m] >= target) {
				right = m - 1;
			}else {
				left = m + 1;
			}
		}
		return left;
	}

}
