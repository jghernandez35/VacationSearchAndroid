package unicauca.movil.peliculas.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_main.*
//import org.jetbrains.anko.support.v4.startActivity

import unicauca.movil.peliculas.R
import unicauca.movil.peliculas.adapters.PaqueteAdapter
import unicauca.movil.peliculas.adapters.PeliculaAdapter
import unicauca.movil.peliculas.util.Data
import unicauca.movil.peliculas.util.Data2

//import unicauca.movil.peliculas.util.Data


class MainFragment : Fragment() {

    //val adapter: PeliculaAdapter = PeliculaAdapter(this::movieSelected)
    val adapterp: PaqueteAdapter = PaqueteAdapter()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onResume() {
        super.onResume()
        list.adapter = adapterp
        list.layoutManager = LinearLayoutManager(activity)
        //adapter.data = Data.peliculas
        //adapterp.datap = adapterp.datap
        adapterp.datap = Data2.paquetes
    }

    fun movieSelected(pos:Int){
        //startActivity<DetailActivity>("pos" to pos)
        //val intent = Intent(this, DetailActivity::class.java)
        //startActivity(intent)
        //finish()
    }

    companion object {
        fun instance():MainFragment = MainFragment()
    }

}
