package com.example.affirmations.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

class ItemAdapter(
    //Context = global information about the activity environment e.g. screen size
    private val context: Context,
    private val dataset: List<Affirmation>
    ): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    //view is representing one row
    class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view){

        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)

    }
    //infalte a new layout from XML for every single item in grid
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
    //Activity context is being passed to layoutinfalter
        val adapterLayout = LayoutInflater.from(parent.context)
    //dont attach child view "list_item" to parent "ViewGroup" right now add it later
            .inflate(R.layout.list_item, parent, false)
    //return a new holder instance
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {

        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)


    }
    override fun getItemCount(): Int = dataset.size

}

