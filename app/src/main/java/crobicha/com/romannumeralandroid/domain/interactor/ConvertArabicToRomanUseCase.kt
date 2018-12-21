package crobicha.com.romannumeralandroid.domain.interactor

import mu.KotlinLogging

class ConvertArabicToRomanUseCase : UseCase<String?, Int> {

    private val logger = KotlinLogging.logger {}

//    override fun execute(arg: Int): String? {
//
//        var remainder = arg
//        var output = ""
//
//        while(remainder > 0) {
//
//            if (remainder >= 10) {
//
//                output += "X"
//                remainder -= 10
//
//            } else if (remainder >= 5) {
//
//                output += "V"
//                remainder -= 5
//
//            } else {
//
//                output += "I"
//                remainder -= 1
//            }
//        }
//
//        return if ("".equals(output)) {
//            null
//        } else {
//            output
//        }
//
//    }

    // Example https://www.rosettacode.org/wiki/Roman_numerals/Encode#Kotlin

    val romanNumerals = mapOf(
        1000 to "M",
        900 to "CM",
        500 to "D",
        400 to "CD",
        100 to "C",
        90 to "XC",
        50 to "L",
        40 to "XL",
        10 to "X",
        9 to "IX",
        5 to "V",
        4 to "IV",
        1 to "I"
    )

    override fun execute(number: Int): String? {

        if (number > 5000 || number < 1) {
            return null
        }
        var num = number
        var result = ""
        for ((multiple, numeral) in romanNumerals.entries) {
            while (num >= multiple) {
                num -= multiple
                result += numeral
            }
        }
        return result
    }
}