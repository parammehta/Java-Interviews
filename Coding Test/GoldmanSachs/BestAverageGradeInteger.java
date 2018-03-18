package GoldmanSachs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class BestAverageGradeInteger {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String input[][] =
                {
                        {"Sarah", "98"},
                        {"Sarah", "99"},
                        {"Sarah", "100"},
                        {"Sarah", "101"},
                        {"Sarah", "102"},
                        {"Sarah", "103"},
                        {"Sarah", "-104"}
                };
        Map<String, Integer> averageMap = new HashMap<>();
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < input.length; i++) {
            if (averageMap.containsKey(input[i][0])) {
                int freq = frequencyMap.get(input[i][0]);
                int avg = averageMap.get(input[i][0]);
                if (input[i][1] == null || input[i][1].length() == 0) {
                    avg = avg * freq + 0;
                } else {
                    avg = avg * freq + Integer.parseInt(input[i][1]);
                }
                freq++;
                avg = avg / freq;
                frequencyMap.remove(input[i][0]);
                averageMap.remove(input[i][0]);
                frequencyMap.put(input[i][0], freq);
                averageMap.put(input[i][0], avg);
            } else {
                frequencyMap.put(input[i][0], 1);
                averageMap.put(input[i][0], Integer.parseInt(input[i][1]));
            }
        }
        Iterator iterator = averageMap.entrySet().iterator();
        int largestObj = Integer.MIN_VALUE;
        while (iterator.hasNext()) {
            Map.Entry pair = (Map.Entry) iterator.next();
            if (largestObj < (Integer) pair.getValue()) {
                largestObj = (Integer) pair.getValue();
            }
            iterator.remove();
        }
        int largestAverage = largestObj;
        System.out.println(largestAverage);
    }

}