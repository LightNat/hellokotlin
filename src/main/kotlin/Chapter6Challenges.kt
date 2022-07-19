import kotlin.math.sqrt

//  Challenges
/*
    Challenge 1: It’s prime time
    When acquainting yourself with a programming language, a good exercise to do is
    write a function to determine whether or not a number is prime. That’s your first
    challenge.
    First, write the following function:
    fun isNumberDivisible(number: Int, divisor: Int): Boolean
    You’ll use this to determine if one number is divisible by another. It should return
    true when number is divisible by divisor.
    Hint: You can use the modulo (%) operator to help you out here.
    Next, write the main function:
    fun isPrime(number: Int): Boolean
    This should return true if number is prime, and false otherwise. A number is prime
    if it’s only divisible by 1 and itself. You should loop through the numbers from 1 to
    the number and find the number’s divisors.
    If it has any divisors other than 1 and itself, then the number isn’t prime. You’ll need
    to use the isNumberDivisible() function you wrote earlier.
    Use this function to check the following cases:
    isPrime(6) // false
    isPrime(13) // true
    isPrime(8893) // true
    Hint 1: Numbers less than 0 should not be considered prime. Check for this case at
    the start of the function and return early if the number is less than 0.
    Hint 2: Use a for loop to find divisors. If you start at 2 and end before the number
    itself, then as soon as you find a divisor, you can return false.
    Hint 3: If you want to get really clever, you can simply loop from 2 until you reach
    the square root of number, rather than going all the way up to number itself. I’ll leave
    it as an exercise for you to figure out why. It may help to think of the number 16,
    whose square root is 4. The divisors of 16 are 1, 2, 4, 8 and 16.
*/
/*
    Challenge 2: Recursive functions
    In this challenge, you’re going to see what happens when a function calls itself, a
    behavior called recursion. This may sound unusual, but it can be quite useful.
    You’re going to write a function that computes a value from the Fibonacci
    sequence. Any value in the sequence is the sum of the previous two values. The
    sequence is defined such that the first two values equal 1. That is, fibonacci(1) =
    1 and fibonacci(2) = 1.
    Write your function using the following declaration:
    fun fibonacci(number: Int): Int
    Then, verify you’ve written the function correctly by executing it with the following
    numbers:
    fibonacci(1) // = 1
    fibonacci(2) // = 1
    fibonacci(3) // = 2
    fibonacci(4) // = 3
    fibonacci(5) // = 5
    fibonacci(6) // = 8
    fibonacci(7) // = 13
    fibonacci(10) // = 55
    Hint 1: For values of number less than 0, you should return 0.
    Hint 2: To start the sequence, hard-code a return value of 1 when number equals 1 or
    2.
    Hint 3: For any other value, you’ll need to return the sum of calling fibonacci with
    number - 1 and number - 2.
    Note: This way of calculating the Fibonacci numbers is not terribly efficient.
    One technique to improve the performance is called memoization, which
    stores the results of previous calculations and reuses them when possible.
*/

fun main()
{
    println( isNumberDivisible(6, 3))
    println(isPrime(6))      // false
    println(isPrime(13))     // true
    println(isPrime(8893))   // true
    println(isPrime(19))   // true

    println(fibonacci(1))   // = 1
    println(fibonacci(2)) // = 1
    println(fibonacci(3)) // = 2
    println(fibonacci(4)) // = 3
    println(fibonacci(5)) // = 5
    println(fibonacci(6)) // = 8
    println(fibonacci(7)) // = 13
    println(fibonacci(10)) // = 55
}

fun isNumberDivisible(number: Int, Divisor: Int):Boolean
{
    return number % Divisor == 0
}

fun isPrime(number: Int): Boolean
{
    if(number < 0)
    {
        return false
    }
    if(number <= 3)
    {
        true
    }

    val doubleNumber = number.toDouble()
    val root = (sqrt(doubleNumber)).toInt()

    for(divisor in 2..root)
    {
        if(isNumberDivisible(number, divisor))
        {
            return false
        }
    }

    return true
}
fun fibonacci(number: Int): Int
{
    if(number < 0)
    {
        return 0
    }

    if(number == 1 || number == 2)
    {
        return 1
    }
    return fibonacci(number - 1) + fibonacci(number - 2)
}