fun main()
{
    printMyName()
    printMultipleOfFive(10)
    printMultipleOf(4, 2)
    printMultipleOfDefaultValue(multiplier = 4)     //parameter named arguments
    //multiply(6, 6)

    //printing the value inside multiply function
    println("6 * 6 = ${multiply(6,6)}")

    //Assigning a constant that will hold the values of pair of multipleAnd Divide function
    val (product, quotient) = multiplyAndDivide(4, 2)   //that's because multipleAndDivide function is a Pair
    println(product)    //4 * 2 = 8
    println(quotient)   //4 / 2 = 2
    //or
    println(multiplyAndDivide(4, 2))

    println(multiplyInferred(9, 9))     //9 * 9 = 81

    incrementAndPrint(22)

    //incremented function parameter value
    incrementAndPrintSuccess(22)

    //Overloading
    getValue(5)
    getValue("nathan")

    //Mini exercise
    printFullName(firstName = "Jonathan", lastName = "Gubot")
    println(calculateFullName("Jonathan", "Gubot"))

    //function as variables
    var function = :: add
    println(function(4, 2))     //6

    function = ::subtract
    println(function(4, 2))     //2

    printResult(::add,4, 2)     //6
}

//Function Basics
fun printMyName()
{
    println("My name is Jonathan Gubot")
}


//Function Parameters
fun printMultipleOfFive(value: Int)
{
    println("$value * 5 = ${value * 5}")
}

fun printMultipleOf(multiplier: Int, addValue: Int)
{
    println("$multiplier * $addValue = ${multiplier * addValue}")
}


//Parameter default values
fun printMultipleOfDefaultValue(multiplier: Int, value: Int = 1)
{
    println("$multiplier * $value = ${multiplier * value}")
}

//Return Value
fun multiply(number: Int, multiplier: Int):Int
{
    return  number * multiplier
}

//Return Values using pair
fun multiplyAndDivide(number: Int, factor: Int): Pair<Int, Int>
{
    return Pair(number * factor, number / factor)
}

//Simplify functions with parameters(return value)
fun multiplyInferred(number: Int, multiplier: Int) = number * multiplier

//Parameters as values
fun incrementAndPrint(value: Int)
{
    //value += 1  //value cannot be reassigned, that's because parameter value is a constant
    println(value)
}

fun incrementAndPrintSuccess(value: Int)
{
    val newValue = value + 1
    println(newValue)
}

//Overloading
fun getValue(value: Int): Int
{
    return value + 1
}
fun getValue(value: String): String
{
    return "The value is $value"
}

//Mini exercise
fun printFullName(firstName: String, lastName: String)
{
    println(firstName + " " + lastName)
}

fun calculateFullName(firstName: String, lastName: String): Pair<String, String>
{
    val fullName = "$firstName $lastName"
    return Pair(fullName, fullName.length.toString())
}

//Functions as variables
fun add(a: Int, b: Int): Int
{
    return a + b
}

fun subtract(a: Int, b: Int): Int
{
    return a - b
}

fun printResult(function: (Int, Int) -> Int, a: Int, b: Int)
{
    val result = function(a, b)     //function is a function that is inside printResult function
    print(result)
}

//Land of No Return
//fun noReturn(): Nothing
//{
//
//}

fun infiniteLoop():Nothing
{
    while (true)
    {

    }
}

//Mini exercise
/*
    1. Write a function named printFullName that takes two strings called firstName
        and lastName. The function should print out the full name defined as firstName
        + " " + lastName. Use it to print out your own full name.

    2. Call printFullName using named arguments.

    3. Write a function named calculateFullName that returns the full name as a string.
        Use it to store your own full name in a constant.

    4. Change calculateFullName to return a Pair containing both the full name and
        the length of the name. You can find a string’s length by using the length
        property. Use this function to determine the length of your own full name.
*/