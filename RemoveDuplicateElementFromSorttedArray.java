package problems;

import java.util.*;

public class RemoveDuplicateElementFromSorttedArray {
	public void removeDuplicateElement(int[] arr) {
		List<Number>list = new ArrayList<Number>();
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] != arr[j]) {
					if(i==0) {
						list.add(arr[i]);
					}
					list.add(arr[j]);
					i = j-1;
					break;
				}
	
			}
		}
        System.out.println(list);
	}
	public static void main(String[] args) {
		int[] arr = {0,0,1,1,1,2,2,3,3,4,4};
		RemoveDuplicateElementFromSorttedArray ro = new RemoveDuplicateElementFromSorttedArray();
		ro.removeDuplicateElement(arr);
	}
}
