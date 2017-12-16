package unicauca.movil.peliculas.models

import android.arch.persistence.room.Entity
import android.arch.persistence.room.Ignore
import android.arch.persistence.room.PrimaryKey

@Entity
data class Paquetes(var nombre: String,
                    var precio: Int,
                    var imagen: String,
                    var descripcion: String){
    @PrimaryKey(autoGenerate = true)
    var id: Long? = null

    @Ignore
    constructor():this("",0,"","")
}


//export class PaqueteSQL {
//    id: number;           id
//    nombre: string;       nombre
//    precio: number;       duracion
//    descripcion: string;  sinopsis
//   imagen: string;        imagen
//}