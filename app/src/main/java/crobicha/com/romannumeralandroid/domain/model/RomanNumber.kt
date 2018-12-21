package crobicha.com.romannumeralandroid.domain.model

import crobicha.com.romannumeralandroid.domain.interactor.ConvertArabicToRomanUseCase
import crobicha.com.romannumeralandroid.domain.interactor.ConvertRomanToArabicUseCase
import mu.KotlinLogging

/*
I believe that the model shouldn't have a reference to the usecase here,
but I don't have a better method to handle this at the moment.

Care needs to be taken to ensure that the number and string values don't get out of sync
 */
class RomanNumber {

    private val convertRomanToArabicUseCase = ConvertRomanToArabicUseCase()
    private val convertArabicToRomanUseCase = ConvertArabicToRomanUseCase()

    private val logger = KotlinLogging.logger {}

    private var myInt:Int = 0
    private var myString:String = ""

    constructor(value:Int) {
        setValue(value)
    }

    constructor(value:String) {
        setValue(value)
    }

    fun setValue(value: Int) : RomanNumber {
        myInt = value
        myString = convertArabicToRomanUseCase.execute(value) ?: ""

        return this
    }

    fun setValue(value: String) : RomanNumber {
        myString = value
        myInt = convertRomanToArabicUseCase.execute(value) ?: 0

        return this
    }

    fun getInt() = myInt

    override fun toString():String {
        return myString
    }
}