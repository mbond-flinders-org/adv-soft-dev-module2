package module2;

/**
 * Converts a mark out of 100 into a Flinders grade.
 *
 *   HD  85 - 100
 *   DN  75 - 84
 *   CR  65 - 74
 *   P   50 - 64
 *   F    0 - 49
 *
 * Marks below 0 or above 100 are invalid and must throw an IllegalArgumentException.
 *
 * This class has TWO bugs. Run GradeCalculatorTest to find them.
 */
public class GradeCalculator {

    public String letterGrade(int mark) {
        if (mark < 0) {
            throw new IllegalArgumentException("Mark cannot be negative: " + mark);
        }

        if (mark > 85) {
            return "HD";
        } else if (mark >= 75) {
            return "DN";
        } else if (mark >= 65) {
            return "CR";
        } else if (mark >= 50) {
            return "P";
        } else {
            return "F";
        }
    }

    public boolean isPass(int mark) {
        return !letterGrade(mark).equals("F");
    }
}
