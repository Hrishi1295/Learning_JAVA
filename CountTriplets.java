
import java.io.IOException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class CountTriplets {
	
	    // Complete the countTriplets function below.
	    static long countTriplets(List<Long> arr, long r) {
			long triplets=0;

			Map<Long, Long> after= new HashMap<>();
			Map<Long, Long> before= new HashMap<>();
			
			for(int i=0;i<arr.size();i++) {
				after.put(arr.get(i), after.getOrDefault(arr.get(i), (long) 0)+1);
				
			
			}
			
			for(Entry<Long, Long> entry:after.entrySet()) {
				System.out.println(entry.getKey()+" "+entry.getValue());
			}
			
			for(int i=0;i<arr.size();i++) {
				after.put(arr.get(i), after.get(arr.get(i))-1);
				
				if(before.containsKey(arr.get(i)/r) && arr.get(i)%r==0 && after.containsKey(arr.get(i)*r)) {
					triplets+= before.get(arr.get(i)/r) * after.get(arr.get(i)*r);
				}
				
				before.put(arr.get(i), before.getOrDefault(arr.get(i), (long) 0)+1);
			}
			
			for(Entry<Long, Long> entry:before.entrySet()) {
				System.out.println(entry.getKey()+" "+entry.getValue());
			}
	    	return triplets;
	        

	    }

	    public static void main(String[] args) throws IOException {
			/*
			 * BufferedReader bufferedReader = new BufferedReader(new
			 * InputStreamReader(System.in)); BufferedWriter bufferedWriter = new
			 * BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
			 * 
			 * String[] nr = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
			 */
	        int n = 6;

	        long r = 1;
	        List<Long> arr = new ArrayList<>();
	        arr.add((long) 1);
	        arr.add((long) 1);
	        arr.add((long) 1);
	        arr.add((long) 1);
	        arr.add((long) 1);
	        arr.add((long) 1);
	        long ans = countTriplets(arr, r);

	       System.out.println(ans);
	    }
	}


