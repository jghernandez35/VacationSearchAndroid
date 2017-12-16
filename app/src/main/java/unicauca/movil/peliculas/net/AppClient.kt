package unicauca.movil.peliculas.net

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object AppClient{

    private val retrofit:Retrofit = Retrofit.Builder()
            .baseUrl("http://192.168.43.93:3000/")//si es desde un emulador
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    val paqApi:PaqApi = retrofit.create(PaqApi::class.java)
}