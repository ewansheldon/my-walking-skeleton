package codurance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class AppTest {
    @Test
    void run_this_test_and_pass() {
        System.out.println("this test was run !");
        System.out.println("this test was really run !");
        assertTrue(true);
    }

    @Test
    void run_this_test_and_fail() {
        assertTrue(false);
    }
}