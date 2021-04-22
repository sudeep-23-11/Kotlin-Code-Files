//Arrays
fun main()
{
    val str=arrayOf(100, 55.66, 'x', "Hello")
    for(ele in str)
    print("$ele ")
    println()
    var arr=arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    for((i, ele) in arr.withIndex())
    {
        print("$ele ")
        arr[i]=(i+1)*10
        print(arr[i])
        println()
    }
}