fun main()
{
    val yes: Boolean = true
    val no: Boolean = false

    println("""|
        |yes = $yes
        |no = $no
    """.trimMargin())

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

    val and = true && true
    println(and)        //true

    val or = true || false
    println(or)     //true

    val andTrue = 1 < 2 && 4 > 3
    val andFalse = 1 < 2 && 3 > 4
    val orTrue = 1 < 2 || 3 > 4
    val orFalse = 1 == 2 || 3 == 4
    println("""|
        |andtrue = $andTrue
        |andFalse = $andFalse
        |orTrue = $orTrue
        |orFalse = $orFalse
    """.trimMargin())

    val andOr = (1 < 2 && 3 > 4) || 1 < 4
    println(andOr)      //true
    /*
        (1 < 2 && 3 > 4) || 1 < 4
        (true && false) || true
        false || true
        true
    */
}