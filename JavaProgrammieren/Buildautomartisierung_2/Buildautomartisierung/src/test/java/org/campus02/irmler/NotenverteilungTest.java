package org.campus02.irmler;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class NotenverteilungTest {

    Notenverteilung nv;
    @BeforeEach
    void setUp() {
        nv = new Notenverteilung();
    }

    @AfterEach
    void tearDown() {
        boolean result = nv.addStudent ("Max");

    }
}