/*
    1. In the following for loop, what will be the value of sum, and how many iterations will happen?
        var sum = 0
        for(i in 0..5) {
            sum += i
        }

    2. In the while loop below, how many instances of “a” will there be in aLotOfAs?
        Hint: aLotOfAs.count tells you how many characters are in the string aLotOfAs.
            var aLotOfAs = ""
            while (aLotOfAs.length < 10) {
                    aLotOfAs += "a"
            }

    3. Consider the following when expression:
        when {
             x == y && y == z -> println("x = y = z")
             z == 0 -> println("On the x/y plane")
             y == 0 -> println("On the x/z plane")
             x == 0 -> println("On the y/z plane")
             else -> println("Nothing special")
        }

    What will this code print when coordinates is each of the following?
        val (x, y, z) = Triple(1, 5, 0)
        val (x, y, z) = Triple(2, 2, 2)
        val (x, y, z) = Triple(3, 0, 1)
        val (x, y, z) = Triple(3, 2, 5)
        val (x, y, z) = Triple(0, 2, 4)
    4. A closed range can never be empty. Why?

    5. Print a countdown from 10 to 0 without using downTo.

    6. Print 0.0, 0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9, 1.0.
*/

fun main()
{
    var sum = 0
    for(i in 0..5) {
        sum += i
        print("$sum ")  //15 is the value and 6 iterations
    }

    println("")
    var aLotOfAs = ""
    while (aLotOfAs.length < 10) {
        aLotOfAs += "a"
    }
    println("$aLotOfAs & ${aLotOfAs.count()} characters ${aLotOfAs.length}")

    //val (x, y, z) = Triple(1, 5, 0)
    //val (x, y, z) = Triple(2, 2, 2)
    //val (x, y, z) = Triple(3, 0, 1)
    //val (x, y, z) = Triple(3, 2, 5)
    val (x, y, z) = Triple(0, 2, 4)

    when {
        x == y && y == z -> println("x = y = z")
        z == 0 -> println("On the x/y plane")
        y == 0 -> println("On the x/z plane")
        x == 0 -> println("On the y/z plane")
        else -> println("Nothing special")
    }

    //Ranges must always increasing
    val halfOpenRange = 100 until 100 // empty
    val closedRange = 100..100   // contains the number 100

    println(halfOpenRange.isEmpty())
    println(closedRange.isEmpty())

    for(i in 0..10)
    {
        print("${10 - i} ")
    }
    println("") //to create a new line

    var value = 0.0
    repeat(10)
    {
        print("$value ")
        value += 0.1
    }


}