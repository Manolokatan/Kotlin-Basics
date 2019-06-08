package thebasics

fun main(args: Array<String>){

    print("\nplease enter the variable: ")
    var myUserInput = readLine()!!.toInt() // get integer input from the user
    when(myUserInput)
    {
        1 -> print("1 is an amazing number")  // when myUserInput is equal to 1 then print this
        2 -> print("2 is even better")  // when myUserInput is equal to 2 then print this

        else ->
        {
            print("wow you are hard to impress")//  if myUserInput is non of the above then print this
        }
    }


}