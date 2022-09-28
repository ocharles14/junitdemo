package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquashAutomJUnitTests {

    @Test
    void test1() {
        int a = 1;
        int b = 1;
        assertTrue( 2 == a + b,"Add error !" );
    }

}
