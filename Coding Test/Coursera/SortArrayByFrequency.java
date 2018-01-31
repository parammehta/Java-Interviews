import java.util.*;

public class SortArrayByFrequency {

    public static void main(String[] args) {
        String[] stringArray = {"Hello", "Hello", "HI", "HI", "HI", "Bye", "Bye"};
        SortArrayByFrequency sort = new SortArrayByFrequency();
        System.out.println(Arrays.toString(sort.sortArrayByFrequency(stringArray)));
    }

    public String[] sortArrayByFrequency(String[] strings) {

        Map<String, Integer> counter = new HashMap<String, Integer>();
        for (String str : strings)
            counter.put(str, 1 + (counter.containsKey(str) ? counter.get(str) : 0));

        List<String> list = new ArrayList<String>(counter.keySet());
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String x, String y) {
                return counter.get(y) - counter.get(x);
            }
        });
        strings = list.toArray(new String[list.size()]);
        return strings;
    }

}
