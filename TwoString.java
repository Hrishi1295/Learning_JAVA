import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result1 {

    /*
     * Complete the 'twoStrings' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s1
     *  2. STRING s2
     */

    public static String twoStrings(String s1, String s2) {
    // Write your code here
    	boolean substr=false;
    Map<Character,Integer> str= new HashMap<>();
    for(int i=0;i<s1.length();i++) {
    	if(str.containsKey(s1.charAt(i))) {
    		str.put(s1.charAt(i), str.get(s1.charAt(i))+1);
    	}else {
    		str.put(s1.charAt(i), 1);
    	}
    }
    for(int i=0;i<s2.length();i++) {
    	if(str.containsKey(s2.charAt(i))) {
    		substr=true;
    	}
    }
    if(substr) {
	return "Yes";
    }else {
    	return "NO";
    }
    }

}

public class TwoString {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s1 = bufferedReader.readLine();

                String s2 = bufferedReader.readLine();

                String result = Result1.twoStrings(s1, s2);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
