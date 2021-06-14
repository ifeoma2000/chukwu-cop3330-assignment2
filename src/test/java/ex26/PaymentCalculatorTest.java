package ex26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void calcMonth1() {
        PaymentCalculator paymentCalculator = new PaymentCalculator();
        double expected = 70;
        double actual = paymentCalculator.calculateMonthsUntilPaidOff(12, 5000, 100);
        assertEquals(expected,actual);
    }
    @Test
    void calcMonth2() {
        PaymentCalculator paymentCalculator = new PaymentCalculator();
        double expected = 71;
        double actual = paymentCalculator.calculateMonthsUntilPaidOff(15, 7000, 150);
        assertEquals(expected,actual);
    }
}