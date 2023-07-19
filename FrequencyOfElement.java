package recursion;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElement {
	public static void countFrequency(int[] array) {
		Map<Integer,Integer> m = new HashMap<Integer,Integer>();
		for(int i=0;i<array.length;i++) {
			if(m.containsKey(array[i])) {
				m.put(array[i], m.get(array[i])+1);
			}else {
				m.put(array[i], 1);
			}
		}
		System.out.println(m);
	}
	public static void main(String[] args) {
		int[] array = {1,2,1,3,4,5,4};
		FrequencyOfElement.countFrequency(array);
		
	}
}
