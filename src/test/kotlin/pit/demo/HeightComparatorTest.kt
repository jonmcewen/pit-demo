package pit.demo

import org.junit.Test
import pit.demo.data.Person
import kotlin.test.assertEquals

class HeightComparatorTest {
    @Test
    fun testTallerOf() {
        val classUnderTest = HeightComparator()
        val andrew = Person("Andrew", 1800);
        val bob = Person("Bob", 1900);

        assertEquals(bob, classUnderTest.tallerOf(andrew, bob))
        assertEquals(bob, classUnderTest.tallerOf(bob, andrew))
    }

    @Test
    fun testTallerOfSameHeight() {
        val classUnderTest = HeightComparator()
        val andrew = Person("Andrew", 1800);
        val bob = Person("Bob", 1800);

        assertEquals(andrew, classUnderTest.tallerOf(andrew, bob))
        assertEquals(bob, classUnderTest.tallerOf(bob, andrew))
    }

    @Test
    fun testGetName() {
        Person("Peter", 100).name
    }
}