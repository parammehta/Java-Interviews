import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class BestAverageGrade {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String input[][] =
                {
                        {"Sarah", "99"},
                        {"Sarah", "100"},
                };
        Map<String, Double> averageMap = new HashMap<>();
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < input.length; i++) {
            if (averageMap.containsKey(input[i][0])) {
                int freq = frequencyMap.get(input[i][0]);
                double avg = averageMap.get(input[i][0]);
                if (input[i][1] == null || input[i][1].length() == 0) {
                    avg = avg * freq + 0;
                } else {
                    avg = avg * freq + Double.parseDouble(input[i][1]);
                }
                freq++;
                avg = avg / freq;
                frequencyMap.remove(input[i][0]);
                averageMap.remove(input[i][0]);
                frequencyMap.put(input[i][0], freq);
                averageMap.put(input[i][0], avg);
            } else {
                frequencyMap.put(input[i][0], 1);
                averageMap.put(input[i][0], Double.parseDouble(input[i][1]));
            }
        }
        Iterator iterator = averageMap.entrySet().iterator();
        double largestObj = Double.MIN_VALUE;
        while (iterator.hasNext()) {
            Map.Entry pair = (Map.Entry) iterator.next();
            if (largestObj < (Double) pair.getValue()) {
                largestObj = (Double) pair.getValue();
            }
            iterator.remove();
        }
        Double largestAverage = largestObj;
        System.out.println(largestAverage);
    }

}