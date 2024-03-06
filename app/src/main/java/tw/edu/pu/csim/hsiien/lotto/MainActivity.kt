package tw.edu.pu.csim.hsiien.lotto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var t:TextView = findViewById(R.id.txv)
        t.text = "app"
    }
    fun happy(v: View) {
        var txv: TextView = findViewById(R.id.txv)
        txv.text = (1..100).random().toString()
    }

    }