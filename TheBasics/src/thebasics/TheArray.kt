package thebasics

fun main(args: Array<String>)
{
    val myNumberArr: IntArray = intArrayOf(1, 2, 3, 4, 5, 6)// create a number array and store it in a variable
    // index of values--                   0, 1, 2, 3, 4, 5

    // index values always start from 0!

    print("please enter the index you want to see: ")
    var userInput = readLine()!!.toInt() // get integer input from the user
    if(userInput > myNumberArr.size-1 || userInput < 0) // if the input is bigger then the max index or smaller then 0
    {
        print("sorry, the entered index doesn't exist")
    }
    else
    {
        print("value in the index: " + myNumberArr[userInput]) // print the value of the given index
    }


}