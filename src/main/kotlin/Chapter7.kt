fun main()
{
    //Before knowing nullables
    var name = "Joe howard"
    var age = 24
    var occupation = "Software Developer & Author"

    //Introducing null
    var errorCode: Int?
    errorCode = 100         //you can set errorCode having the value of null to 100 or
    errorCode = null        //set it to go back to null or no value

    //Mini exercise A
    var myFavoriteSong: String?
    myFavoriteSong = "Hold on"
    myFavoriteSong = null

    val parseInt = "10".toIntOrNull()       //this converts the value "10" to 10 as int
    val parseInt2 = "Dog".toIntOrNull()     //this converts the value from "Dog" to null

    //Checking for null
    var result: Int? = 30
    println(result)
    //println(result + 1    //Operator call corresponds to a dot-qualified call 'result.plus(1)'
                            // which is not allowed on a nullable receiver 'result'.
    println(result?.plus(1))    //use this instead or use the not-null assertion operator "!!"

    //Not-null assertion operator
    var authorName: String? = "Joe Howard"
    var authorAge: Int? = 24

    val ageAfterBirthday = authorAge!! + 1
    println("After their next birthday, author will be $ageAfterBirthday")

    //Smart Casts
    var nonNullableAuthor: String
    var nullableAuthor: String?

    if(authorName != null)
    {
        nonNullableAuthor = authorName
        println(nonNullableAuthor + " is non nullable")
    }
    else
    {
        nullableAuthor = authorName
        println(nullableAuthor + " is nullable")
    }

    //Mini exercise B
    if(myFavoriteSong != null)
    {
        println("$myFavoriteSong")
    }
    else
    {
        println("I don't have a favorite song")
    }

    if(myFavoriteSong != null)
    {
        myFavoriteSong = null
    }
    else
    {
        myFavoriteSong = "Replay"
    }
    println(myFavoriteSong)


    //Safe calls
    var nameLength = authorName?.length
    println("$authorName has $nameLength letters")

    var nameLengthPlus5 = authorName?.length?.plus(5)
    println("$authorName has $nameLength letters + 5 = $nameLengthPlus5")

    //The let() function
    authorName?.let {
        nonNullableAuthor = authorName
    }
    authorName?.let {
        nameLength = authorName.length
    }

    //Elvis Operator
    var nullableInt: Int? = 10
    nullableInt = null
    var mustHaveResult = nullableInt ?: 0   //mustHaveResult variable will equal either the value inside nullableInt or,
                                            //0 if nullableInt contains null

    println(mustHaveResult)
}

//Mini exercise A
/*
    1. Make a nullable String called myFavoriteSong. If you have a favorite song, set it
        to a string representing that song. If you have more than one favorite song or no favorite,
        set the nullable to null.
    2. Create a constant called parsedInt and set it equal to "10".toIntOrNull();
        this will try to parse the string "10" and convert it to an Int. Check the type of
        parsedInt by clicking toIntOrNull() and holding Control + Shift + P. Why is
        it a nullable?
    3. Change the string being parsed in the above exercise to a non-integer (try dog for example).
        What does parsedInt equal now?
*/

//Mini exercise B
/*
    1. Using your myFavoriteSong variable from earlier, use a null check and smart cast to check if it contains a value.
        If it does, print out the value. If it doesn’t, print "I don’t have a favorite song."
    2. Change myFavoriteSong to the opposite of what it is now. If it’s null, set it to a string;
        if it’s a string, set it to null. Observe how your printed result changes.
*/