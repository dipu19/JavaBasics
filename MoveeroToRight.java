package problems;

public class MoveeroToRight {
	public void moveZerpToRight(int[] arr) {
		int i=0;
		int j=arr.length-1;
		while(i<=j) {
			if(arr[i]==0) {
				if(arr[j]==0) {
					j--;
				}else {
					arr[i]=arr[j];
					arr[j]=0;
					i++;
					j--;
				}
			}else {
				i++;
			}
		}
		for(int k=0;k<arr.length;k++) {
			System.out.println(arr[k]);
		}
	}
	public static void main(String[] args) {
		int[] arr = {1,0,2,0,3,4,0};
		MoveeroToRight object = new MoveeroToRight();
		object.moveZerpToRight(arr);
	}
}
