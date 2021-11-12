import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;



public class SherlocksAnagram {
    public static void main(String[] args) throws IOException {
        int result=0;
        
        String s="ifailuhkqq";
        Map<String, Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++) {
        	for(int j=i+1;j<s.length()+1;j++) {
        			String s1=s.substring(i, j);
        			String S2=sortString(s1);
        			if(map.containsKey(S2)) {
        			map.put(S2, map.get(S2)+1);}
        			else {
        				map.put(S2, 1);
        			}
        		
        	}
        }
      for(Entry<String, Integer> entry:map.entrySet()) {
    	  System.out.println(entry.getKey()+" "+entry.getValue());
    	  if(entry.getValue()>1) {
    		  result=result+(entry.getValue()*(entry.getValue()-1)/2);
    	  }
      }
      System.out.println(result);
    }
    
    public static String sortString(String inputString)
    {
        // Converting input string to character array
        char tempArray[] = inputString.toCharArray();
 
        // Sorting temp array using
        Arrays.sort(tempArray);
 
        // Returning new sorted string
        return new String(tempArray);
    }
}
