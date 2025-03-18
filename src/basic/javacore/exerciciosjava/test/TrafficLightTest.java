package basic.javacore.exerciciosjava.test;
import basic.javacore.exerciciosjava.domain.TrafficLight;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrafficLightTest {

    @Test
    void trafficLightGreen() {
        assertEquals("Yellow", TrafficLight.trafficLightCurrentState("Green"));
    }

    @Test
    void trafficLightYellow() {
        assertEquals("Red", TrafficLight.trafficLightCurrentState("Yellow"));
    }

    @Test
    void trafficLightRed() {
        assertEquals("Green", TrafficLight.trafficLightCurrentState("Red"));
    }

    @Test
    void trafficLightException() {
        assertThrows(IllegalArgumentException.class, () -> TrafficLight.trafficLightCurrentState("Blue"));
    }
}
