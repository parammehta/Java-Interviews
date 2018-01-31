public class LovelyNumber {
    // Method to print unique digit numbers
    // in range from l to r.
    static void printUnique(int n) {
        int count = 0;
        // Start traversing the numbers
        for (int i = 0; i <= n; i++) {
            int num = i;
            boolean visited[] = new boolean[10];

            // Find digits and maintain its hash
            while (num != 0) {
                // if a digit occurs more than 1 time
                // then break
                if (visited[num % 10])
                    break;

                visited[num % 10] = true;

                num = num / 10;
            }

            // num will be 0 only when above loop
            // doesn't get break that means the
            // number is unique so print it.
            if (num == 0) {
                // Print the unique Numbers
                // System.out.print(i + " ");
                // Count the Unique numbers
                count++;
            }
        }
        System.out.println(count);
    }

    // Driver method
    public static void main(String args[]) {
        int n = 1000;
        printUnique(n);
    }
}
