package BinarySearch;

public class LargestNumberSmallerthanTarget {

	public int LargestSmallnumber(int[] arr, int target) {
		int left = 0; 
		int right = arr.length - 1;
		int res = -1;
		while(left <= right) {
			int mid = left + (right - left)/2;
			if(arr[mid] < target) {
				res = mid;
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return res;
	}
}
