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

class Result23 {

    /*
     * Complete the 'activityNotifications' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY expenditure
     *  2. INTEGER d
     */
	public static List<Integer> subarray(List<Integer> abc,int i, int j){
		
		return abc.subList(i, j);
		
	}
    public static int activityNotifications(List<Integer> expenditure, int d) {
    // Write your code here
    	int count=0;
        int lsize= expenditure.size();
        int middle= Math.floorMod(d, 2);
            for(int i=0;i<lsize-d;i++){
                
                subarray(expenditure, i, i+d).sort(Comparator.naturalOrder());
                int nextExp=expenditure.get(i+d);
                //System.out.println(sublist);
                
                if(d%2!=0 && nextExp >= 2*sublist.get((middle))) {
                    //System.out.println(d%2+" "+sublist.get((middle))+" "+expenditure.get(i+d));
                    count++;
                };
                if(d%2==0) {
                    int comp= sublist.get(middle) + sublist.get((middle)-1);
                    //System.out.println(comp+" "+expenditure.get(i+d));
                    if(  nextExp >= comp) {
                        count++;
                    }
                }
                
            }
            return count;
    }

}

public class FraudentActivity {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int d = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> expenditure = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result23.activityNotifications(expenditure, d);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
