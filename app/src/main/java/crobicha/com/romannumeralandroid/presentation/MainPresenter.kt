package crobicha.com.romannumeralandroid.presentation

/**
 * Created by Chris Robichaud on 12/12/18.
 *
 * The presenter coordinates the UI with the data, ensuring they are in sync.
 * Specifically, it updates the view and acts upon user events that are forwarded by the view
 */

class MainPresenter(private val view: MainContract.View) : MainContract.Presenter {
    override fun convertRomanToNumeric(roman: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}