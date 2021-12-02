package com.charuniverse.javalombok;

import org.junit.jupiter.api.Test;

public class RegisterTest {

    @Test
    void testWith() {
        var register = new Register("Hello", "World");
        var register2 = register.withUsername("Charuniverse");
    }

}
