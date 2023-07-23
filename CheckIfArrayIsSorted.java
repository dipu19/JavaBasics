package problems;

public class CheckIfArrayIsSorted {
	public boolean checkIfArrayIsSorted(int[] arr) {
		boolean isSorted = false;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]<=arr[i+1]) {
				isSorted = true;
			}else {
				isSorted = false;
				return isSorted;
			}
		}
		return isSorted;

	}
	public static void main(String[] args) {
		int[] arr = {1,3,4,5,7,0,8,9};
		CheckIfArrayIsSorted is = new CheckIfArrayIsSorted();
		boolean result = is.checkIfArrayIsSorted(arr);
		System.out.println(result);
	}
}
