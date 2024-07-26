fun main() {

    var languages = arrayOf("Kotlin","Python","Java")

    println(languages[1])

    //Re assigning an element in an array
    languages[1] ="c++"
    println(languages[1])

    //Adding a nae element in an array
    var all = languages.plus("php")
    for (lang in all){
        println(lang)
    }
    //size of ana array
    println(all.size)





}