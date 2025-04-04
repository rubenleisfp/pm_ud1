package teoria.clases

import java.util.*

class Contact(var name: String) {
    var id: String


    init {
        id = UUID.randomUUID().toString()
    }


    constructor(id:String, name: String) : this(name){
        this.id = id
    }
}
