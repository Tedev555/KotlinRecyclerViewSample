package devzy.com.kotlinrecyclerviewsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout
import devzy.com.saylao_eng.User

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Blinding RecyclerView from XML
        val recyclerView = findViewById(R.id.recyclerview) as RecyclerView

        //Adding LayoutManger to RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        //crating an arraylist to store users using the data class user
        val users = ArrayList<User>()

        //adding some dummy data to the list
        users.add(User("Belal Khan", "Ranchi Jharkhand"))
        users.add(User("Ramiz Khan", "Ranchi Jharkhand"))
        users.add(User("Faiz Khan", "Ranchi Jharkhand"))
        users.add(User("Yashar Khan", "Ranchi Jharkhand"))

        //creating our adapter
        val adapter = MyRecyclerViewAdapter(users)

        //now adding the adapter to recyclerview
        recyclerView.adapter = adapter



    }
}
