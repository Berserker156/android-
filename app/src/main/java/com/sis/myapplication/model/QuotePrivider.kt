package com.sis.myapplication.model

class QuotePrivider {

    companion object{

        fun random(): QuoteModel{
            val position = (frases.indices).random()
            return(frases[position])
        }

        private val frases = listOf<QuoteModel>(

            //frases que pusieron sus compañerpos
            QuoteModel("La vida es cruel" , "Moises"),
            QuoteModel("El laboratorio no sirve" , "Anonimo"),
            QuoteModel("Ella mo te ama" , "Jaime"),
            QuoteModel("Ella se fue con otro" , "chile"),
            QuoteModel("a que hora nos vamos" , "Moises"),
            QuoteModel("Nuestro Caminos se separan temporalmente para luego unirlos siendo mayores y mas maduros" , "Jaime Dario"),
            QuoteModel("Al profesor le gustan la Brithanys","Inty Sanchez"),
            QuoteModel("Le gusta planchar paletones","Inty Sanchez"),
            QuoteModel("No sueñes tu vida, vive tu sueño.", "Anónimo"),
            QuoteModel("Todos son ateos hasta navidad", "Pasquier")

        )
    }
}