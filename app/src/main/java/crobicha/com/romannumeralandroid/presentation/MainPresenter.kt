package crobicha.com.romannumeralandroid.presentation

import crobicha.com.romannumeralandroid.domain.interactor.ConvertArabicToRomanUseCase
import crobicha.com.romannumeralandroid.domain.interactor.ConvertRomanToArabicUseCase
import crobicha.com.romannumeralandroid.domain.interactor.UseCase

/**
 * Created by Chris Robichaud on 12/12/18.
 *
 * The presenter coordinates the UI with the data, ensuring they are in sync.
 * Specifically, it updates the view and acts upon user events that are forwarded by the view
 */

// TODO: @Singleton

// TODO: Dependency Injection

class MainPresenter(private val view: MainContract.View) : MainContract.Presenter {

    // TODO: For now these hardcoded, but we should use dependency injection (dagger)
    val arabicToRoman: UseCase<String?, Int> = ConvertArabicToRomanUseCase()
    val romanToArabic: UseCase<Int?, String> = ConvertRomanToArabicUseCase()

    override fun convertRomanToArabic(roman: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun convertArabicToRoman(arabic: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}