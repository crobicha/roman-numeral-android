package crobicha.com.romannumeralandroid.domain.interactor

import org.junit.Test

import org.junit.Assert.*

internal class ConvertToNumericUseCaseTest {

    private val useCase: ConvertToNumericUseCase =
        ConvertToNumericUseCase()

    @Test
    fun testSingleChars() {
        assertEquals(1, useCase.execute("I"))
        assertEquals(5, useCase.execute("V"))
        assertEquals(10, useCase.execute("X"))
    }

    @Test
    fun testMultipleChars() {
        assertEquals(2, useCase.execute("II"))
        assertEquals(3, useCase.execute("IIi"))
        assertEquals(30, useCase.execute("XxX"))
        assertEquals(20, useCase.execute("xx"))
    }
}
