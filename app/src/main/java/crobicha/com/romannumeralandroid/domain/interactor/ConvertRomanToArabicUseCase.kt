package crobicha.com.romannumeralandroid.domain.interactor

import mu.KotlinLogging

/*
Implementation ideas: Use a stack
Parse input left to right, add to stack
Ensure that we set this up (model etc) as a clean arch pattern
 */

class ConvertRomanToArabicUseCase : UseCase<Int?, String> {

    private val logger = KotlinLogging.logger {}

    override fun execute(arg: String): Int? {

        var total = 0

        for (char in arg) {
            logger.debug { "cqr $char" }

            total += when (char.toUpperCase()) {

                'I' -> 1

                'V' -> 5

                'X' -> 10

                else -> {
                    logger.error { "Unrecognized char $char" }
                    return null
                }
            }
        }

        return total
    }

        // Example https://www.rosettacode.org/wiki/Roman_numerals/Decode#Kotlin
//        if (arg.isEmpty()) return 0
//        var n = 0
//        var last = 'O'
//        for (c in arg) {
//            when (c) {
//                'I' -> n += 1
//                'V' -> if (last == 'I') n += 3   else n += 5
//                'X' -> if (last == 'I') n += 8   else n += 10
//                'L' -> if (last == 'X') n += 30  else n += 50
//                'C' -> if (last == 'X') n += 80  else n += 100
//                'D' -> if (last == 'C') n += 300 else n += 500
//                'M' -> if (last == 'C') n += 800 else n += 1000
//            }
//            last = c
//        }
//        return n
//    }

}