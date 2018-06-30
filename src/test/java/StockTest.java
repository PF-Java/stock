import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StockTest {

    @Test
    @DisplayName("Test Change Precent 1 -1")
    void getChangePercent() {
        Stock stock = new Stock("ORLC", "Oracle Corporation");
        double expected = 0;
        double result = stock.getChangePercent(1, 1);

        assertEquals(expected,result);

    }@Test
    @DisplayName("Test Change Precent 34.5 -34.35")
    void getChangePercent1() {
        Stock stock = new Stock("ORLC", "Oracle Corporation");
        double expected = -0.434782608695648;
        double result = stock.getChangePercent(34.5, 34.35);

        assertEquals(expected,result);
    }
}