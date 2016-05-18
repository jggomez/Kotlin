package co.gdgcali.test

/**
 * Created by jggomezt on 17/05/2016.
 * Juan Guillermo Gómez
 * @jggomezt
 * GDG - Cali
 */
// Creamos una clase sin metodo constructor
class BPClient {

    // Propiedades
    var lstClient: MutableList<Client>

    // Se ejecuta cuando se inicializa la clase
    init {
        lstClient = mutableListOf()
    }

    // Expresión Lambda
    val isAdult: (client: Client) -> Boolean = { client -> client.age > 18 }

    fun howManyAdults(lstClients: MutableList<Client>, f: (Client) -> Boolean): Int {
        var contAdults = 0

        for (client in lstClients) {
            if (f(client)) {
                contAdults++
            }
        }

        return contAdults;
    }

    // Obtiene el tipo de persona retornando un String
    fun typeOfPerson(edad: Int): String {

        // Es similar al case-when.
        val typePerson = when (edad) {
            0 -> "Recien Nacido"
            in 1..12 -> "Niño"
            in 13..19 -> "Adolescente"
            else -> "Adulto"
        }

        return typePerson
    }

    fun addClient(client: Client) {
        lstClient.add(client)
    }

    fun printAllClients() {
        // Usa la función extendida
        for (client in lstClient)
            client.printInfo()
    }

}