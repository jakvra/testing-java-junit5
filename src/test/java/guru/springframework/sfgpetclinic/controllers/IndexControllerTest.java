package guru.springframework.sfgpetclinic.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IndexControllerTest {

    IndexController controller;

    @BeforeEach
    void setUp() {
        controller = new IndexController();
    }

    @Test
    @DisplayName("Test Proper View name is returned from index page")
    void index() {
        assertEquals("index", controller.index());
        assertEquals("index", controller.index(), "Wrong View Returned");
        assertEquals("index", controller.index(), () -> "Another Expensive Message" +
                " Make me only if you have to");
    }

    @Test
    @DisplayName("Test Exception")
    void oopsHandler() {
//        assertTrue("notimplemented".equals(controller.oopsHandler()), () -> "This is some expensive" +
//                " for my test");

        assertThrows(ValueNotFoundException.class, () -> {
            controller.oopsHandler();
        });
    }
}