package belajarlayout.ars.id.belajarlayout.day5

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import belajarlayout.ars.id.belajarlayout.R

class MyAdapter(val anggotaList: ArrayList<Anggota>?)
    : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val tvName : TextView = itemView.findViewById(R.id.tvName)
        val tvGender : TextView = itemView.findViewById(R.id.tvGender)
        val tvEmail : TextView = itemView.findViewById(R.id.tvEmail)
        val tvTelpn : TextView = itemView.findViewById(R.id.tvTelpn)
        val tvAddress : TextView = itemView.findViewById(R.id.tvAddress)

    }
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MyViewHolder {
        val view = LayoutInflater.from(p0?.context)
            .inflate(R.layout.list_satuan_layout, p0, false)
        return MyViewHolder(view)
    }
    override fun onBindViewHolder(p0: MyViewHolder, p1: Int) {
        //ini yang belum
        val tempAnggota = anggotaList?.get(p1)
        p0.tvName.text = tempAnggota?.name
        p0.tvGender.text = tempAnggota?.gender
        p0.tvEmail.text = tempAnggota?.email
        p0.tvTelpn.text = tempAnggota?.telpn
        p0.tvAddress.text = tempAnggota?.address
        p0.tvAddress.text = tempAnggota?.address
    }
    override fun getItemCount(): Int {
        if (anggotaList != null) {
            return anggotaList.size
        }
        return  0
    }
}