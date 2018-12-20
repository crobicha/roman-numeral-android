package crobicha.com.romannumeralandroid.domain.interactor

import mu.KotlinLogging

class ConvertArabicToRomanUseCase : UseCase<String, Int> {

    private val logger = KotlinLogging.logger {}

    override fun execute(arg: Int): String {

        var remainder = arg
        var output = ""

        while(remainder > 0) {

            if (remainder >= 10) {

                output += "X"
                remainder -= 10

            } else if (remainder >= 5) {

                output += "V"
                remainder -= 5

            } else {

                output += "I"
                remainder -= 1
            }
        }

        return output
    }
}