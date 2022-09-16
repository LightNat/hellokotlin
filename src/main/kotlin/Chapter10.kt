import java.lang.NullPointerException

fun main()
{
    //Lambda basics
    var multiplyLambda:(Int, Int) -> Int

    multiplyLambda = {a: Int, b: Int -> Int
        a*b
    }

    val lambdaResult = multiplyLambda(4, 2)     //8
    println(lambdaResult)


    //Shorthand syntax
    multiplyLambda = {a, b ->
        a*b
    }

    //it keyword
    var doubleLambda = {a: Int ->
        2*a
    }

    doubleLambda = {
        2*it
    }

    val square: (Int) -> Int = {
        it*it
    }

    val addLambda = {a: Int, b: Int -> Int
        a+b
    }

    //Lambdas as arguments
    operateOnNumbers(4, 2, operation = addLambda)   //6

    //:: symbol is needed to use a function in a lambda
    operateOnNumbers(4, 2, operation = ::addFunction)   //8

    operateOnNumbers(4, 2, operation = Int::plus)   //6

    //Lambdas with no meaningful return value
    var unitLambda: () -> Unit = {
        println("Kotlin Apprentice is awesome!")
    }

    unitLambda()

//    var nothingLambda: () -> Nothing = {
//        throw NullPointerException()
//    }
//    nothingLambda()

    //Capturing from enclosing scope
    var counter = 0

    val incrementCounter = {
        counter += 1
    }

    incrementCounter()  //1
    incrementCounter()  //2
    incrementCounter()  //3
    incrementCounter()  //4
    incrementCounter()  //5

    fun countingLambda(): () -> Int{
        var counter = 0
        val incrementCounter: () -> Int = {
            counter += 1
            counter
        }
        return incrementCounter
    }

    val counter1 = countingLambda()
    val counter2 = countingLambda()

    println(counter1())   //1
    println(counter2())   //1
    println(counter1())   //2
    println(counter1())   //3
    println(counter2())   //2

    //Custom sorting with lambdas
    val names = arrayOf("ZZZZZZ", "BB", "A", "CCCC", "EEEEEEE")
    println(names.sorted())

    val namesByLength = names.sortedWith(compareBy{
        -it.length  //- symbol to reverse
    })

    println(namesByLength)

    //Iterating over collections with lambdas
    val values = listOf(1, 2, 3, 4, 5, 6)
    values.forEach{
        println("$it: ${it * it}")
    }

    //same result
    for (i in values)
    {
        println("$i: ${i * i}")
    }

    var prices = listOf(1.5, 10.0, 4.99, 2.30, 8.19)

    val largePrices = prices.filter {
        it > 5.0
    }
    println(largePrices)

    //making discounts for all items by 10%
    val salePrices = prices.map {
        it * 0.9
    }
    println(salePrices)

    //changing the type of the input
    val userInput = arrayOf("0", "11", "haha", "42")
    val numbers = userInput.map {
        it.toIntOrNull()
    }
    println(numbers)

    //to get rid of null converted values
    val numbers2 = userInput.mapNotNull {
        it.toIntOrNull()
    }
    println(numbers2)

    val stock = mapOf(
        1.5 to 5,
        10.0 to 2,
        4.99 to 20,
        2.30 to 5,
        8.19 to 30
    )

    var stockSum = 0.0
    stock.forEach{
        stockSum += it.key * it.value
    }

    var sum = prices.fold(0.0){a, b ->
        a+b
    }

    println(sum)

    sum = prices.reduce { a, b ->
        a + b
    }
    println(sum) // > 26.980000000000004


    println("stockSum is having the value of $stockSum")

    var stockSum2 = 0.0
    //try this using for loop
    for((key, value ) in stock)
    {
        stockSum2 += key*value
    }
    println("stockSum2 is also having the value of $stockSum2")

    //Mini exercises A
    val nameList = listOf("Nat", "Nathan", "Jonathan", "Jonasan")
    var myNames = nameList.fold(""){a, b ->
        a+b
    }
    println(myNames)

    var filterName = nameList.filter {
        it.length > 4
    }

    println(filterName)

    val namesAndAges = mapOf(
        "Jester" to 27,
        "Jonathan" to 22,
        "Clyde" to 20,
        "Mark Anthony" to 23
    )

    var notLegalAge = namesAndAges.filter {
        it.value <21
    }.map {
        it.key
    }
    println(notLegalAge)    //Clyde

    var legalAge = namesAndAges.filter {
        it.value > 21
    }
    println(legalAge)   //Jester = 27, Jonathan = 22, Mark Anthony = 23

}

//Lambdas as arguments
fun operateOnNumbers(a: Int, b: Int, operation: (Int, Int) -> Int): Int
{
    val result = operation(a, b)
    println(result)
    return result
}

fun addFunction(a: Int, b: Int) = a*b

//Mini Exercise A
/*
    1. Create a constant list called nameList which contains some names as strings.
    Any names will do — make sure there’s more than three. Now use fold to create a
    string which is the concatenation of each name in the list.

    2. Using the same nameList list, first filter the list to contain only names which
    have more than four characters in them, and then create the same concatenation
    of names as in the above exercise.

    3. Create a constant map called namesAndAges which contains some names as
    strings mapped to ages as integers. Now use filter to create a map containing
    only people under the age of 18.

    4. Using the same namesAndAges map, filter out the adults (those 18 or older) and
    then use map to convert to a list containing just the names (i.e., drop the ages).
*/