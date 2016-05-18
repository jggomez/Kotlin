package co.gdgcali.test

/**
 * Created by jggomezt on 17/05/2016.
 */

public class Main {

    companion object {
        @JvmStatic fun main(args: Array<String>) {

            var client = Client("Juan Guillermo", "Gómez", 31, "juan.gomez01@gmail.com", "21/08/1984")

            var client2 = Client("Pedro", "Perez", 20, "pedro.perez@gmail.com", "21/08/1990")

            var client3 = Client("Maria Teresa", "Lopez", 40, "teresa.lopez@gmail.com", "21/08/1970")

            var objBPClient = BPClient()

            objBPClient.addClient(client);
            objBPClient.addClient(client2);
            objBPClient.addClient(client3);

            println("Imprimir Info de todos los clientes con metodo de extensión")
            objBPClient.printAllClients()

            println("La edad calculada del Cliente ${client.name} es ${client.calculateAge()}")

            println("El Cliente ${client2.name} es ${objBPClient.typeOfPerson(client2.age)}")

            println("Existen => { ${objBPClient.howManyAdults(objBPClient.lstClient, objBPClient.isAdult)} } Adultos")

        }
    }
}
