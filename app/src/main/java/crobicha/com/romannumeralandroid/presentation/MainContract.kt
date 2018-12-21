package crobicha.com.romannumeralandroid.presentation

/**
 * Created by Chris Robichaud on 12/12/18.
 */
interface MainContract {

    interface View {
        fun showArabic():Int
        fun showRoman():String
        fun showError():String
    }

    interface Presenter {
        fun convertRomanToArabic(roman:String)
        fun convertArabicToRoman(arabic:Int)
    }
}