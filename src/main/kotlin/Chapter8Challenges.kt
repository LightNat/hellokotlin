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
}

//Line 73 Output:       1
//Line 82..85 output:   2
//                      2
//                      3