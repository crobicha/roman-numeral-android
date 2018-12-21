package crobicha.com.romannumeralandroid.domain.interactor

import org.junit.Test

import org.junit.Assert.*

internal class ConvertRomanToArabicUseCaseTest {

    private val useCase: ConvertRomanToArabicUseCase =
        ConvertRomanToArabicUseCase()

    @Test
    fun testSingleChars() {
        assertEquals(1, useCase.execute("I"))
        assertEquals(5, useCase.execute("V"))
        assertEquals(10, useCase.execute("X"))
    }

    @Test
    fun testMultipleChars() {
        assertEquals(2, useCase.execute("II"))
        assertEquals(3, useCase.execute("III"))
        assertEquals(30, useCase.execute("XXX"))
        assertEquals(20, useCase.execute("XX"))
    }

    @Test
    fun testAddition() {
        assertEquals(16, useCase.execute("XVI"))
    }

    @Test
    fun testSubtracting() {
        assertEquals(9, useCase.execute("IX"))
        assertEquals(4, useCase.execute("IV"))
    }

    @Test
    fun testSpecialChars() {
        assertNull(useCase.execute("0"))
        assertNull(useCase.execute("X.X"))
        assertNull(useCase.execute("X X"))
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
        assertEquals(39, useCase.execute("XXXIX"))
        assertEquals(246, useCase.execute("CCXLVI"))
        assertEquals(421, useCase.execute("CDXXI"))
    }


    @Test
    fun testLargeNumbers() {
        assertEquals(1776, useCase.execute("MDCCLXXVI"))
        assertEquals(1954, useCase.execute("MCMLIV"))
        assertEquals(1990, useCase.execute("MCMXC"))
        assertEquals(2014, useCase.execute("MMXIV"))
    }

    @Test
    fun testEdgeCases() {
        assertEquals(3999, useCase.execute("MMMCMXCIX"))
    }

    @Test
    fun testMissingPlaces() {
        assertEquals(160, useCase.execute("CLX"))
        assertEquals(207, useCase.execute("CCVII"))
        assertEquals(1066, useCase.execute("MLXVI"))
    }
}
