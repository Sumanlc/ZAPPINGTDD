import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZAPPINGTest {
    @Test
    public void test1() {
        int currentChannel = 0;
        int targetChannel = 0;
        int expectedPresses = 0;

        int actualPresses = ZAPPING.optimalChannelChange(currentChannel, targetChannel);

        assertEquals(expectedPresses, actualPresses, "No se necesitan pulsaciones para el mismo canal");
    }

}