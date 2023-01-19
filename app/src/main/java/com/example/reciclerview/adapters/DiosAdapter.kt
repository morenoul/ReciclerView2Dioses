package com.example.reciclerview.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.reciclerview.R
import com.example.reciclerview.holders.ViewHolderItem
import com.example.reciclerview.models.Dios
import com.example.reciclerview.providers.DiosProvider

class DiosAdapter(context: Context) : RecyclerView.Adapter<ViewHolderItem>() {

    private val inflater = LayoutInflater.from(context)
    val items:List<Dios> = DiosProvider.dioses_del_olimpo

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderItem {
        return ViewHolderItem(inflater.inflate(R.layout.dataitem, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolderItem, position: Int) {
        val item = items[position]
        holder.render(item)
    }

    override fun getItemCount(): Int {
        return items.size
    }


}
