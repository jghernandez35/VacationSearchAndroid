package unicauca.movil.peliculas.db

import android.arch.persistence.room.*
import unicauca.movil.peliculas.models.Paquetes

@Dao
interface PaqueteDao{

    @Insert
    fun insert(paquete:Paquetes)

    @Update
    fun update(paquete:Paquetes)

    @Delete
    fun delete(pelicula:Paquetes)

    @Query("SELECT * FROM paquetes")
    fun all():List<Paquetes>
}
