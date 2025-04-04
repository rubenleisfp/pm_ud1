package teoria.colecciones

fun main() {
    val userSettings: Map<String, String> = mapOf(
        "name" to "Catrina",
        "language" to "Español",
        "logo" to "logo.png",
        "website" to "www.site.com"
    )

    println("$userSettings")
    // {name=Catrina, language=Español, logo=logo.png, website=www.site.com}

    val booksMap = mutableMapOf(
        "Sinsajo" to 2010,
        "Yo, Robot" to 1950,
        "Crimen y castigo" to 1935,
        "Cien años de soledad" to 1991
    )
    booksMap.put("La máquina del tiempo", 1890)
    booksMap["La máquina del tiempo"] = 1895

    println(booksMap)

    for ((operation, symbol) in booksMap) {
        println("$operation -> $symbol")
    }
}