package basic.javacore.exerciciosjava.test;
import basic.javacore.exerciciosjava.domain.CountingSheep;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class CountingSheepTest {

    @Test
    void countingSheep() {
        assertEquals(11, CountingSheep.totalOfSheep());
    }

}
