package bryan.myappcompany.usdtoquid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    fun convertCurrency(view: View) {
        val editText: EditText = findViewById(R.id.editTextNumberDecimal)
        val amountInUSD: String = editText.text.toString()
        val amountInUSDDouble: Double = amountInUSD.toDouble()
        val amountInPoundsDouble: Double = amountInUSDDouble * .79
        val amountInPoundsString: String = String.format("%.2f", amountInPoundsDouble)
        Toast.makeText(this, "$$amountInUSD is £$amountInPoundsString", Toast.LENGTH_LONG).show()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}