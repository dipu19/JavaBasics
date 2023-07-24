package problems;

public class LeftRotafeArrayByOnePlace {
	public void leftRotate(int [] arr, int rotation) {
		int n = rotation;
		int count = 0 ;
		while(count <n) {
			int firstElement = arr[0];
			for(int i=0;i<arr.length;i++) {
				if(i != arr.length-1) {
					arr[i] = arr[i+1];
				}else {
					arr[i] = firstElement;
				}
			}
			count++;
		}
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		LeftRotafeArrayByOnePlace object = new LeftRotafeArrayByOnePlace();
		object.leftRotate(arr,2);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
