fun main()
{
    var integer: Int = 100
    var decimal: Double = 12.5
    integer = decimal.toInt()
    println(integer)

    val hourlyRate: Double = 19.5
    val hoursWorked: Int = 10
    val totalCost: Double = hourlyRate * hoursWorked.toDouble()
    println(totalCost)

    //press (CTRL + SHIFT + P)---------------
                                          //|
    val typeInferredInt = 42    //<---------|
    val typeInferredDouble = 3.14159    //<-|

    val wantADouble = 3
    val actuallyDouble = 3.toDouble()
    //val actuallyDouble: Double = 3.0

    //Mini exercise A
    val age1 = 42
    val age2 = 21
    val avg1 = (age1.toDouble() + age2.toDouble()) / 2
    println(avg1)


    val characterA: Char = 'a'
    val stringDog: String = "Dog"

    //Concatenation
    var message = "Hello" + " my name is "
    val name = "Joe"
    message += name //"Hello my name is Joe"
    println(message)

    val exclamationMark: Char = '!'
    message += exclamationMark  //"Hello my name is Joe!"
    println(message)

    //String Templates / String Interpolation
    var message2 = "Hello my name is $name!" // "Hello my name is Joe!"
    println(message2)

    val oneThird = 1.0 / 3.0
    val oneThirdLongString = "One third is $oneThird as a decimal."
    println(oneThirdLongString)

    //Multi-line strings
    val bigString = """|
        |You can have a string
        |lines contains multiple
        |lines
        |by
        |doing this.
    """.trimMargin()
    println(bigString)

    //Mini exercise B
    val firstname = "Jonathan"
    val lastname = "Gubot"
    val fullname = firstname + " " + lastname
    val myDetails = "Hello, my name is $fullname."
    println(myDetails)

    //Pairs and Triples
    //Pairs
    val coordinates: Pair<Int, Int> = Pair(1, 2)
    val coordinatesInferred = Pair(2, 3)
    val coordinatesWithTwo = 2 to 3 //more concise implementation
    val coordinatesDoubles = Pair(2.1, 3.5) // Inferred to be of type Pair<Double, Double>
    val coordinatesMixed = Pair(2.1, 3) // Inferred to be of type Pair<Double, Int>

    //Accessing data inside a pair
    val x1 = coordinates.first
    val y1 = coordinates.second
    println("Pair($x1, $y1)")
    val (y, x) = coordinates
    println("($x, $y)")

    //Triples
    val coordinates3D = Triple(2, 3, 1)
    val (x3, y3, z3) = coordinates3D
    println("$x3, $y3, $z3")

    val x3A = coordinates3D.first
    val y3A = coordinates3D.second
    val z3A = coordinates3D.third
    println("$x3A, $y3A, $z3A")

    val (x4, y4, _) = coordinates3D //ignore a certain element of a Pair or Triple

    //Mini exercise C
    val tripleDate = Triple(9,20,1999)
    val month = tripleDate.first
    val day = tripleDate.second
    val year = tripleDate.third

    val (monthDate, _, yearDate) = tripleDate

    val updatedDate = Pair(month, year)

    println("$month, $day, $year")
    println(updatedDate)

}
//Mini exercises A
/*
    1. Create a constant called age1 and set it equal to 42. Create a constant called age2
        and set it equal to 21. Check using Control+Shift+P that the type for both has
        been inferred correctly as Int.
    2. Create a constant called avg1 and set it equal to the average of age1 and age2
        using the naive operation (age1 + age2) / 2. Use Control+Shift+P to check the
        type and check the result of avg1. Why is it wrong?
    3. Correct the mistake in the above exercise by converting age1 and age2 to type
        Double in the formula. Use Control+Shift+P to check the type and check the
        result of avg1. Why is it now correct?
*/

//Mini exercise B
/*
    1. Create a string constant called firstName and initialize it to your first name.
        Also create a string constant called lastName and initialize it to your last name.
    2. Create a string constant called fullName by adding the firstName and lastName
        constants together, separated by a space.
    3. Using string templates, create a string constant called myDetails that uses the
        fullName constant to create a string introducing yourself. For example, it could
        read: "Hello, my name is Joe Howard.".
*/

//Mini exercise C
/*
    1. Declare a constant Triple that contains three Int values. Use this to represent a
        date (month, day, year).
    2. Extract the values in the triple into three constants named month, day and year.
    3. In one line, read the month and year values into two constants. You’ll need to
        employ the underscore to ignore the day.
    4. Since the values inside Pairs and Triples cannot be modified, you will need to
        extract the values from them, make any modifications you want, and then create
        a new Pair or Triple. Using the values you extracted in step three, modify the
        month value and create a new Pair containing the modified month along with
        the unmodified year.
*/