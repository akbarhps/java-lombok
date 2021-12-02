package com.charuniverse.javalombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

public class FileHelperTest {

    @Test
    void testPom() {
        String text = FileHelper.loadFile("pom.xml");
        System.out.println(text);
    }

    @Test
    void testNotFound() {
        Assertions.assertThrows(FileNotFoundException.class, () -> FileHelper.loadFile("notfound.xml"));
    }
}
