package unicauca.movil.peliculas.util

import unicauca.movil.peliculas.models.Paquetes
import unicauca.movil.peliculas.models.Pelicula

object Data : List<Pelicula> {
    override val size: Int
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.

    override fun contains(element: Pelicula): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun containsAll(elements: Collection<Pelicula>): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun get(index: Int): Pelicula {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun indexOf(element: Pelicula): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isEmpty(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun iterator(): Iterator<Pelicula> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun lastIndexOf(element: Pelicula): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun listIterator(): ListIterator<Pelicula> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun listIterator(index: Int): ListIterator<Pelicula> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun subList(fromIndex: Int, toIndex: Int): List<Pelicula> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    var peliculas: MutableList<Pelicula> = mutableListOf(
            Pelicula("PARQUE DEL CAFE", "120000", "10 de Enero",
                    "http://portalesdelcafe.com/wp-content/uploads/2016/08/parcafe.jpg",
                    "1. Alojamiento por cuatro noches cinco días en acomodación doble o triple en los Hoteles previstos:\n" +
                            "\n" +
                            "* Miércoles: Guadalajara de Buga y/o Hostal del Regidor.\n" +
                            "* Jueves y viernes: hotel Tocurinca del Quindío (una hermosa finca-hotel) y/o el Hostal de la Vega.\n" +
                            "* Sábado, Dann Cali y/o Torre de Cali.\n" +
                            "\n" +
                            "2. Alimentación descrita en el programa: DOS COMIDAS DIARIAS (desayunos, almuerzos o cenas), durante la excursión\n" +
                            "\n" +
                            "3. Transporte para realizar el itinerario descrito en la programación\n" +
                            "\n" +
                            "4. Tiquete de ingreso a:\n" +
                            "\n" +
                            "* Parque Nacional del Café\n" +
                            "* Parque Nacional de la Cultura Agropecuaria PANACA con ingreso al Mundo del Caballo que es espectacular y demás atracciones del parque\n" +
                            "* Zoológico de Cali\n" +
                            "* Hacienda El Paraíso\n" +
                            "* Museo de la Caña de Azúcar\n" +
                            "\n" +
                            "5. Guía acompañante desde que los turistas llegan a la ciudad de Cali\n" +
                            "\n" +
                            "6. Rifas durante el recorrido de varios ejemplares del libro “Turismo Un Sueño por la Paz” de Belisario Marín Montes responsable de este programa. (El más económico de cuantos se han diseñado en la historia del turismo colombiano). Hasta agotar existencia\n" +
                            "\n" +
                            "7. Visita a la Basílica del Señor de los Milagros de Buga\n" +
                            "\n" +
                            "8. Cóctel de bienvenida en los hoteles de Cali, Buga y Quindío\n" +
                            "\n" +
                            "9. Refrigerio en la ciudad de Buga"),

            Pelicula("SILVIA", "190000", "18 de Mayo 2017",
                    "https://media-cdn.tripadvisor.com/media/photo-s/0f/10/39/7b/silvia-cauca-pueblo-de.jpg",
                    "1. Transporte terrestre Cali – Silvia – Cali\n" +
                            "2. Alojamiento la noche del día uno (sábado – lunes o miércoles) en la Casa Turística de Silvia con base en acomodación Doble – Triple o Cuádruple (2–3 o 4) personas por habitación.\n" +
                            "3. Toda la alimentación (tres comidas diarias) desde el refrigerio de bienvenida hasta el almuerzo del día dos (domingo – martes o jueves) .\n" +
                            "4. Noche musical de integración (si hay hospedados en la casa más de 15 quince personas).\n" +
                            "5. Guía de turismo desde Cali, si el grupo de turistas es superior a veinte personas.\n" +
                            "6. Visita a la casa museo con las mejores artesanías de Colombia y el mundo."),

            Pelicula("LLANOS ORIENTALES", "650000", "15 ENERO 2017",
                    "https://viajesvillanuevaltda.com/wp-content/uploads/2015/05/llanos-orientales-viajes-villanueva1.png",
                    "1. Alojamiento por tres noches cuatro días en el HOTEL CAMPESTRE CAMPANARIO 5 ESTRELLAS con base en acomodación doble o triple.\n" +
                            "2. Alimentación claramente descrita en el programa.\n" +
                            "3. Transporte terrestre desde Bogotá para realizar el itinerario descrito\n" +
                            "4. Traslado y tiquete de ingreso al Bioparque los Ocarros.\n" +
                            "5. Guía Acompañante de turismo para visitar los grandes atractivos que nos ofrecen los Llanos Orientales.\n" +
                            "6. Visita a la ciudad de Villavicencio y los Municipios de Guamal, Acacias, Restrepo y Cumaral\n" +
                            "7. Atención especial a quienes celebren su cumpleaños y/o aniversario de bodas\n" +
                            "8. Visita a la Hacienda Marsella para disfrutar de un paseo en Buggy y admirar la flora y fauna de los Llanos Orientales\n" +
                            "9. Visita al hermoso complejo turístico LA CATIRA\n" +
                            "10.Traslado e ingreso al Parque Malocas.\n" +
                            "11. Citytour en chiva con demostración de joropo.\n" +
                            "12.Tarjeta de asistencia médica"),

            Pelicula("BOYACÁ ESPECIAL ILUMINACIONES", "490000", "20 feb 2017",
                    "https://cuponassets.cuponatic-latam.com/backendCo/uploads/imagenes_descuentos/111850/e7a5a7d7cb1c62763b24130ba3c5635ad41de530.XL2.jpg",
                    "• Alojamiento por 2 noches en Paipa con base en acomodación doble o triple.\n" +
                            "• Alimentación claramente descrita en el programa.\n" +
                            "• Transporte terrestre en bus para realizar el itinerario descrito en este programa.\n" +
                            "• Visita al Monumento del Puente de Boyacá, Pantano de Vargas y a los municipios de Nobsa, Sogamoso,\n" +
                            "Pueblito Boyacense, Corrales, Villa de Leyva, La Catedral de Tunja y la Catedral de Chiquinquirá.\n" +
                            "• Visita y recorrido en lancha por el Lago Tota.\n" +
                            "• Ingreso al Parque Acuático termal en Paipa.\n" +
                            "• Atención especial para quienes celebren su cumpleaños o aniversario dentro de la excursión.\n" +
                            "• Guía acompañante especializada desde Bogotá durante todo el recorrido."),

            Pelicula("VALLECAUCANIDAD", "95000", "13 de Julio 2017",
                    "http://cumbreap2017.cancilleria.gov.co/sites/default/files/inline-images/ErmitaBulevarCalil78FinalA.jpg",
                    "1. Transporte terrestre para realizar el itinerario de este programa.\n" +
                            "2. Tiquete de ingreso a la Hacienda El Paraíso.\n" +
                            "3. Museo de la Caña de Azúcar\n" +
                            "4. Guías que acompañarán a los turistas durante todo el recorrido.\n" +
                            "5. Tiquete de ingreso al museo Aéreo Fénix.\n" +
                            "6. Espectacular Sancocho de Gallina vallecaucano servido en las instalaciones del hermoso Complejo\n" +
                            "Turístico Siga la Vaca.\n" +
                            "7. Utilización de los servicios que ofrece el Complejo Turístico Siga la Vaca como las piscinas, canchas\n" +
                            "deportivas y juegos para niños entre otros.\n" +
                            "8. Rifas durante el viaje de varios ejemplares del libro: “Turismo, un sueño por la Paz” del señor Belisario\n" +
                            "Marín Montes responsable de este programa, (hasta agotar existencia).\n" +
                            "9. Celebración especial de cumpleaños, aniversario de bodas o fechas especiales.")

    )

}
