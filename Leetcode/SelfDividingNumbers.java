import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public static void main(String[] args) {
        int left = 1;
        int right = 22;
        SelfDividingNumbers solution = new SelfDividingNumbers();
        System.out.println(solution.selfDividingNumbers(left, right));

    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> selfDividing = new ArrayList();
        int start = left;
        int end = right;
        Outer:
        for (int i = left; i <= right; i++) {
            int currentNo = i;
            while (currentNo != 0) {
                int temp = currentNo % 10;
                if (temp == 0 || i % temp != 0)
                    continue Outer;
                currentNo = currentNo / 10;
            }
            selfDividing.add(i);
        }
        return selfDividing;
    }
}
