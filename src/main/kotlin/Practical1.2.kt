fun main()
{
    var int:Int=10
    var double:Double=20.2
    var str:String="100"
    println("Integer Value: $int")
    println("Double Value: $double")
    println("String Value: $str")
    double = int.toDouble()
    println("Integer To Double: $double")
    int = str.toInt()
    println("String to Integer: $int")
    double = str.toDouble()
    println("String to Double: $double")
}
