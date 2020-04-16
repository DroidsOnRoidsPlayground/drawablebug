package pl.droidsonroids.drawablebug

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.text).setCompoundDrawablesRelativeWithIntrinsicBounds(TimeOfDay.values().random().icon, 0, 0 ,0)
    }
}
