package com.previousTest;
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

/*
 * Create the Encrypter class here.
 */


class Result {

    /*
     * Complete the 'groupSort' function below.
     *
     * The function is expected to return a 2D_INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
	static List<List<Integer>> list = new ArrayList<>();
	
    public static List<List<Integer>> groupSort(List<Integer> arr) {
    // Write your code here
    	System.out.println("arr : " + arr);
    	
    	return list;
    }

}

public class Solution_validator {
    public static void main(String[] args) throws IOException {
    	
    	Scanner scanner = new Scanner(System.in);
		List<String> array = new ArrayList<String>();
	        
          // scanner.hasNext()를 사용하면, 현재 읽어들일 놈이 있는지 확인해줍니다.
          //while (scanner.hasNext()) {
              String temp = scanner.next();
              array.add(temp);
          //}
          System.out.println(array);
    	
    	
    	
    	
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = IntStream.range(0, arrCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        List<List<Integer>> result = Result.groupSort(arr);

        result.stream()
            .map(
                r -> r.stream()
                    .map(Object::toString)
                    .collect(joining(" "))
            )
            .map(r -> r + "\n")
            .collect(toList())
            .forEach(e -> {
                try {
                    bufferedWriter.write(e);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });

        bufferedReader.close();
        bufferedWriter.close();
    }
}