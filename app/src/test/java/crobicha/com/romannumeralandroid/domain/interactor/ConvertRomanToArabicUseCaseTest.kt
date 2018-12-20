package crobicha.com.romannumeralandroid.domain.interactor

import org.junit.Test

import org.junit.Assert.*

internal class ConvertRomanToArabicUseCaseTest {

    private val useCaseRoman: ConvertRomanToArabicUseCase =
        ConvertRomanToArabicUseCase()

    @Test
    fun testSingleChars() {
        assertEquals(1, useCaseRoman.execute("I"))
        assertEquals(5, useCaseRoman.execute("V"))
        assertEquals(10, useCaseRoman.execute("X"))
    }

    @Test
    fun testMultipleChars() {
        assertEquals(2, useCaseRoman.execute("II"))
        assertEquals(3, useCaseRoman.execute("III"))
        assertEquals(30, useCaseRoman.execute("XXX"))
        assertEquals(20, useCaseRoman.execute("XX"))
    }

    @Test
    fun testAddition() {
        assertEquals(16, useCaseRoman.execute("XVI"))
    }

    @Test
    fun testSubtracting() {
        assertEquals(9, useCaseRoman.execute("IX"))
        assertEquals(4, useCaseRoman.execute("IV"))
    }

    @Test
    fun testSpecialChars() {
        assertNull(useCaseRoman.execute("0"))
        assertNull(useCaseRoman.execute("X.X"))
        assertNull(useCaseRoman.execute("X X"))
    }

    @Test
    fun testInvalidOrdering() {
        assertNull("XVIVX")
        assertNull("IXX")
        assertNull("VIX")
        assertNull("IXI")
    }

    @Test
    fun testMediumNumbers() {
        assertEquals(39, useCaseRoman.execute("XXXIX"))
        assertEquals(246, useCaseRoman.execute("CCXLVI"))
        assertEquals(421, useCaseRoman.execute("CDXXI"))
    }


    @Test
    fun testLargeNumbers() {
        assertEquals(1776, useCaseRoman.execute("MDCCLXXVI"))
        assertEquals(1954, useCaseRoman.execute("MCMLIV"))
        assertEquals(1990, useCaseRoman.execute("MCMXC"))
        assertEquals(2014, useCaseRoman.execute("MMXIV"))
    }

    @Test
    fun testMissingPlaces() {
        assertEquals(160, useCaseRoman.execute("CLX"))
        assertEquals(207, useCaseRoman.execute("CCVII"))
        assertEquals(1066, useCaseRoman.execute("MLXVI"))
    }
}
