fun main(args: Array<String>)
{
    //Just a sample
    val circularNumbers = arrayOf(9, 8, 7, 2, 1, 6, 3,4 ,5)

    println("Circular numbers using array")
    for(i in circularNumbers)
    {
        if(i == circularNumbers[3] || i == circularNumbers[6])
        {
            println("")
        }
        print("$i\t")
    }
    println("\nFirst number of circularNumber is: ${circularNumbers[0]}")
    println("")

    //Creating arrays
    val evenNumbers = arrayOf(2, 4, 6, 8)
    print("Printing Even Numbers: ")
    for (i in evenNumbers)
    {
        print("$i ")
    }
    println("\n")

    //Arrays with default Values
    val fiveFives = Array(5, {5})     //5, 5, 5, 5, 5
    print("\nPrinting 5 fives: ")
    println(fiveFives.joinToString() + "\n")

    val vowels = arrayOf("a", "e", "i", "o", "u")
    print("Printing Vowels: ")
    for (i in vowels)
    {
        print("$i ")
    }
    println("\n")

    //Arrays of primitive types
    val oddNumbers = intArrayOf(1, 3, 5, 7)     //this kind of array is intended to have a value of int only

    val zeros = DoubleArray(4)      //0.0, 0.0, 0.0, 0.0
    //printing using for loop
    print("Printing using for loop: ")
    for(i in zeros)
    {
        print("$i ")
    }
    print("\n\nPrinting 4 zeros: ")
    println(zeros.joinToString())

    val otherOddNumbers = arrayOf(1, 3, 5, 7).toIntArray()
    print("\nConverted oddNumbers: ")
    for(i in otherOddNumbers)
    {
        print("$i ")
    }
    println("\n")

    for(arg in args)
    {
        print("$arg ")      //Edit configurations -> add this(do re mi fa sol la ti do) in program arguments
    }

    //An alternative
    println("\n")
    args.forEach {arg ->
        print("$arg ")
    }
    println("\n")

    //Lists
    //Creating lists (these lists are immutables)
    val innerPlanets = listOf("Mercury", "Venus", "Earth", "Mars")

    val innerPlanetsArrayList = arrayListOf("Mercury", "Venus", "Earth", "Mars")

    val subscribers = listOf<String>()      //proper syntax of creating lists(implicit)

    //Mutable Lists
    val outerPlanets = mutableListOf("Jupiter", "Saturn", "Uranus", "Neptune")

    val exoPlanets = mutableListOf<String>()

    //Accessing elements
    //Using properties and methods
    val players = mutableListOf("Alice", "Bob", "Cindy", "Dan")
    println("${players.isEmpty()}\n")    //false

    if(players.size < 2)
    {
        println("We need at least two players!")
    }
    else
    {
        println("Let's start!\n")
    }

    var currentPlayer = players.first()
    println(currentPlayer + "\n")      //Alice
    println(players.last() + "\n")

    val minPlayer = players.minOrNull()
    minPlayer.let {
        println("$minPlayer will start")    //Alice will start
    }
    //for strings, min is ordered alphabetically
    //for int, min is ordered by smallest value

    println(arrayOf(2, 3, 1).first())   //2
    println(arrayOf(2, 3, 1).min())     //1

    val maxPlayer = players.maxOrNull()
    if(maxPlayer != null)
    {
        println("\n$maxPlayer is the MAX")        //Dan is the MAX
    }

    //just another example of the purpose of let function
    var sampleNumber: Int? = null
    sampleNumber?.let {
        var sample = sampleNumber + 1
    }
    //we need to use let function for nullables to avoid error/s

    //Using indexing
    val firstPlayer = players[0]
    println("\nFirst player is $firstPlayer")       //First player is Alice

    //you can also do this

    val secondPlayer = players.get(1)
    println("\nSecond player is $secondPlayer")     //Second player is Bob

    //Using ranges to slice
    val upcomingPlayersSlice = players.slice(1..2)
    println("\n${upcomingPlayersSlice.joinToString()}")     //Complete values: ("Alice", "Bob", "Cindy", "Dan")
                                                            //Output after slice: ("Bob", "Cindy")

    //Checking for an element
    fun isEleminated(player: String): Boolean
    {
        return player !in players
    }
    println("\n${isEleminated("Bob")}\n")    //false

    println(players.slice(1..3).contains("Alice"))      //false, because Alice is in index 0

    //Modifying lists
    //Appending elements
    players.add("Eli")
    players += "Gina"

    //printing the lists of players
    //A
    print(players)
    //B
    println("")
    for(player in players)
    {
        print(player)
    }
    //C
    print("\n"+players.joinToString()+"\n\n")

    //Adding values in an array
    var array = arrayOf(1, 2, 3)
    array += 4

    for(arrays in array)
    {
        print("$arrays ")
    }
    println("\n")

    //Inserting Elements
    players.add(5, "Frank")
    for(player in players)
    {
        print("$player ")       //Alice Bob Cindy Dan Eli Frank Gina
    }
    println("\n")

    //Removing Elements
    val wasPlayerRemoved = players.remove("Gina")   //Gina was removed
    for(player in players)
    {
        print("$player ")   //Alice Bob Cindy Dan Eli Frank
    }
    println("\n")

    //Removing ELements using index
    val removedPlayer = players.removeAt(2)     //Cindy was removed
    for(player in players)
    {
        print("$player ")   //Alice Bob Dan Eli Frank
    }
    println("\n")

    //Mini exercise A
    val playerName = players.indexOf("Dan")
    println("Dan's index number is $playerName\n")

    //Updating elements
    println(players.joinToString()+"\n")     //Alice, Bob, Dan, Eli, Frank
    players[4] = "Franklin"     //from having a value "Frank"
    println(players.joinToString()+"\n")     //Alice, Bob, Dan, Eli, Franklin

    //Using sort method
    players[3] = "Anna"
    println(players.joinToString()+"\n")         //Alice, Bob, Dan, Anna, Franklin
    players.sort()

    //value after the value being sorted alphabetically
    println(players.joinToString()+"\n")        //Alice, Anna, Bob, Dan, Franklin

    //Other way to update an element using its index
    players.set(3, "Anna")
    println(players.joinToString()+"\n")        //Alice, Anna, Bob, Anna, Franklin
    players.set(3, "Dan")                       //Alice, Anna, Bob, Dan, Franklin

    //changing value of a constant array
    val arrayOfInts = arrayOf(1, 2, 3)
    arrayOfInts[0] = 4
    println(arrayOfInts.joinToString()+"\n")    //4, 2, 3

    //iterating through a list
    val scores = listOf(2, 2, 8, 6, 1)
    for(player in players)
    {
        println(player)
    }
    println("\n")
    //Alice
    //Anna
    //Bob
    //Dan
    //Franklin

    for((index, player) in players.withIndex())
    {
        println("${index + 1}. $player")
    }
    //1. Alice
    //2. Anna
    //3. Bob
    //4. Dan
    //5. Franklin

    fun sumOfElements(list: List<Int>): Int
    {
        var sum = 0

        for(number in list)
        {
            sum += number
        }
        return sum
    }

    //Calculate the sum of players' scores
    println(sumOfElements(scores))      //19
    println("")

    val score = scores      //scores is a type of list
    //Mini exercise B
    for((index, player) in players.withIndex())
    {
        println("Player's name is $player having a scores of ${score[index]}")
    }
    println("\n")

    //Nullability and collection types
    //A nullable list
    var nullableList: List<Int>? = listOf(1, 2, 3, 4)   //You'll be able make the whole list set the value to null
    nullableList = null                                 //because you put '?' symbol outside the argument type of list

    //A nullable values inside the list
    var listOfNullables: List<Int?> = listOf(1, 2, null, 4)
}

//Mini exercise A
/*
    Use indexOf() to determine the position of the element "Dan" in players.
*/

//Mini exercise B
/*
    Write a for loop that prints the players’ names and scores.
*/

