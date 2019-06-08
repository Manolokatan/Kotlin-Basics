package thebasics

fun main(args: Array<String>)
{
    val ageLimit = 18
    print("please enter you're age: ") // print the question to the screen
    var inputAge = readLine()!!.toInt() // get integer input from the user
    if(inputAge >= ageLimit) // check if user input is bigger then the age limit
    {
        print("you are old enough to drink :)") // if so, print this to the screen
    }
    else
    {
        print("wait until your 18!") // else or if not then print this to the screen
    }

}