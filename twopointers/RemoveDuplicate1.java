package twopointers;

import java.util.*;

public class RemoveDuplicate1 {
	/*testcase1: [1, 1, 2, 2, 3] return [1, 2, 3]
	 * 
	 */
	public int[] Deduplicate(int[] arr) {
		if(arr.length <= 1) {
			return arr;
		}
		int slow = 1;
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] != arr[slow - 1]) {
				arr[slow++] = arr[i];
			}
		}
		return Arrays.copyOfRange(arr, 0, slow);
	}
}
