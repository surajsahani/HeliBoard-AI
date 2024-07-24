package helium314.keyboard.latin.setup

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import helium314.keyboard.latin.R

class TermsOfUseActivity : AppCompatActivity() {
    lateinit var terms:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_terms_of_use)

        terms=findViewById(R.id.terms)
        terms.setOnClickListener{
            startActivity(Intent(this, KeybaordActivity::class.java))
        }
    }
}