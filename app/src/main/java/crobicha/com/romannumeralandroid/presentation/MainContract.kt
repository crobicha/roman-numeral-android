package crobicha.com.romannumeralandroid.presentation

/**
 * Created by Chris Robichaud on 12/12/18.
 */
interface MainContract {

    interface View {
        fun showNumber():Int
        fun showError():String
    }

    interface Presenter {
        fun convertRomanToNumeric(roman:String)
    }
}