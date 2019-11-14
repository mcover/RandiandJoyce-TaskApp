package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class TaskListFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.task_fragment, container, false)

        val data = listOf("dishes", "groceries", "trash", "clean room")
        recyclerView = view.findViewById(R.id.task_recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(view.context)
        recyclerView.adapter = TaskAdapter(view.context, data)

        return view
    }
}