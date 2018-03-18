package Coursera;

public class FirstOccurrence {
    public static void main(String[] args) {
        String s = "juliasamantantjulia";
        String x = "ant";
        FirstOccurrence fo = new FirstOccurrence();
        System.out.println(fo.firstOccurrence(s, x));
    }

    public int firstOccurrence(String s, String x) {
        if (s.length() == 0 || x.length() == 0 || x.length() > s.length()) {
            return -1;
        }
        for (int i = 0; i < s.length() - x.length() + 1; i++) {
            boolean isSolved = true;
            int currentPointer = i;
            for (int j = 0; j < x.length(); j++) {
                if ((x.charAt(j) == ('*')) || x.charAt(j) == (s.charAt(currentPointer))) {
                    currentPointer += 1;
                    continue;
                } else {
                    isSolved = false;
                    break;
                }
            }
            if (isSolved) {
                return i;
            }
        }
        return -1;
    }
}


