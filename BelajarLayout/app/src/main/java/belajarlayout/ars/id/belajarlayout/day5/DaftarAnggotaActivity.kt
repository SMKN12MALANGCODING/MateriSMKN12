package belajarlayout.ars.id.belajarlayout.day5

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import belajarlayout.ars.id.belajarlayout.R
import kotlinx.android.synthetic.main.activity_daftar_anggota.*
import kotlinx.android.synthetic.main.activity_register.view.*

class DaftarAnggotaActivity : AppCompatActivity() {
    var anggota = Anggota()
    //ditambahi
    companion object {
         var anggotaList = ArrayList<Anggota>()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar_anggota)


        btnSave.setOnClickListener {
            anggota?.name = edtName.text.toString()
            anggota?.gender = spinnerGender.selectedItem.toString()
            anggota?.email = edtEmail.text.toString()
            anggota?.telpn = edtTelp.text.toString()
            anggota?.address= edtAddress.text.toString()
//            Toast.makeText(this,
//                anggota.gender+" "+anggota.email,
//                Toast.LENGTH_SHORT).show()

            anggotaList?.add(anggota)

            val intent = Intent(this, ListAnggotaActivity::class.java)
            startActivity(intent)

        }
    }

}


