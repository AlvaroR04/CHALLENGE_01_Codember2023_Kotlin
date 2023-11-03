import java.io.File
import java.util.Scanner

fun main(args: Array<String>) {
    val lector = Scanner(File("message_01.txt"))
    var mensajeObtenido = ""

    val mensajes = mutableMapOf<String, Int>()

    while(lector.hasNext()) {
        mensajeObtenido += lector.nextLine().lowercase()
    }

    for(palabra in mensajeObtenido.split(" ")) {
        if(mensajes.containsKey(palabra)) {
            val valorActual = mensajes[palabra] ?: 0
            mensajes[palabra] = valorActual + 1
        } else {
            mensajes[palabra] = 1
        }
    }

    mensajes.forEach { (mensaje, apariciones) ->
        print("${mensaje}${apariciones}")
    }
}