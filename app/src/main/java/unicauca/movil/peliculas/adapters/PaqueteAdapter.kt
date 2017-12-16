package unicauca.movil.peliculas.adapters

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import unicauca.movil.peliculas.R
import unicauca.movil.peliculas.models.Paquetes
import unicauca.movil.peliculas.util.inflate

class PaqueteAdapter : RecyclerView.Adapter<PeliculaViewHolder>() {

    var datap: List<Paquetes> = emptyList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onBindViewHolder(holder: PeliculaViewHolder, position: Int) {
        //holder.binding.movie = datap[position]
        //holder.binding.root.tag = position
        //holder.binding.handler = this
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeliculaViewHolder
            = PeliculaViewHolder(parent.inflate(R.layout.template_pelicula))

    override fun getItemCount(): Int = datap.size

    //constructor() : this()

}
