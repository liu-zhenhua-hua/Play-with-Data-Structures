/*
  Solution LeetCode #347 
*/
import java.util.List;
import java.util.TreeMap;

public class Solution{


	public List<Integer> topKFrequent(int[] nums, int k){
		TreeMap<Integer, Integer> map = new TreeMap<>();
		for(int num: nums){
			if(map.containsKey(num))
				map.put(num,map.get(num)+1);
			else
				map.put(num,1);
		}
	}
}
