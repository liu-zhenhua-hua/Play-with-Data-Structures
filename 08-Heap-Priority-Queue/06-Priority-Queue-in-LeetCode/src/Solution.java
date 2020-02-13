/*
  Solution LeetCode #347 
*/
import java.util.List;
import java.util.TreeMap;

public class Solution{

	private class Freq implements Comparable<Freq>{
		int e;
		int freq;


		@Override
		public int comparaTo(Freq another){
			if(this.freq < another.freq)
				return 1;
			else if(this.freq > another.freq)
				return -1;
			else
				return 0;
		}
	}


	public List<Integer> topKFrequent(int[] nums, int k){
		TreeMap<Integer, Integer> map = new TreeMap<>();
		for(int num: nums){
			if(map.containsKey(num))
				map.put(num,map.get(num)+1);
			else
				map.put(num,1);
		}


		PriorityQueue<Freq> pq = new PriorityQueue<>(); 
	}
}
