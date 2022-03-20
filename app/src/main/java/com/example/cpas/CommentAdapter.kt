package com.example.cpas

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class CommentAdapter(val commentList : ArrayList<Comment>) : RecyclerView.Adapter<CommentAdapter.CustomViewHolder>() {

    inner class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val who: TextView = itemView.findViewById(R.id.comment_who)
        val content : TextView = itemView.findViewById(R.id.comment_content)
        val time : TextView = itemView.findViewById(R.id.comment_time)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CommentAdapter.CustomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.comment_item, parent, false)

        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: CommentAdapter.CustomViewHolder, position: Int) {
        holder.who.text = commentList[position].who
        holder.content.text = commentList[position].content
        holder.time.text = commentList[position].time
    }

    override fun getItemCount(): Int {
        return commentList.size
    }

}