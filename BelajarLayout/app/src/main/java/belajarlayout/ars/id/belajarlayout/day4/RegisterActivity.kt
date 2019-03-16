package belajarlayout.ars.id.belajarlayout.day4

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.Toast
import belajarlayout.ars.id.belajarlayout.R
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {

    var namaInput : String = ""
    var emailInput : String = ""
    var telpInput : String = ""
    var alamatInput : String = ""
    var genderInput : String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        btnSave.setOnClickListener { validasiInput() }
        setDataSpinnerData()
    }

    private fun setDataSpinnerData() {
        val adapter = ArrayAdapter.createFromResource(this, R.array.gender_list, android.R.layout.simple_spinner_dropdown_item)

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerGender?.adapter = adapter
    }

    private fun validasiInput() {

        namaInput = edtName?.text.toString()
        emailInput = edtEmail?.text.toString()
        telpInput = edtTelp?.text.toString()
        genderInput = spinnerGender?.selectedItem.toString()
        alamatInput = edtAddress?.text.toString()

        when {
            namaInput.isEmpty() -> edtName?.error = "Nama tidak boleh kosong"
            emailInput.isEmpty() -> edtEmail?.error = "Email tidak boleh kosong"
            telpInput.isEmpty() -> edtTelp?.error = "Telp tidak boleh kosong"
            alamatInput.isEmpty() -> edtAddress.error = "Alamat tidak boleh kosong"
            else -> {
                Toast.makeText(this, "Navigasi ke halaman profil diri", Toast.LENGTH_SHORT).show()
                navigasiKeProfilDiri()
            }
        }
    }

    private fun navigasiKeProfilDiri() {
        val intent = Intent(this, ProfileActivity::class.java)
        val bundle = Bundle()
        bundle.putString("nama", namaInput)
        bundle . putString ("gender", genderInput)
        bundle.putString("email", emailInput)
        bundle . putString ("telp", telpInput)
        bundle.putString("alamat", alamatInput)
        intent.putExtras(bundle)

        startActivity(intent)
    }
}
