/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package pit.demo

import kotlin.test.Test
import kotlin.test.assertTrue
import kotlin.test.assertEquals

class LibraryTest {
    @Test fun testSomeLibraryMethod() {
        val classUnderTest = Library()
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'")
    }

    @Test fun testAdding() {
        val classUnderTest = Library()
        assertEquals(2, classUnderTest.add(1,1))
    }

    @Test fun testDividing() {
        val classUnderTest = Library()
        assertEquals(1, classUnderTest.divide(2,2))
    }
}