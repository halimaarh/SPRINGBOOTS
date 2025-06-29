package org.halimah.hamcrest;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.anything;
import static org.hamcrest.Matchers.hasToString;

import org.halimah.calculator.Calculator;
import org.testng.annotations.Test;

public class HamcrestTest {
    @Test
    void stringMatcher() {
//        assertThat("Hello", is(anything()));
//        assertThat(12, describedAs("13 is not equal to 12", is(equalTo((12)))));
        assertThat("World", is(equalTo("World")));
    }

//    @Test
//    void logicalMatchers() {
//        assertThat("myValue", allOf(startsWith("my"), containsString("Val")));
//        assertThat("myValue", allOf(startsWith("foo"), containsString("Val")));
//        assertThat("World", is(not(equalTo("Word"))));
//    }

    @Test
    void objectMatchers() {
        assertThat("World", is(equalTo("World")));
        assertThat("true", hasToString("true"));
        assertThat(new Calculator(), instanceOf(Calculator.class));
        assertThat("myValue", is(notNullValue()));
        //assertThat("myValue" , is(nullValue()));
        Object myValue = new Object();
        Object nullValue = myValue;
        assertThat(myValue, sameInstance(nullValue));

   }

}
