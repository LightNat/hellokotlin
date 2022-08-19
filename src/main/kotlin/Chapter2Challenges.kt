import java.lang.Math.PI
import java.lang.Math.sqrt

/*
    Before moving on, here are some challenges to test your knowledge of variables and constants.
    You can try the code in IntelliJ IDEA to check your answers. If you get stuck,
    check out the solutions included in the materials for this chapter.

    1. Declare a constant exercises with value 9 and a variable exercisesSolved with
        value 0. Increment this variable every time you solve an exercise (including this
        one).
    2. Given the following code:
            age = 16
            print(age)
            age = 30
            print(age)
        Declare age so that it compiles. Did you use var or val?
    3. Consider the following code:
            val a: Int = 46
            val b: Int = 10
        Work out what answer equals when you add the following lines of code:

            // 1
            val answer1: Int = (a * 100) + b
            // 2
            val answer2: Int = (a * 100) + (b * 100)
            // 3
            val answer3: Int = (a * 100) + (b / 10)
    4. Add parentheses to the following calculation. The parentheses should show the
        order in which the operations are performed and should not alter the result of
        the calculation.
            5 * 3 - 4 / 2 * 2
    5. Declare two constants a and b of type Double and assign both a value. Calculate
        the average of a and b and store the result in a constant named average.
    6. A temperature expressed in °C can be converted to °F by multiplying by 1.8 then
        incrementing by 32. In this challenge, do the reverse: convert a temperature from
        °F to °C. Declare a constant named fahrenheit of type Double and assign it a
        value. Calculate the corresponding temperature in °C and store the result in a
        constant named celcius.
    7. Suppose the squares on a chessboard are numbered left to right, top to bottom,
        with 0 being the top-left square and 63 being the bottom-right square. Rows are
        numbered top to bottom, 0 to 7. Columns are numbered left to right, 0 to 7.
        Declare a constant position and assign it a value between 0 and 63. Calculate
        the corresponding row and column numbers and store the results in constants
        named row and column.
    8. A circle is made up of 2휋 radians, corresponding with 360 degrees. Declare a
        constant degrees of type Double and assign it an initial value. Calculate the
        corresponding angle in radians and store the result in a constant named
        radians.
    9. Declare four constants named x1, y1, x2 and y2 of type Double. These constants
        represent the two-dimensional coordinates of two points. Calculate the distance
        between these two points and store the result in a constant named distance.
*/

fun main()
{

    val exercises: Int = 9
    var exercisesSolved: Int = 0
    exercisesSolved += 1

    var age: Int
    age = 16
    println(age)
    age = 30
    println(age)
    exercisesSolved += 1

    val a: Int = 46
    val b: Int = 10

    // 1
    val answer1: Int = (a * 100) + b
    // 2
    val answer2: Int = (a * 100) + (b * 100)
    // 3
    val answer3: Int = (a * 100) + (b / 10)

    println(answer1)
    println(answer2)
    println(answer3)
    exercisesSolved += 1

    (5 * 3) - ((4 / 2) * 2)
    exercisesSolved += 1

    val aDouble: Double = 21.0
    var bDouble: Double = 22.0
    var doubleAverage = (aDouble + bDouble) / 2
    println(doubleAverage)
    exercisesSolved += 1

    val fahrenheit: Double = 190.0
    val celcius: Double = (fahrenheit - 32) / 1.8
    println(celcius)
    exercisesSolved += 1

    val position: Int = 54
    val row: Int = position / 8
    val column: Int = position % 8
    exercisesSolved += 1

    val degrees: Double = 360.0
    val radians: Double = (degrees / 180) * PI
    println(radians)
    exercisesSolved += 1

    val x1: Double = 1.0
    val y1: Double = 1.0
    val x2: Double = 3.0
    val y2: Double = 3.0
    val dx: Double = x2 - x1
    val dy: Double = y2 - y1
    val distance: Double = sqrt(dx * dx + dy * dy)
    println(distance)
    exercisesSolved += 1

}