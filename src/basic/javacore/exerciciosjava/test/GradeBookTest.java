package basic.javacore.exerciciosjava.test;

import basic.javacore.exerciciosjava.domain.GradeBook;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class GradeBookTest {

    @Test
    void averageLessThan60() {
        assertEquals('F', GradeBook.averageScore(60, 60, 59));
    }

    @Test
    void averageLessThan70() {
        assertEquals('D', GradeBook.averageScore(70, 70, 69));
    }

    @Test
    void averageLessThan80() {
        assertEquals('C', GradeBook.averageScore(80, 80, 79));
    }

    @Test
    void averageLessThan90() {
        assertEquals('B', GradeBook.averageScore(90, 90, 89));
    }

    @Test
    void averageLessThan100() {
        assertEquals('A', GradeBook.averageScore(100, 100, 99));
    }

    @Test
    void averageScoreException() {
        assertThrows(IllegalArgumentException.class, () -> GradeBook.averageScore(6000, 6000, 6000));
    }


}