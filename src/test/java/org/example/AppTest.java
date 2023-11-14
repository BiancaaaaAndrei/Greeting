package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class AppTest {

    @Test
    @DisplayName("Check that 6 returns \"Good morning\"")
    public void firstTest() {
        Assertions.assertEquals("Good morning!", App.getGreeting(6));
    }
    @ParameterizedTest
    @ValueSource(ints = {5, 8, 12})
    @DisplayName("Check against 5, 8, 12")
    public void checkAgainst5_8_12(int timeOfDay){
        Assertions.assertEquals("Good morning!", App.getGreeting(timeOfDay));
    }
}
