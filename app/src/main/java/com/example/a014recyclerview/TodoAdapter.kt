package com.example.a014recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TodoAdapter (var todos:List<Todo>):RecyclerView.Adapter<TodoAdapter.TodoViewHolder>(){

    inner class TodoViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_todo, parent, false)
        return TodoViewHolder(view)
    }


    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        holder.itemView.apply {
            val tvTitle : TextView = findViewById(R.id.tvTitle)
            tvTitle.text = todos[position].title
            val cbDone : CheckBox= findViewById(R.id.cbDone)
            cbDone.isChecked = todos[position].isChecked
        }
    }

    override fun getItemCount(): Int {
        return todos.size
    }
}