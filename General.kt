//General
fun main()
{
    val a:Int
    a=5
    var b=5
    b=10
    println("$a $b")
    val ch='A'
    when(ch)
    {
        'A'->println("$ch is a vowel")
        'E'->println("$ch is a vowel")
        'I'->println("$ch is a vowel")
        'O'->println("$ch is a vowel")
        'U'->println("$ch is a vowel")
        else->println("$ch is a consonant")
    }
}