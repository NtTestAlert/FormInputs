package com.omarshehe.forminputs

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        confirmPassword.setViewToConfirm(password)
        confirmEmail.setViewToConfirm(email)

        startActivity(Intent(this, MaterialView::class.java))
        btnSubmit.setOnClickListener {
            if (!gender.isError(mainView) && !country.isError((mainView)) && !fullName.isError(mainView) && !price.isError(mainView)  && !phoneNumber.isError(mainView)  && !about.isError(mainView) && !email.isError(mainView) && !confirmEmail.isError(mainView) && !password.isError(mainView)) {
                btnSubmit.showLoading(true)
                Handler().postDelayed({
                    btnSubmit.showLoading(false)
                    startActivity(Intent(this, Programmatically::class.java))
                }, 1000)
            }
        }

    }
}
