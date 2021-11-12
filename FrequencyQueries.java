import java.io.*;

import java.util.*;

import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class FrequencyQueries {

    // Complete the freqQuery function below.
    static List<Integer> freqQuery(List<List<Integer>> queries) {
		Map <Integer, Integer> store= new HashMap<Integer, Integer>();
		List<Integer> ans= new ArrayList<Integer>();
		for (int j=0;j<queries.size();j++) {
			List<Integer> i= new ArrayList<Integer>();
			i=queries.get(j);
			if(i.get(0)==1)
			{
				store.put(i.get(1), store.getOrDefault(i.get(1), 0)+1);
			}
			if(i.get(0)==2)
			{
				if(store.containsKey(i.get(1))) {
					store.put(i.get(1), store.get(i.get(1)-1));
				}
			}
			if(i.get(0)==3) {
				if(store.containsValue(i.get(1))){
					ans.add(1);
				}
				else {
					ans.add(0);
				}
			}
		}
    	return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> queries = new ArrayList<>();

        IntStream.range(0, q).forEach(i -> {
            try {
                queries.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> ans = freqQuery(queries);

        bufferedWriter.write(
            ans.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
