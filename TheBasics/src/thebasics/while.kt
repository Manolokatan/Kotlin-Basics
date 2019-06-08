package thebasics

fun main(args: Array<String>)
{
    var inputAnswer  = ""  // // initialize the variables
    val correctAnswer = "no"

    while(inputAnswer.toLowerCase() != correctAnswer) // while user input in lower case doesn't match the correct answer
    {
        print("can you drink and drive? ") // print the question
        inputAnswer = readLine()!!.toString() // get string input from the user
    }
    print("Your right\nDone.")//when we are out of the loop print this - \n means print on the next line


}