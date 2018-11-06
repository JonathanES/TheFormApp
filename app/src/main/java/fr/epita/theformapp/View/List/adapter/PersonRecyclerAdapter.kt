package fr.epita.theformapp.View.List.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import fr.epita.theformapp.Model.Person
import fr.epita.theformapp.R
import fr.epita.theformapp.View.List.viewholder.PersonViewHolder

class PersonRecyclerAdapter(val list: List<Person>): RecyclerView.Adapter<PersonViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.row_person, parent, false)
        return PersonViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        holder.fullnameTextView.text = "${list[position].firstName} ${list[position].lastName}"
        holder.birthDateTextView.text = list[position].birthDate
        if (list[position].image != null)
            holder.pictureImageView.setImageBitmap(list[position].image)
    }
}