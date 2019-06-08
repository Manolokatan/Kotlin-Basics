package thebasics.UsingWhile




fun main(args : Array<String>){


    val mySecretName = "nameSecret"
    val mySecretPass = 999

    print("please enter a name: ")
    var inputName = readLine()!!.toString() // get string iput from the user for the username

    print("please enter a pass: ")
    var inPass = readLine()!!.toInt() // get integer iput from the user for the password

    if(mySecretName == inputName && mySecretPass == inPass) // if the username and password match the correct then
    {
        print("correct, welcome back!")
    }
    else
    {
        print("nope, good luck later :(")
    }


}