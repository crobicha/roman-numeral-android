package crobicha.com.romannumeralandroid.domain.interactor

import mu.KotlinLogging

// fun execute(arg: Argument): Result

class ConvertToNumericUseCase : UseCase<Int?, String> {

    private val logger = KotlinLogging.logger {}

    override fun execute(arg: String): Int? {

        var total = 0

        for (char in arg) {
            logger.debug { "cqr $char" }

            when (char.toUpperCase()) {

                'I' -> total += 1

                'V' -> total += 5

                'X' -> total += 10

                else -> {
                    logger.error { "Unrecognized char $char" }
                    return null
                }
            }
        }

        return total

    }

}