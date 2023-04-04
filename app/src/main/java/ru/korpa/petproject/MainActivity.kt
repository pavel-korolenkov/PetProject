package ru.korpa.petproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch
import ru.korpa.memes_domain.usecase.GetMemesUseCase
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var testObject: TestObject

    @Inject
    lateinit var getMemesUseCase: GetMemesUseCase

    override fun onCreate(savedInstanceState: Bundle?) {
        (applicationContext as App).component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val state = findViewById<TextView>(R.id.text_view_state)
        val result = findViewById<TextView>(R.id.text_view_result)
        Log.d("Core", "MainActivity onCreate : $testObject")

        lifecycleScope.launch {
            state.text = "loading"
            getMemesUseCase.getMemes().forEachIndexed { index, item ->
                Log.d("Core", "MainActivity onCreate index = $index mem = $item")
                result.text = item.toString()
            }
            state.text = "loaded"
        }
    }
}