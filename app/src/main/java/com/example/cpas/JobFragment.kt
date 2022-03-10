package com.example.cpas

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class JobFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.job_fragment, container, false)

        val tmp  = arrayListOf<Posting>(
            Posting("취업", "미리 보기", "1분 전", "3", R.drawable.comment),
            Posting("제목", "미리 보기", "1분 전", "3", R.drawable.comment),
            Posting("제목", "미리 보기", "1분 전", "3", R.drawable.comment),
            Posting("제목", "미리 보기", "1분 전", "3", R.drawable.comment),
            Posting("제목", "미리 보기", "1분 전", "3", R.drawable.comment),
            Posting("제목", "미리 보기", "1분 전", "3", R.drawable.comment),
            Posting("제목", "미리 보기", "1분 전", "3", R.drawable.comment),
            Posting("제목", "미리 보기", "1분 전", "3", R.drawable.comment),
            Posting("제목", "미리 보기", "1분 전", "3", R.drawable.comment),
            Posting("제목", "미리 보기", "1분 전", "3", R.drawable.comment),
            Posting("제목", "미리 보기", "1분 전", "3", R.drawable.comment),
            Posting("제목", "미리 보기", "1분 전", "3", R.drawable.comment),
            Posting("제목", "미리 보기", "1분 전", "3", R.drawable.comment),
            Posting("제목", "미리 보기", "1분 전", "3", R.drawable.comment)
        )

        val rv = view.findViewById<RecyclerView>(R.id.rv_posting1)
        rv.layoutManager = LinearLayoutManager(null)
        rv.setHasFixedSize(true)
        rv.adapter = PostingAdapter(tmp)

        return view
    }

}