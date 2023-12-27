package com.demoqa.simple;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("simple")
public class SkippedTests {

    @Test
    @Disabled
    void someTest1() { assertTrue(false); }

    @Test
    @Disabled("some reason")
    void someTest2() { assertTrue(false); }


}
