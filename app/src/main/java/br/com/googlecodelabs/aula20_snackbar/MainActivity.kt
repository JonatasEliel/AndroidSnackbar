package br.com.googlecodelabs.aula20_snackbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import com.google.android.material.snackbar.Snackbar.make
import kotlinx.android.synthetic.main.info.*

class MainActivity : AppCompatActivity() {
    val TAG: String = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_login.setOnClickListener {
            showSnack("Senha incorreta")
        }

//        button_snack.setOnClickListener {
//            showSnack("Olá mundo cruel!")
//        }
    }

    fun showSnack(msg: String) {
        val snack: Snackbar = make(home, msg, Snackbar.LENGTH_LONG)
        snack.setAction("Ok", View.OnClickListener {
            Toast.makeText(this, "Deu certo", Toast.LENGTH_SHORT).show()
        })
        snack.show()
    }
}