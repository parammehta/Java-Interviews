/*
    Given a time represented in the format "HH:MM", form the next closest time by reusing the current digits. There is no limit on how many times a digit can be reused.

    You may assume the given input string is always valid. For example, "01:34", "12:09" are all valid. "1:34", "12:9" are all invalid.
 */

public class NextClosestTime {
    public static void main(String[] args) {
        NextClosestTime closestTime = new NextClosestTime();
        String time = "19:34";
        System.out.println(closestTime.nextClosestTime(time));
    }

    public String nextClosestTime(String time) {

        int[] mins = {600, 60, 10, 1};
        int colonIndex = time.indexOf(":");
        int currMins = Integer.parseInt(time.substring(0, colonIndex)) * 60 + Integer.parseInt(time.substring(colonIndex + 1));

        if (currMins == 0 || time.equals("11:11") || time.equals("22:22"))
            return time;

        char[] result = new char[4];
        for (int i = 1; i < 1440; i++) {
            int nextMins = (currMins + i) % 1440;
            int index = 0;
            for (; index < 4; index++) {
                result[index] = (char) ('0' + nextMins / mins[index]);
                nextMins %= mins[index];
                if (time.indexOf(result[index]) == -1) break;
            }
            if (index == 4) break;
        }

        return new String(result, 0, 2) + ":" + new String(result, 2, 2);
    }
}