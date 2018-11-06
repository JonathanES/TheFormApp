package fr.epita.theformapp.ViewModel

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import fr.epita.theformapp.Model.Person

class PersonViewModel(application: Application):AndroidViewModel(application) {
    var listPerson = mutableListOf<Person>()
}