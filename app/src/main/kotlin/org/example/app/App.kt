package org.example.app

class App(
    private var dia: Int=0,
    private var mes: Int=0,
    private var ano: Int=0) {
    fun get(): String {
            return "Hello World!"
        }
    fun mostrar(): String{
        return("Fecha(${dia}, ${mes}, ${ano})")
    }
}