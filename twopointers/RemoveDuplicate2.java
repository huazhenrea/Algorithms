package twopointers;

import java.util.Arrays;

public class RemoveDuplicate2 {
	public int[] DeduplicateK(int[] arr, int k) {
		if(arr.length <= k) {
			return arr;
		}
		int slow = k;
		for(int i = k; i < arr.length; i++) {
			if(arr[i] != arr[slow - k]) {
				arr[slow++] = arr[i];
			}
		}
		return Arrays.copyOfRange(arr, 0, slow);
	}
}
