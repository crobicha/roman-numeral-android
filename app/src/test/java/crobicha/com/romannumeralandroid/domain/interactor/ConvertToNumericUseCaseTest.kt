package crobicha.com.romannumeralandroid.domain.interactor

import org.junit.Test

import org.junit.Assert.*

internal class ConvertToNumericUseCaseTest {

    private val useCase: ConvertToNumericUseCase =
        ConvertToNumericUseCase()

    @Test
    fun testSimpleCases() {
            assertEquals(1, useCase.execute("I"))
    }

}
