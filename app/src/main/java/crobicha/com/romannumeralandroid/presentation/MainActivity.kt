package crobicha.com.romannumeralandroid.presentation

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import crobicha.com.romannumeralandroid.R

class MainActivity : AppCompatActivity(), MainContract.View {
    override fun showArabic(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showRoman(): String {
        TODO("not implemented")
    }

    override fun showError(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
