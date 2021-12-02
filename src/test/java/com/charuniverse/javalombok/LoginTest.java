package com.charuniverse.javalombok;

import org.junit.jupiter.api.Test;

public class LoginTest {

    @Test
    void testCreate() {
        var login1 = Login.createEmpty();
        var login2 = Login.create("charuniverse", "charuniverse");

        System.out.println(login1);
        System.out.println(login2);
    }
}
