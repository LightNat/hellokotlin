//Challenges
/*
        Check out the following challenges to test your knowledge of Kotlin arrays and lists.
    As always, you can check out the solutions in the materials for this chapter.

    1. Which of the following 1-10 are valid statements?
        1. val array1 = Array<Int>()
        2. val array2 = arrayOf()
        3. val array3: Array<String> = arrayOf()

        For the next three statements, array4 has been declared as:
        val array4 = arrayOf(1, 2, 3)
            4. println(array4[0])
            5. println(array4[5])
            6. array4[0] = 4
        For the final five statements, array5 has been declared as:
        val array5 = arrayOf(1, 2, 3)
            7. array5[0] = array5[1]
            8. array5[0] = "Six"
            9. array5 += 6
            10. for item in array5 { println(item) }

    2. Write a function that removes the first occurrence of a given integer from a list of
    integers. This is the signature of the function:

        fun removeOne(item: Int, list: List<Int>): List<Int>

    3. Write a function that removes all occurrences of a given integer from a list of
    integers. This is the signature of the function:

        fun remove(item: Int, list: List<Int>): List<Int>

    4. Arrays and lists have a reverse() method that reverses all the elements in-place,
    that is, within the original array or list. Write a function that does a similar thing,
    without using reverse(), and returns a new array with the elements of the
    original array in reverse order. This is the signature of the function:

        fun reverse(array: Array<Int>): Array<Int>

    5. The function below returns a random number between from (inclusive) and the
    to (exclusive):
        import java.util.Random
        val random = Random()
        fun rand(from: Int, to: Int) : Int {
        return random.nextInt(to - from) + from
        }


        Use it to write a function that shuffles the elements of an array in random order. This
    is the signature of the function:

        fun randomized(array: Array<Int>): Array<Int>

    6. Write a function that calculates the minimum and maximum value in an array of
        integers. Calculate these values yourself; don’t use the methods min and max.
        Return null if the given array is empty.
        This is the signature of the function:

        fun minMax(numbers: Array<Int>): Pair<Int, Int>?

    Hint: You can use the Int.MIN_VALUE and Int.MAX_VALUE constants within the
    function.
*/
import java.util.Random
val random = Random()

fun main()
{
    //val array1 = Array<Int>()             //Invalid, no value passed for parameter
    //val array2 = arrayOf()                //Invalid, Because you need to put a type arguments for empty collections
    val array3: Array<String> = arrayOf()   //valid

    val array4 = arrayOf(1, 2, 3)           //valid

    println(array4[0])                      //valid, having the value of 1
    //println(array4[5])                    //Invalid, index out of bounds
    array4[0] = 4                           //valid

    val array5 = arrayOf(1, 2, 3)

    array5[0] = array5[1]                   //valid, the value of 1st index will be 2
    //array5[0] = "six"                     //Invalid, type mismatch(String but Int was expected)
    //array5 += 6                           //Invalid, because val(constants) cannot be reassigned
    for(item in array5)
    {
        println(item)                       //valid, the output would be:
    }                                       //2
                                            //2
                                            //3

    println(removeOne(3, oddNumbers))       //3 was removed

    println(remove(4, repeatedFours))       //all items having the value of 4 had been removed

    print(reverse(myArray).joinToString())      //to reverse the contents of the array

    println("")

    println(rand(1, 10))

    println(arrayRandomized.joinToString())

    println("")

    println(minMax?.first)
    println(minMax?.second)

}

val oddNumbers = listOf(1, 2, 3, 4, 5)

val repeatedFours = listOf(1, 2, 3, 4, 5, 4, 6, 9, 4, 5, 6, 11, 23, 12, 4)

val myArray = arrayOf(2, 4, 6, 8, 10)

val arrayOrdered = arrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
val arrayRandomized = randomized(arrayOrdered)

val integers = arrayOf(4, -54, -300, 23, 55666, 22, 1, -2223, 33, 11, 500000)
val minMax = minMax(integers)



fun removeOne(item: Int, list: List<Int>):List<Int>
{
    var mutableList = list.toMutableList()      //convert lists to mutable list
    mutableList.remove(item)
    return mutableList.toList()
}

fun remove(item: Int, list: List<Int>):List<Int>
{
    var mutableList = list.toMutableList()
    while(item in mutableList)              //using while loop, this function will be able to remove those repeated values
    {
        mutableList.remove(item)
    }
    return mutableList.toList()
}

fun reverse(array: Array<Int>): Array<Int>
{
    val newArray = Array(array.size, {0})
    for(i in 0 until array.size)
    {
        newArray[i] = array[array.size - i - 1]
    }
    return newArray
}


fun rand(from: Int, to: Int) : Int {
    return random.nextInt(to - from) + from
}

fun randomized(array: Array<Int>): Array<Int> {
    val newArray = Array(array.size, { 0 })
    val usedIndices = mutableListOf<Int>()

    for (i in 0 until array.size) {
        var randomIndex = 0
        while (true) {
            randomIndex = rand(0, array.size)
            if (randomIndex !in usedIndices) {
                usedIndices.add(randomIndex)
                break
            }
        }
        newArray[i] = array[randomIndex]
    }

    return newArray
}

fun minMax(numbers: Array<Int>): Pair<Int, Int>?
{
    if(numbers.isEmpty())
    {
        return null
    }

    var min = Int.MIN_VALUE
    var max = Int.MAX_VALUE

    for(number in numbers)
    {
        if(number < min)
        {
            min = number
        }
        if (number > max)
        {
            max = number
        }
    }

    return Pair(min, max)
}



