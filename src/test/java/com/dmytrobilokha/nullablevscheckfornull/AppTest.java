package com.dmytrobilokha.nullablevscheckfornull;

import org.testng.annotations.Test;

import static org.testng.Assert.assertNotNull;

public class AppTest {
    @Test
    public void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest);
    }
}
