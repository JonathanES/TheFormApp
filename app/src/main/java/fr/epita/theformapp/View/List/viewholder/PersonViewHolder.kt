package fr.epita.theformapp.View.List.viewholder

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import fr.epita.theformapp.R

class PersonViewHolder internal constructor(itemView: View): RecyclerView.ViewHolder(itemView) {
    val pictureImageView = itemView.findViewById<ImageView>(R.id.row_person_imageView_picture)
    val fullnameTextView = itemView.findViewById<TextView>(R.id.row_person_textView_fullname)
    val birthDateTextView = itemView.findViewById<TextView>(R.id.row_person_textView_birthdate)
}