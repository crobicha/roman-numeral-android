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
}