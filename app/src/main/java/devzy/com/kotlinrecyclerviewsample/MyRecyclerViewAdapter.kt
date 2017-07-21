package devzy.com.kotlinrecyclerviewsample

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import devzy.com.saylao_eng.User

/**
 * Created by ted555 on 7/21/17.
 */
class MyRecyclerViewAdapter(var userList: ArrayList<User>) : RecyclerView.Adapter<MyRecyclerViewAdapter.ViewHolder>() {

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.bindItems(userList[position])
    }

    //this method is returning the view for each item in the list
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent?.context).inflate(R.layout.list_layout, parent,false)

        return ViewHolder(view)
    }

    //this method is giving the size of the list
    override fun getItemCount(): Int {

        return userList.size
    }

    //Class is holding the items view
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bindItems(user: User) {

            val userNameTextView: TextView = itemView.findViewById(R.id.username_text_view)
            val  addressTextView: TextView = itemView.findViewById(R.id.address_text_view)

            userNameTextView.text = user.userName
            addressTextView.text = user.address
        }
    }
}