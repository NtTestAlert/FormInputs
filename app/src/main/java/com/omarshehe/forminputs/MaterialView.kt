package com.omarshehe.forminputs

import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_material_view.*

class MaterialView : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_material_view)

        txtFullName.setTextInputLayout(fullNameView)
        txtEmail.setTextInputLayout(emailView)
        txtPhoneNumber.setTextInputLayout(phoneNumberView)
        btnSubmit.showLoading(true)
        btnSubmit.setOnClickListener {
            if(!txtFullName.isError(mainView) && !txtEmail.isError(mainView) && !txtPhoneNumber.isError(mainView)){
                btnSubmit.showLoading(true)
                Handler().postDelayed({
                    btnSubmit.showLoading(false)
                }, 1000)
            }
        }
    }
}
