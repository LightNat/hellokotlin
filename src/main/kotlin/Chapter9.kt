import kotlin.random.Random

//Mini exercise A
var myPlayer = mutableMapOf<String, String>()

fun main()
{
    //Creating maps
    var yearOfBirth = mapOf(
        "Anna" to 1990,
        "Brian" to 1991,
        "Craig" to 1992,
        "Donna" to 1993
    )

    var namesAndScores: MutableMap<String, Int> = mutableMapOf(
        "Anna" to 2,
        "Brian" to 2,
        "Craig" to 8,
        "Donna" to 6
    )
    namesAndScores = mutableMapOf()     //setting an empty map


    //Accessing Values
    //Using the Index Operator
    namesAndScores = mutableMapOf(
        "Anna" to 2,
        "Brian" to 2,
        "Craig" to 8,
        "Donna" to 6
    )

    println(namesAndScores)
    println(namesAndScores["Anna"])     //2
    println(namesAndScores["Greg"])     //null

    //Using properties and Methods
    println(namesAndScores.get("Craig"))

    println(namesAndScores.isEmpty())
    println(namesAndScores.size)

    //Modifying mutable maps
    //Adding Pairs
    val bobData = mutableMapOf(
        "name" to "Bob",
        "profession" to "CardPlayer",
        "Country" to "USA"
    )
    bobData.put("state", "CA")

    println(bobData)

    //Mini exercise A
    myStateAndCity(bobData)

    //Updating values
    bobData.put("name", "Bobby")

    bobData["profession"] = "Mailman"

    val pair = "nickname" to "Bobby D"
    bobData += pair
    println(bobData)

    //Removing pairs
    bobData.remove("city")
    bobData.remove("state", "CA")

    //Iterating through maps
    for((player, score) in namesAndScores)
    {
        println("$player - $score")
    }

    for(player in namesAndScores.keys)
    {
        println(player)
    }

    for(score in namesAndScores.values)
    {
        println(score)
    }

    //Runnning time for map operations
    println("some string".hashCode())   //1395333309
    println(1.hashCode())               //1
    println(false.hashCode())           //1237

    //Sets
    //Creating Sets
    val names = setOf("Anna", "Brian", "Craig", "Anna")     //[Anna, Brian, Craig]
    println(names)

    //set from arrays
    val someArray = arrayOf(1, 2, 3, 1)
    var someSet = mutableSetOf(*someArray)
    println(someSet)

    //accessing elements
    println(someSet.contains(1))    //true
    println(3 in someSet)           //true
    println(4 in someSet)           //false

    for(number in someSet)
    {
        print(number)   //123
    }
    someSet += 5        //removing 5
    someSet -= 1        //removing 1
    println(someSet)
}

//Mini exercise A
fun myStateAndCity(player: Map<String, String>)
{
    println(player["city"])
    println(player["state"])
}



//Mini exercise A
/*
    Write a function that prints a given player's city and state
*/






