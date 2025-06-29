package org.halimah.SUT;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SUTTest {
    private SUT systemUnderTest;

    @BeforeEach
    void setUp(){
        systemUnderTest = new SUT("start of individual test case");
    }
    private static ResourceForAllTest resourceForAllTest;

    @BeforeAll
    static void setUpClass(){
        resourceForAllTest  = new ResourceForAllTest("Before all tests can begin");
    }

    @Test
    @DisplayName("Additional work")
    @Disabled("This Feature is under Construction")
    void canReceiveRegularWorks() {
        boolean canReceiveRegularWork = systemUnderTest.canReceiveRegularWorks();
        assertTrue(canReceiveRegularWork);
    }

    @Test
    @DisplayName("Workers")
    @Disabled
    void canReceiveAdditionalWorks() {
        boolean canReceiveAdditionalWork = systemUnderTest.canReceiveAdditionalWorks();
        assertFalse(canReceiveAdditionalWork);
    }

//    @Test
//    void itShouldClose() {
//    }

    @AfterEach
    void tearDown(){
        systemUnderTest.close();
    }

    @AfterAll
    static void tearDownClass(){
        resourceForAllTest.close();

    }
}