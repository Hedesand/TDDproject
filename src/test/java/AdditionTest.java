import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdditionTest {
    Calculator calculator;

    @BeforeEach
    void setUp()
    {calculator = new Calculator();}

    @Test
    @DisplayName("Additions test")
    void addTwoNumbers() {
        assertEquals(4, ((Calculator) calculator).add(2,2));
    }

    @Test
    @DisplayName("Subtraktion test")
    void subTwoNumbers() {
        assertEquals(4, ((Calculator) calculator).sub(6,2));
    }
}
