import kotlin.math.sqrt

fun main()
{
    //Range
    val closedRange = 0 until 5
    println(closedRange)    //(0, 1, 2, 3, 4, 5)

    val halfOpenRange = 0 until 5   //(0, 1, 2, 3, 4)

    //using downTo in Range
    val decreasingRange = 5 downTo 0



    //Range using for loop
    //for loop

/*
    for(/*VARIABLE*/ in /*RANGE*/)
    {
        /*Loop Code*/
    }
*/

    print("Print 1 to 5: ")
    for(closedRange in 0..5){
        print("$closedRange ")  //prints (0, 1, 2, 3, 4, 5)
    }

    println("") //for new line
    print("Print 5 to 1: ")
    for(i in decreasingRange)
    {
        print("$i ") //prints (5, 4, 3, 2, 1, 0)
    }
    println("") //to create a new line


    val count = 10
    var sum = 0
    for(i in 1..count)
    {
        sum+=1
    }
    println("The sum is: $sum")

    //Triange numbers
    var sum2 = 0
    for(i in 1..count)
    {
        sum2+=i
    }
    println("The sum if it is added to variable i inside the loop: $sum2")

//    Here are the values of the constant i and variable sum for each iteration:
//    • Start of iteration 1: i = 1, sum = 0
//    • Start of iteration 2: i = 2, sum = 1
//    • Start of iteration 3: i = 3, sum = 3
//    • Start of iteration 4: i = 4, sum = 6
//    • Start of iteration 5: i = 5, sum = 10
//    • Start of iteration 6: i = 6, sum = 15
//    • Start of iteration 7: i = 7, sum = 21
//    • Start of iteration 8: i = 8, sum = 28
//    • Start of iteration 9: i = 9, sum = 36
//    • Start of iteration 10: i = 10, sum = 45
//    • After iteration 10: sum = 55

    //Repeat Loops
    sum = 1
    var lastSum = 0
    var addOne = 0
    repeat(10)

    {
        val temp = sum
        sum += lastSum
        lastSum = temp
        addOne += 1
        print("$addOne ")
    }

    //Using step in for loops
    println("") //to create a new line
    var mySum = 0
    sum = 0
    for(i in 1..count step 2)   //count = 10
    {       //step is used to skip after counting 2
        sum += i
        mySum = i
        print("$i ")        //1, 3, 5, 7, 9

                            //1 + 3 = 4, 4 + 5 = 9, 9 + 7 = 16, 16 + 9 = 25
        //print("$sum ")    //1 4 9 16 25
    }

    println("\n$mySum ")    //9
    println("$sum")         //25

    //using downTo and Step in for loops
    sum = 0
    mySum = 0
    for(i in count downTo 1 step 2) //count value is 10
    {
        sum += i
        mySum = i
        print("$i ")        //10, 8, 6, 4, 2

                            //10 + 8 = 18, 18 + 6 = 24, 24 + 4 = 28, 28 + 2 = 30
        //print("$sum ")    //10, 18, 24, 28, 30
    }
    println("")     //to create a new line
    println(mySum)          //2
    println(sum)            //30

    //Labeled statements (using continue)
    /*
    Table:

                0   1   2   3   4   5   6   7
            0   0   0   0   0   0   0   0   0
            1   0   1   2   3   4   5   6   7
            2   0   2   4   6   8   10  12  14
            3   0   3   6   9   12  15  18  21
            4   0   4   8   12  16  20  24  28
            5   0   5   10  15  20  25  30  35
            6   0   6   12  18  24  30  36  42
            7   0   7   14  21  28  35  42  49

            Let's say you wanted to calculate the sum of all cells but exclude all even rows, as shown below:

                0   1   2   3   4   5   6   7
            0
            1   0   1   2   3   4   5   6   7
            2
            3   0   3   6   9   12  15  18  21
            4
            5   0   5   10  15  20  25  30  35
            6
            7   0   7   14  21  28  35  42  49
    */

    sum = 0
    for(row in 0 until 8)
    {
        if(row % 2 == 0)
        {
            continue
        }
        for(column in 0 until 8)
        {
            sum += row * column
        }
        print("$sum ")  //28, 112, 252, 448
                        /*
                            0 + 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28
                            0 + 3 + 6 + 9 + 12 + 15 + 18 + 21 = 84 + 28(from column labeled 1) = 112 in total
                            0 + 5 + 10 + 15 + 20 + 25 + 30 + 35 = 140 + 112(from the addition of column 1 and 3) = 252
                            0 + 7 + 14 + 21 + 28 + 35 + 42 + 49 = 196 + 252(from column(1 + 3 + 5)) = 448 in Total
                        */
    }
    //println(sum)  //448

    /*
        Table:

                The second code example will calculate the sum of all cells, excluding those where the column is greater than
            or equal to the row

            To illustrate, it should sum the following cells:


                0   1   2   3   4   5   6   7
            0
            1   0
            2   0   2
            3   0   3   6
            4   0   4   8   12
            5   0   5   10  15  20
            6   0   6   12  18  24  30
            7   0   7   14  21  28  35  42

    */
    //Using a for loop, you can achieve this as follows:
    println("")     //to create a new line
    sum = 0
    var rowColumn = 0
    rowLoop@ for(row in 0 until 8)              //rowLoop@ is a label for row
    {
        println("")
        columnLoop@ for(column in 0 until 8)    //columnLoop@ is a label for column
        {
            if(row == column)
            {
                continue@rowLoop
            }

            sum += row * column
            rowColumn = row * column

            print("$rowColumn ")

        }
    }
    println("\n\nThe sum would be: $sum")     //322

    //Display a multiplication table
    for(row in 0..7)
    {
        println("")
        for(column in 0..7)
        {
            val cube = row * column
            print("$cube\t")
        }
    }
    print("\n\nCreating a square:\n")  //to create a new Line

    //Mini exercise A
    val range = 1..10
    for(row in range)
    {
        println("")
        for(column in range)
        {
            val square = row * column
            print("$square\t")
        }
    }

    print("\n\nCreating a square(with its squarreroot value):\n")  //to create a new Line
    for(row in range)
    {
        println("")
        for(column in range)
        {
            val square = row * column
            val squareroot = sqrt(square.toDouble())
            print("$squareroot\t")
        }
    }


    sum = 0
    for (row in 1 until 8 step 2) {
        println("")     //to create a new line
        for (column in 0 until 8 ) {
            sum += row * column
            val rowColumn = row * column
            print("$rowColumn\t")
        }
    }
    println("\nThe sum would be: $sum")


    //When expressions
    val number = 10

    when(number)
    {
        0 -> println("Zero")
        10 -> println("It's Ten!")
        else -> println("Non-Zero")
    }

    val string = "Dog"

    when(string)
    {
        "Cat", "Dog" -> println("Animal is a house pet")
        else -> println("Animal is not a house pet")
    }

    val numberName = when(number)
    {
        2 -> "two"
        4 -> "four"
        6 -> "six"
        8 -> "eight"
        10 -> "ten"
        else ->
        {
            println("Unknown Number")
            "Unknown"
        }
    }
                            //if number is were not in (2, 4, 6, 8, 10) then
    println(numberName)     //"Unknown will be the value of numberName"

    //advanced when expressions
    val hourOfDay = 12
    val timeOfDay: String

    /*timeOfDay = when(hourOfDay)
    {
        0, 1, 2, 3, 4, 5 -> "Early Morning"
        6, 7, 8, 9, 10, 11 -> "Morning"
        12, 13, 14, 15, 16 -> "Afternoon"
        17, 18, 19 -> "Evening"
        20, 21, 22, 23 -> "Late Evening"
        else -> "Invalid Hour"
    }
    println(timeOfDay)*/

    //using when expressions with range
    timeOfDay = when(hourOfDay)
    {
        in 0..5 -> "Early Morning"
        in 6..11 -> "Morning"
        in 12..16 -> "Afternoon"
        in 17..19 -> "Evening"
        in 20..23 -> "Late Evening"
        else -> "Invalid Hour"
    }
    println(timeOfDay)

    //using when expressions with conditions
    when
    {
        number % 2 == 0 -> println("Even")
        else -> println("Odd")
    }

    val (x, y, z) = Triple(3, 2, 5)

    when
    {
        x == 0 && y == 0 && z == 0 -> println("Origin")
        y == 0 && z == 0 -> println("On the x-axis at x = $x")
        x == 0 && z == 0 -> println("On the y-axis at y = $y")
        x == 0 && y == 0 -> println("On the z-axis at z = $z")
        else -> println("In space at x = $x, y = $y, z = $z")
    }

    /*
        Here, you match the “y equals x” and “y equals x squared” lines. Since there is no
        argument to the when expression, you do not need an else branch, and the when
        expression will not execute a branch if there is no matching condition. And those are
        the basics of when expressions
    */
    when
    {
        x == y -> println("Along the y = x line")
        y == x * x -> println("Along the y = x^2 line")
    }

    //Mini exercise B
    val myAge = 22

    val age = when(myAge)
    {
        in 0..2 -> "Infant"
        in 3..12 -> "Child"
        in 13..19 -> "Teenager"
        in 20..39 -> "Adult"
        in 40..60 -> "Middle aged"
        in 61..Int.MAX_VALUE -> "Elderly"
        else -> "Invalid age"
    }
    println(myAge)      //22
    println(age)        //Adult

    val (name, currentAge) = Pair("Jonathan", 22)

    val myCurrentAge = when(currentAge)
    {
        in 0..2 -> "Infant"
        in 3..12 -> "Child"
        in 13..19 -> "Teenager"
        in 20..39 -> "Adult"
        in 40..60 -> "Middle aged"
        in 61..Int.MAX_VALUE -> "Elderly"
        else -> "Invalid age"
    }
    println("$name is an $myCurrentAge")
}

//Mini exercise A
/*
    1. Create a constant named range and set it equal to a range starting at 1 and
        ending with 10 inclusive. Write a for loop which iterates over this range and
        prints the square of each number.
    2. Write a for loop to iterate over the same range as in the exercise above and print
        the square root of each number. You’ll need to type convert your loop constant.
    3. Above, you saw a for loop which iterated over only the even rows like so:
        sum = 0
        for (row in 0 until 8) {
                if (row % 2 == 0)
                {
                    continue
                }
                for (column in 0 until 8) {
                    sum += row * column
                }
            }
        Change this to use a step clause on the first for loop to skip even rows instead of using continue.
        Check that the sum is 448 as in the initial example.
*/

//Mini exercise B
/*
    1. Write a when expression that takes an age as an integer and prints out the life
        stage related to that age. You can make up the life stages, or use the
        categorization as follows: 0-2 years, Infant; 3-12 years, Child; 13-19 years,
        Teenager; 20-39, Adult; 40-60, Middle aged; 61+, Elderly.
    2. Write a when expression that destructures a Pair containing a string and an
        integer. The string is a name, and the integer is an age. Use the same cases that
        you used in the previous exercise to print out the name followed by the life stage.
        For example, for myself it would print out "Joe is an adult.".
*/