package co.gdgcali.test

/**
 * Created by jggomezt on 17/05/2016.
 * Juan Guillermo Gómez
 * @jggomezt
 * GDG - Cali
 */
// Clase con método constructor principal
class Client(name: String, lastName: String, age: Int, email: String, dateBirthday: String) {

    // Propiedades
    var cellPhone: String = ""
    var name: String = ""
    var lastName: String = ""
    var age: Int = 0
    var email: String = ""
    var dateBirthday: String = ""

    init {
        this.name = name
        this.lastName = lastName
        this.age = age
        this.email = email
        this.dateBirthday = dateBirthday
    }

    // Sobrecarga de constructores
    constructor(name: String, lastName: String, age: Int, email: String, dateBirthday: String, cellPhone: String) :
    this(name, lastName, age, email, dateBirthday) {
        this.cellPhone = cellPhone;
    }

}