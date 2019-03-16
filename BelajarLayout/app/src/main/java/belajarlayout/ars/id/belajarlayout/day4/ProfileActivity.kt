package belajarlayout.ars.id.belajarlayout.day4

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.EditText
import android.widget.Spinner
import belajarlayout.ars.id.belajarlayout.R
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {

    var edtName: EditText? = null
    var spinnerGender: Spinner? = null
    var edtEmail: EditText? = null
    var edtTelp: EditText? = null
    var edtAlamat: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        ambilData()
    }

    private fun ambilData() {
        val bundle = intent.extras
        val nama = bundle.getString("nama")
        val gender = bundle.getString("gender")
        val email = bundle.getString("email")
        val telp = bundle.getString("telp")
        val alamat = bundle.getString("alamat")
        txtName.text = nama
        txtGender.text = gender
        txtEmail.text = email
        txtTelp.text = telp
        txtAddress.text = alamat
    }


}
