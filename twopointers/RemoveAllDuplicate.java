package twopointers;

import java.util.Arrays;

public class RemoveAllDuplicate {
	/* test case1: [1, 1, 1, 1, 1] return []
	 * test case2: [1, 2, 3, 1] return [1, 2, 3, 1]
	 * test case3: [1,2, 2, 2, 1] return [1, 1]
	 * test case4: [1, 2, 2, 3, 3, 4] return [1, 4]
	 */
	
	public int[] dedup(int[] array) {
	    // Write your solution here.
	    if(array.length <= 1){
	    	return array;
	    }
	    int slow = -1;
	    for(int fast = 0; fast < array.length; ){
	      if( fast == array.length - 1 || array[fast] != array[fast + 1] ){
	        array[++slow] = array[fast++];
	      } else {
	        int detector = fast;
	        while(fast < array.length && array[detector] == array[fast]){
	        	fast++;
	        }
	      }
	    }
	    return Arrays.copyOfRange(array, 0, slow + 1);
	  }
}
