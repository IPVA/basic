package basic.javacore.exerciciosjava.test;
import basic.javacore.exerciciosjava.domain.NegativeNumber;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NegativeNumberTest02 {

    @Test
    void inverseNumberZeroToZero() {
        assertEquals(0, NegativeNumber.inverseNumber(0));
    }

    @Test
    void inverseNumberOneToOne() {
        assertEquals(1, NegativeNumber.inverseNumber(1));
    }

    @Test
    void inverseNumberLongNumber() {
        assertEquals(85432, NegativeNumber.inverseNumber(52834));
    }

    @Test
    void inverseNumberDefault() {
        assertEquals(632, NegativeNumber.inverseNumber(362));
    }

}
