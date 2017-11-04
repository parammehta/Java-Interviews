/*
    You are given a string representing an attendance record for a student. The record only contains the following three characters:

    'A' : Absent.
    'L' : Late.
    'P' : Present.
    A student could be rewarded if his attendance record doesn't contain more than one 'A' (absent) or more than two continuous 'L' (late).

    You need to return whether the student could be rewarded according to his attendance record.
*/

public class StudentAttendanceRecord1 {

    public static void main(String[] args) {
        StudentAttendanceRecord1 checkRecord = new StudentAttendanceRecord1();
        String record = "PPALLL";
        System.out.println(checkRecord.checkRecord(record));
    }

    public boolean checkRecord(String s) {
        int countA = 0;
        int countL = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                countA++;
                if (countA > 1)
                    return false;
            } else if (s.charAt(i) == 'L') {
                countL++;
                if (countL > 1 && s.charAt(i - 1) == 'L')
                    if (countL > 2 && s.charAt(i - 2) == 'L')
                        return false;
            } else
                continue;
        }
        return true;
    }
}
