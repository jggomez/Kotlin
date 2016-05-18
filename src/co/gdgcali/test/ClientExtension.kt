package co.gdgcali.test

/**
 * Created by jggomezt on 17/05/2016.
 * Juan Guillermo Gómez
 * Funciones extendidas de Client
 * @jggomezt
 * GDG - Cali
 */

// Funciones de expresión sencilla y extendida para la clase Cliente
fun Client.printInfo() = println("My Name is ${this.name} and my email is ${this.email}")

// Función extendida
fun Client.calculateAge(): Int? {
    try {
        var lstBirthdaySplit: List<String> = this.dateBirthday.split("/")
        var aho : Int = lstBirthdaySplit[2].trim().toInt()
        if(lstBirthdaySplit.size > 0) {
            var ageCal = (2016 - aho)
            return ageCal
        }
    } catch(e: Exception) {
        println(e.toString())
    }

    return null;
}
