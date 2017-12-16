package unicauca.movil.peliculas.net

import retrofit2.Call
import retrofit2.http.*
import unicauca.movil.peliculas.models.Paquetes
import unicauca.movil.peliculas.models.Pelicula

interface PaqApi{

    @GET("api/paquetes")
    fun all():Call<List<Paquetes>>

    @GET("api/paquetes/{id}")
    fun getById(@Path("id") id:String):Call<Paquetes>

    @POST("api/paquetes")
    fun insert(@Body paquete:Paquetes):Call<SimpleResponse>
}

data class SimpleResponse(val success:Boolean)