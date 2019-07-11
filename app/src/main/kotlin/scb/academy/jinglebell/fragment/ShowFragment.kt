package scb.academy.jinglebell.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_show.view.*
import kotlinx.android.synthetic.main.item_song.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import scb.academy.jinglebell.R
import scb.academy.jinglebell.adapter.SongAdapter
import scb.academy.jinglebell.service.ApiManager
import scb.academy.jinglebell.vo.Song
import scb.academy.jinglebell.vo.SongSearchResult

class ShowFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val _view = inflater.inflate(R.layout.fragment_show, container, false)

        return _view

    }

}
