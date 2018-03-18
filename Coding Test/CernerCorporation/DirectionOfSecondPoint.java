package CernerCorporation;/*

Given two graph points determine in what direction (N, NE, NW, E, W, S, SE, SW) the second point is from the first and
 display. If points are the same display 'here'.
 */

public class DirectionOfSecondPoint {

    static String direction(int x1, int x2, int y1, int y2) {
        StringBuilder d = new StringBuilder();
        if (x1 == x2 && y1 == y2)
            return "here";

        if (y1 < y2)
            d.append("N");
        else if (y1 > y2)
            d.append("S");
        else
            d.append("");

        if (x1 < x2)
            d.append("E");
        else if (x1 > x2)
            d.append("W");
        else
            d.append("");

        return d.toString();
    }

    public static void main(String[] args) {
        int x1 = 1;
        int x2 = 2;
        int y1 = 3;
        int y2 = 4;

        System.out.println(direction(1, 2, 3, 4));//NE
        System.out.println(direction(4, 2, 5, 1));//SW
        System.out.println(direction(0, 0, 0, 1));//N
        System.out.println(direction(3, 2, 1, 1));//W
        System.out.println(direction(0, 1, 2, 1));//SE
        System.out.println(direction(0, 0, 0, 0));//here
    }

}
