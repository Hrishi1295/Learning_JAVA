import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'checkMagazine' function below.
     *
     * The function accepts following parameters:
     *  1. STRING_ARRAY magazine
     *  2. STRING_ARRAY note
     */

    public static void checkMagazine(List<String> magazine, List<String> note) {
    // Write your code here
    	boolean condition=false;
    Map<String,Integer> MG =new HashMap<String, Integer>();
    
    for(String words:magazine) {
    	if(MG.containsKey(words)) {
    		MG.put(words, MG.get(words)+1);
    		
    	}
    	else if(!MG.containsKey(words)) {
    		MG.put(words, 1);
    		
    	}
    }
    for(String words:note) {
    	if(MG.containsKey(words)) {
    		System.out.println(words + " "+ MG.get(words));
    		if(MG.get(words)>0) {
    			MG.put(words, MG.get(words)-1);
    			condition=true;
    			
    		}
    		else {
    			System.out.println("No");
    			return;
    		}
    	}
    	else {
			System.out.println("No");
			return;
		}
    }
    if(condition) {
    	System.out.println("Yes");
    }

    }

}

public class ransomNote {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int m = Integer.parseInt(firstMultipleInput[0]);

        int n = Integer.parseInt(firstMultipleInput[1]);

        List<String> magazine = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .collect(toList());

        List<String> note = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .collect(toList());

        Result.checkMagazine(magazine, note);

        bufferedReader.close();
    }
}
