package module2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Do NOT change this file. The tests describe what GradeCalculator should do.
 * If a test fails, the bug is in GradeCalculator, not here.
 */
class GradeCalculatorTest {

    private final GradeCalculator grades = new GradeCalculator();

    @Test
    void mark92IsHD() {
        assertEquals("HD", grades.letterGrade(92));
    }

    @Test
    void mark85IsHD() {
        assertEquals("HD", grades.letterGrade(85));
    }

    @Test
    void mark80IsDN() {
        assertEquals("DN", grades.letterGrade(80));
    }

    @Test
    void mark70IsCR() {
        assertEquals("CR", grades.letterGrade(70));
    }

    @Test
    void mark50IsP() {
        assertEquals("P", grades.letterGrade(50));
    }

    @Test
    void mark49IsF() {
        assertEquals("F", grades.letterGrade(49));
    }

    @Test
    void mark50IsAPass() {
        assertTrue(grades.isPass(50));
    }

    @Test
    void mark49IsNotAPass() {
        assertFalse(grades.isPass(49));
    }

    @Test
    void negativeMarkThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> grades.letterGrade(-1));
    }

    @Test
    void markOver100ThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> grades.letterGrade(101));
    }
}
