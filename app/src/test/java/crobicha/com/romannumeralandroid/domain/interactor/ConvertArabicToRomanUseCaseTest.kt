package crobicha.com.romannumeralandroid.domain.interactor

import org.junit.Test

import org.junit.Assert.*

internal class ConvertArabicToRomanUseCaseTest {

    private val useCase: ConvertArabicToRomanUseCase =
        ConvertArabicToRomanUseCase()

    @Test
    fun testSimpleCases() {
        assertEquals("I", useCase.execute(1))
        assertEquals("V", useCase.execute(5))
        assertEquals("X", useCase.execute(10))
    }

    @Test
    fun testEdgeValues() {
        assertEquals("III", useCase.execute(3))
        assertEquals("IV", useCase.execute(4))
        assertEquals("VIII", useCase.execute(8))
        assertEquals("IX", useCase.execute(9))
        assertEquals("XXIV", useCase.execute(24))
        assertEquals("XLIX", useCase.execute(49))
        assertEquals("MMMCMXCIX", useCase.execute(3999))
    }
}