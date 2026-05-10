package class005_BinarySearch;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = {1,3,5,11,24,28};
		int target = 1;
		int res = binarySearch(arr, target);
		System.out.println(res);

	}

	private static int binarySearch(int[] arr, int target) {
		if(arr == null || arr.length == 0) {
			return -1;
		}
		int left = 0;
		int right = arr.length - 1;
		while(left <= right) {
			int m = left + (right - left)/2;
			if(arr[m] == target) {
				return m;
			}else if(arr[m] > target) {
				right = m - 1;
			}else {
				left = m + 1;
			}
		}
		return -1;
	}

}
