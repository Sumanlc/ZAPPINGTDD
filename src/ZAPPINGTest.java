import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZAPPINGTest {
    @Test
    public void test1() {
        int currentChannel = 0;
        int targetChannel = 1;
        int expectedPresses = 1;

        int actualPresses = ZAPPING.optimalChannelChange(currentChannel, targetChannel);

        assertEquals(expectedPresses, actualPresses, "No se necesitan pulsaciones para el mismo canal");
    }

    @Test
    public void test2(){
        int currentChannel = 1;
        int targetChannel = 2;
        int expectedPresses = 1;

        int actualPresses = ZAPPING.optimalChannelChange(currentChannel, targetChannel);

        assertEquals(expectedPresses, actualPresses, "No se necesitan pulsaciones para el mismo canal");
    }

    @Test
    public void test3(){
        int currentChannel = 10;
        int targetChannel = 30;
        int expectedPresses = 20;

        int actualPresses = ZAPPING.optimalChannelChange(currentChannel, targetChannel);

        assertEquals(expectedPresses, actualPresses, "No se necesitan pulsaciones para el mismo canal");
    }

    @Test
    public void test4(){
        int currentChannel = 2;
        int targetChannel = 99;
        int expectedPresses = 2;

        int actualPresses = ZAPPING.optimalChannelChange(currentChannel, targetChannel);

        assertEquals(expectedPresses, actualPresses, "No se necesitan pulsaciones para el mismo canal");
    }

}