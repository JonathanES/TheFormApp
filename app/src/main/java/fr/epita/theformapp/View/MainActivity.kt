package fr.epita.theformapp.View

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import fr.epita.theformapp.R
import fr.epita.theformapp.View.List.fragment.ListFragment
import fr.epita.theformapp.View.form.FormFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        replacingFragment(R.id.activity_main_frameLayout, ListFragment())
    }
    fun replacingFragment(containerId: Int, fragment: android.support.v4.app.Fragment){
        val fragmentTransaction = this.supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(containerId, fragment)
        fragmentTransaction.commit()
    }
}
