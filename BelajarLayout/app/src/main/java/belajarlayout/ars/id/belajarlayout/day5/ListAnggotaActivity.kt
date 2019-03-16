package belajarlayout.ars.id.belajarlayout.day5

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import belajarlayout.ars.id.belajarlayout.R

class ListAnggotaActivity : AppCompatActivity() {
    private lateinit var recyclerView : RecyclerView
    private lateinit var viewAdapter : RecyclerView.Adapter<*>
    private lateinit var viewManager : RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_anggota)

        viewManager = LinearLayoutManager(this)
        viewAdapter = MyAdapter(DaftarAnggotaActivity.anggotaList)
        recyclerView = findViewById(R.id.rcAnggota)
        recyclerView.layoutManager = viewManager
        recyclerView.adapter = viewAdapter

    }
}
