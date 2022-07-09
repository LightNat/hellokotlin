//import kotlin.random.Random
import java.util.Random     //this library is better than the previous one if you wanna use random


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
        |andTrue = $andTrue
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

    //String equality
    val guess = "dog"
    val dogEqualsCat = guess == "cat"
    println(dogEqualsCat)   //false

    val order = "cat" < "dog"
    println(order)  //This syntax checks if one string comes before another alphabetically.
                    // In this case, order equals true because "cat" comes before "dog".

    //Mini exercise A
    val myAge = 22
    val isTeenager = myAge >=13 && myAge <=19
    println(isTeenager)     //false

    val theirAge = 30
    val bothTeenagers = theirAge >= 13 && theirAge <= 19 && isTeenager
    println(bothTeenagers)  //false

    val reader = "Jonathan Gubot"
    val author = "Richard Lucas"
    val authorIsReader = reader == author
    val readerBeforeAuthor = reader < author
    println("Is reader comes before author = $readerBeforeAuthor")

    //The if Expression
    if(2 > 1)
    {
        println("Yes, 2 is greater than 1")
    }

    val animal = "Fox"

    if(animal == "Cat" || animal == "Dog")
    {
        println("Animal is a house pet")
    }
    else
    {
        println("Animal is not a house pet")
    }

    val a = 5
    val b = 10

    /*val min: Int
    if(a < b)
    {
        min = a
    }
    else
    {
        min = b
    }
    println(min)    //5*/

    /*val max: Int
    if(a > b)
    {
        max = a
    }
    else
    {
        max = b
    }
    println(max)    //10*/

    //to make the code shorter
    val min = if(a < b) a else b
    val max = if(a > b) a else b
    println("""|
        |Min is $min
        |Max is $max
    """.trimMargin())

    //else if condition
    val hourOfDay = 12

    val timeOfDay = if(hourOfDay < 6) "Early morning"
                    else if(hourOfDay < 12) "Morning"
                    else if(hourOfDay < 17) "Afternoon"
                    else if(hourOfDay < 20) "Evening"
                    else if(hourOfDay < 24) "Late Evening"
                    else "Invalid Hour!"
    println(timeOfDay)

    //Mini exercise B
    val myAge2 = 22
    if(myAge2 > 13 && myAge2 < 19)
    {
        "Teenager"
    }
    else
    {
        "Not Teenager"
    }
    val answer = if(myAge2 > 13 && myAge2 < 19) "Teenager" else "Not Teenager"
    println(answer)

    //Loops
    var sum = 1
    while (sum < 1000)
    {
        sum = sum + (sum + 1)
    }
    println(sum)

    //do-while loops
    var sum2 = 1

    do
    {
        sum2 = sum2 + (sum2 + 1)
    }while (sum2 < 1000)
    println(sum2)

    //breaking out of a loop
    sum = 1
    while (true)
    {
        sum = sum + (sum + 1)
        if(sum >= 1000)
        {
            break
        }
    }
    println(sum)

    //Mini Exercise C
    var counter = 0
    while (counter < 10)
    {
        println("Counter is $counter")
        counter += 1
    }

    counter = 0
    var roll = 0
    do
    {
        roll = Random().nextInt(6)
        counter += 1
        println("After $counter roll(s), roll is $roll")
    }while (roll != 0)

}

//Mini exercise A
/*
    1. Create a constant called myAge and set it to your age. Then, create a constant
        named isTeenager that uses Boolean logic to determine if the age denotes
        someone in the age range of 13 to 19.
    2. Create another constant named theirAge and set it to the age 30. Then, create a
        constant named bothTeenagers that uses Boolean logic to determine if both you
        and them are teenagers.
    3. Create a constant named reader and set it to your name as a string. Create a
        constant named author and set it to the name Richard Lucas. Create a constant
        named authorIsReader that uses string equality to determine if reader and
        author are equal.
    4. Create a constant named readerBeforeAuthor which uses string comparison to
        determine if reader comes before author.
*/

//Mini exercise B
/*
    1. Create a constant named myAge and initialize it with your age. Write an if
        expression to print out Teenager if your age is between 13 and 19, and Not a
        teenager if your age is not between 13 and 19.
    2. Create a constant called answer and use a single line if-else expression to set it
        equal to the result you print out for the same cases in the above exercise. Then
        print out answer
*/

//Mini exercise C
/*
    1. Create a variable named counter and set it equal to 0. Create a while loop with
        the condition counter < 10 which prints out counter is X (where X is replaced
        with counter value) and then increments counter by 1.
    2. Create a variable named counter and set it equal to 0. Create another variable
        named roll and set it equal to 0. Create a do-while loop.
        Inside the loop, set roll equal to Random().nextInt(6) which means to pick a
        random number between 0 and 5. Then increment counter by 1.
*/