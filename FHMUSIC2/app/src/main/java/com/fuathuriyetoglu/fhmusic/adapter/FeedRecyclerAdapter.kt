package com.fuathuriyetoglu.fhmusic.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fuathuriyetoglu.fhmusic.databinding.RecyclerRowBinding
import com.fuathuriyetoglu.fhmusic.model.Post
import com.squareup.picasso.Picasso

class FeedRecyclerAdapter(private val postlist: ArrayList<Post>) : RecyclerView.Adapter<FeedRecyclerAdapter.PostHolder>() {
   class PostHolder(val binding : RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root){

   }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostHolder {
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return PostHolder(binding)
    }

    override fun onBindViewHolder(holder: PostHolder, position: Int) {
        holder.binding.recyclerEmailText.text = postlist.get(position).email
        holder.binding.recyclerCommentText.text = postlist.get(position).comment
        Picasso.get().load(postlist.get(position).downloadUr).into(holder.binding.recyclerImageView)
    }


    override fun getItemCount(): Int {
        return postlist.size
    }

}
