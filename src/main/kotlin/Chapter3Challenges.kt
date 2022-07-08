/*
    1. Create a constant called coordinates and assign a pair containing two and three
        to it.
    2. Extract the values 2 and 3 from coordinates into two variables called row and
        column.
    3. Which of the following are valid statements?
            val character: Character = "Dog"
            val character: Char = 'd'
            val string: String = "Dog"
            val string: String = 'd'
    4. Is this valid code?
            val date = Triple(15, 8, 2015)
            val day = date.First
    5. What is wrong with the following code?
            val name = "Joe"
            name += " Howard"
    6. What is the type of the constant named value?
            val triple = Triple(100, 1.5, 10)
            val value = triple.second
    7. What is the value of the constant named month?
            val newDate = Triple(15, 8, 2015)
            val month = newDate.second
    8. What is the value of the constant named summary?
            val number = 10
            val multiplier = 5
            val summary = "$number multiplied by $multiplier equals ${number * multiplier}"
    9. What is the sum of a and b, minus c? What is its type?
            val a = 4
            val b: Short = 100
            val c: Byte = 12
    10. What is the numeric difference between kotlin.math.PI and kotlin.math.PI.toFloat()?
*/

fun main()
{
    val coordinates = Pair(2, 3)
    var rows = coordinates.first
    var columns = coordinates.second

    //val character: Character = "Dog"
    val character: Char = 'd'
    val string: String = "Dog"
    //val string: String = 'd'

    val date = Triple(15, 8, 2015)
    //val day = date.First
    val day = date.first

    //val name = "Joe"
    var name = "Joe"
    name += " Howard"

    val triple = Triple(100, 1.5, 10)
    val value = triple.second   //Double

    val newDate = Triple(15, 8, 2015)
    val month = newDate.second  //8

    val number = 10
    val multiplier = 5
    val summary = "$number multiplied by $multiplier equals ${number * multiplier}"
    println(summary)    //10 multiplied by 5 equals to 50

    val a = 4
    val b: Short = 100
    val c: Byte = 12
    var output = a+b-c
    println(output) //Int

}