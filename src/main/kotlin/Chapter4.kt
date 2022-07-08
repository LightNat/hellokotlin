fun main()
{
    val yes: Boolean = true
    val no: Boolean = false

    //same as
    //val yes = true
    //val no = false

    val doesOneEqualTwo = (1 == 2)
    println(doesOneEqualTwo)    //false

    val doesOneNotEqualTwo = (1 != 2)
    println(doesOneNotEqualTwo)     //true

    val alsoTrue = !(1 == 2)
    println(alsoTrue)       //true

    val isOneGreaterThanTwo = (1 > 2)   //false
    val isOneLessThanTwo = (1 < 2)      //true
    println("isOneGreaterThanTwo = $isOneGreaterThanTwo and isOneLessThanTwo = $isOneLessThanTwo")

    val and = true && true      //true
    println(and)
}