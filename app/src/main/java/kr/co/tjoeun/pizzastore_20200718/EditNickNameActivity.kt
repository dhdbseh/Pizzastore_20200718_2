package kr.co.tjoeun.pizzastore_20200718

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class EditNickNameActivity : BaseActivity() {
    override fun setupEvents() {

    }

    override fun setValues() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_nick_name)
        setupEvents()
        setValues()
    }
}