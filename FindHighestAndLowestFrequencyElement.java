package recursion;
import java.util.*;

public class FindHighestAndLowestFrequencyElement {
	public static void findHighestAndLowest(int[] array) {
		Map<Integer,Integer> m = new HashMap<Integer,Integer>();
		Integer max = 0;
		Integer maxNumber = 0;
		for(int i=0;i<array.length;i++) {
			if(m.containsKey(array[i])) {
				m.put(array[i], m.get(array[i])+1);
			}else {
				m.put(array[i], 1);
			}
		}
		for(Integer key:m.keySet()) {
			if(maxNumber<m.get(key)) {
				max = key;
				maxNumber = m.get(key);
			}
			
		}
		System.out.println(max);
	}
	public static void main(String[] args) {
		int[] array = {1,2,3,3,3,4,4,4,4,5};
		FindHighestAndLowestFrequencyElement.findHighestAndLowest(array);
	}
}
