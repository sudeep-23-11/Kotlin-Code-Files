//Loops
fun main()
{
    repeat(10)
    {
        println("Hello World")
    }
    for(i in 1..10 step 2)
    print("$i ")
    println()
    for(i in 1 until 10)
    print("$i ")
    println()
    for(i in 10 downTo 1)
    print("$i ")
    println()
}