package crobicha.com.romannumeralandroid.domain.model

import org.junit.Assert.*
import org.junit.Test

class RomanNumberTest {

    @Test
    fun testGetArabic() {
        assertEquals(1, RomanNumber("I").getInt())
        assertEquals(5, RomanNumber("V").getInt())
        assertEquals(10, RomanNumber("X").getInt())
    }

    @Test
    fun testGetRoman() {
        assertEquals("I", RomanNumber(1).toString())
        assertEquals("V", RomanNumber(5).toString())
        assertEquals("X", RomanNumber(10).toString())
    }

    @Test
    fun testChangeValue() {
        val rn = RomanNumber(0)
        assertEquals("", rn.toString())
        assertEquals(1, rn.setValue("I").getInt())
        assertEquals("V", rn.setValue(5).toString())
    }
}