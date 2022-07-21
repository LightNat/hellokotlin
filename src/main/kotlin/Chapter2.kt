//Constants
const val myNumber: Int = 10

const val myAge: Int = 22   //Mini exercise(1)
const val testNumber: Int = 21  //Mini exercise(3 part A)
const val evenOdd = testNumber % 2  //Mini exercise(3 part B)

fun main() {

    //Decimal Numbers
    println(22 / 7)

    //Using format specifier
    println("%.2f".format(22.0 / 7.0))

    println(350 / 5 + 2)


    //val is constant and cannot be reassigned
    println(myNumber)
    //myNumber = 20

    //Variables
    var variableNumber: Int = 20
    variableNumber = 22
    println(variableNumber)

    //Increment (& Decrement)
    var counter = 0
    counter++   //increments the value by 1
    counter += 1    //increments the value by 1
    println(counter)

    var averageAge: Double = 22.0/30.0  //Mini exercise(2)
    println(averageAge)

    println(evenOdd)

    var answer = 0
    answer += 1
    answer += 10
    answer shl 3
    println(answer) //Mini exercise(4)
}

    //Mini exercises
    /*
    1. Declare a constant of type Int called myAge and set it to your age.
    2. Declare a variable of type Double called averageAge. Initially, set it to your own
        age. Then, set it to the average of your age and the age of 30.
    3. Create a constant called testNumber and initialize it with whatever integer you’d
        like. Next, create another constant called evenOdd and set it equal to testNumber
        modulo 2. Now change testNumber to various numbers. What do you notice
        about evenOdd?
    4. Create a variable called answer and initialize it with the value 0. Increment it by
        1. Add 10 to it. Multiply it by 10. Then, shift it to the right by 3. After all of these
        operations, what’s the answer?
    */
