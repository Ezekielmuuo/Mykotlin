fun main() {
    var firstname = "Ezekiel"
    var lastname = "Muutua"

    println(firstname)


    //Acessing an element in a string
    println(firstname[1])

    //modifying a string
    println(lastname.uppercase())
    println(firstname.lowercase())

    //String concatenation - joining strings
    println(firstname+lastname)
    println( firstname + "" + lastname)

    println(firstname.plus(lastname))

        //string interpollation
    println("My firstname is" +firstname)

    println("My firstname is $firstname" )

    var num1 = 67
    var num2 = 56

    println("The sum of $num1 and $num2 is " + (num1+num2))



}