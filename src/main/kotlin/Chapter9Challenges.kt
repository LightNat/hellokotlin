//Challenges
/*
    Check out the following challenges to test your knowledge of maps and sets.

    1. Which of the following are valid statements?
            1. val map1: Map<Int to Int> = emptyMap()
            2. val map2 = emptyMap()
            3. val map3: Map<Int, Int> = emptyMap()

    For the next four statements, use the following map:
        val map4 = mapOf("One" to 1, "Two" to 2, "Three" to 3)
        4. map4[1]
        5. map4["One"]
        6. map4["Zero"] = 0
        7. map4[0] = "Zero"

    For the next three statements, use the following map:
        val map5 = mutableMapOf(
         "NY" to "New York",
         "CA" to "California"
        )

        8. map5["NY"]
        9. map5["WA"] = "Washington"
        10. map5["CA"] = null
    2. Given a map with two-letter state codes as keys, and the full state names as
    values, write a function that prints all the states with names longer than eight
    characters. For example, for the map mapOf("NY" to "New York", "CA" to
    "California"), the output would be California.

    3. Write a function that combines two maps into one. If a certain key appears in
    both maps, ignore the pair from the first maps. This is the function’s signature:
    fun mergeMaps(
     map1: Map<String, String>,
     map2: Map<String, String>
    ): Map<String, String>

    4. Declare a function occurrencesOfCharacters that calculates which characters
    occur in a string, as well as how often each of these characters occur. Return the
    result as a map. This is the function signature:
    fun occurrencesOfCharacters(text: String): Map<Char, Int>
    Hint: String is a collection of characters that you can iterate over with a for
    statement.
    Bonus: To make your code shorter, maps have a special function that lets you
    add a default value if it is not found in the map. For example,
    map.getOrDefault('a', defaultValue = 0) returns 0 for the character ‘a’
    if it is not found, instead of simply returning null.

    5. Write a function that returns true if all of the values of a map are unique. Use a
    set to test uniqueness. This is the function signature:
    fun isInvertible(map: Map<String, Int>): Boolean

    6. Given the map:
    val nameTitleLookup: Map<String, String?> = mutableMapOf(
    "Mary" to "Engineer",
    "Patrick" to "Intern",
    "Ray" to "Hacker"
    )
    Set the value of the key "Patrick" to null and completely remove the key and value
    for "Ray".
*/
fun main()
{
    //val map1: Map<Int to Int> = emptyMap()        //Invalid, replace "to" to ","
    //val map2 = emptyMap()                         //Invalid, empty maps need to have a type argument
    val map3: Map<Int, Int> = emptyMap()

    val map4 = mapOf("One" to 1, "Two" to 2, "Three" to 3)
    //map4[1]
    println(map4["One"])
    //map4["Zero"] = 0
    //map4[0] = "Zero"

    val map5 = mutableMapOf(
        "NY" to "New York",
        "CA" to "California"
    )
    println(map5["NY"])
    map5["WA"] = "Washington"
    //map5["CA"] = null
    println(map5)
    println()

    myMap()

    val firstMap = mapOf("1" to "2", "2" to "2")
    val secondMap = mapOf("1" to "1", "3" to "3")
    println(mergeMaps(firstMap, secondMap))

    println(occurrencesOfCharacters("I'm your huckleberry."))

    val invertibleMap = mapOf("1" to 1, "2" to 2, "3" to 3)
    println(isInvertible(invertibleMap))

    val nonInvertibleMap = mapOf("1" to 3, "2" to 2, "3" to 3)
    println(isInvertible(nonInvertibleMap))

    val nameTitleLookup: MutableMap<String, String?> = mutableMapOf(
        "Mary" to "Engineer",
        "Patrick" to "Intern",
        "Ray" to "Hacker"
    )

    nameTitleLookup["Patrick"] = null
    nameTitleLookup.remove("Ray")

    println(nameTitleLookup)



}

//Functions
fun myMap()
{
    val map = mapOf(
        "NY" to "New York",
        "CA" to "California"
    )

   for((twoLetter, fullName) in map)
   {
       println(twoLetter)
        if(fullName.length > 8)
        {
            println(fullName)
        }
   }
}

fun mergeMaps(map1: Map<String, String>, map2: Map<String, String>): Map<String, String>
{
    val map3: MutableMap<String, String> = mutableMapOf()
    map3.putAll(map1)
    map3.putAll(map2)
    return map3
}

fun occurrencesOfCharacters(text: String): Map<Char, Int> {
    val map = mutableMapOf<Char, Int>()
    for (c in text) {
        val count = map.getOrDefault(c, defaultValue = 0)
        map[c] = count + 1
    }
    return map
}

fun isInvertible(map: Map<String, Int>) = map.values.toSet().size == map.values.size