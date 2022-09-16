//Challenges
/*
    Challenge 1: Repeating yourself

        Your first challenge is to write a function that will run a given lambda a given
    number of times.
    Declare the function like so:

    fun repeatTask(times: Int, task: () -> Unit)

    The function should run the task lambda times number of times.
    Use this function to print "Kotlin Apprentice is a great book!" 10 times.

    Challenge 2: Lambda sums

        In this challenge, you’re going to write a function that you can reuse to create
    different mathematical sums.
    Declare the function like so:

    fun mathSum(length: Int, series: (Int) -> Int) -> Int

    The first parameter, length, defines the number of values to sum. The second
    parameter, series, is a lambda that can be used to generate a series of values.
    series should have a parameter that is the position of the value in the series and
    return the value at that position.
    mathSum should calculate length number of values, starting at position 1, and return
    their sum.

        Use the function to find the sum of the first 10 square numbers, which equals 385.
    Then use the function to find the sum of the first 10 Fibonacci numbers, which
    equals 143.
    For the Fibonacci numbers, you can use the function you wrote in the challenges of
    the functions chapter — or grab it from the solutions if you’re unsure what you’ve
    done is correct.

    Challenge 3: Functional ratings

        In this final challenge, you will have a list of app names with associated ratings
    they’ve been given. Note — these are all fictional apps!
    Create the data map like so:
    val appRatings = mapOf(
     "Calendar Pro" to arrayOf(1, 5, 5, 4, 2, 1, 5, 4),
     "The Messenger" to arrayOf(5, 4, 2, 5, 4, 1, 1, 2),
     "Socialise" to arrayOf(2, 1, 2, 2, 1, 2, 4, 2)
    )

        First, create a map called averageRatings which will contain a mapping of app
    names to average ratings. Use forEach to iterate through the appRatings map, then
    use reduce to calculate the average rating and store this rating in the
    averageRatings map.

        Finally, use filter and map chained together to get a list of the app names whose
    average rating is greater than 3.
*/

fun main()
{
    val myTask = {
        println("Kotlin apprentice is a great book!")
    }

    repeatTask(10, myTask)

    println(mathSum(10){it * it})   //385

    println(mathSum(10, ::fibonacci)) // > 143

    val appRatings = mapOf(
        "Calendar Pro" to arrayOf(1, 5, 5, 4, 2, 1, 5, 4),
        "The Messenger" to arrayOf(5, 4, 2, 5, 4, 1, 1, 2),
        "Socialise" to arrayOf(2, 1, 2, 2, 1, 2, 4, 2)
    )

    val averageRatings = mutableMapOf<String, Double>()
    appRatings.forEach{
        val total = it.value.reduce(Int::plus)  //+ is a function too!
        averageRatings[it.key] = total.toDouble() / it.value.size
    }

    println(averageRatings) // > {Calendar Pro=3.375, The Messenger=3.0, Socialise=2.0}

    val goodApps = averageRatings.filter {
        it.value > 3
    }.map {
        it.key
    }
    println(goodApps) // > [Calendar Pro]
}

fun repeatTask(times: Int, task:() -> Unit)
{
    for (i in 1..times)
    {
        task()
    }

}

fun mathSum(length: Int, series: (Int) -> Int): Int
{
    var result = 0
    for(i in 1..length)
    {
        result += series(i)
    }
    return result
}

//fun fibonacci(number: Int): Int {
//    if (number <= 0) {
//        return 0
//    }
//    if (number == 1 || number == 2) {
//        return 1
//    }
//    return {fibonacci(number - 1) + fibonacci(number - 2)}
//}

