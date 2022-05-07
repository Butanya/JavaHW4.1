import static org.junit.jupiter.api.Assertions.*;

public class BonusServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        int amount = 1000_60;
        boolean registered = true;
        int expected = 30;

        int actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        int amount = 1_000_000_60;
        boolean registered = true;
        int expected = 500;

        int actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForNonRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        int amount = 1000_60;
        boolean registered = false;
        int expected = 10;

        int actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForNonRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        int amount = 1_000_000_60;
        boolean registered = false;
        int expected = 500;

        int actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
}

