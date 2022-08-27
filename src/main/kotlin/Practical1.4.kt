fun main()
{

    print("Enter Number: ")
    var num:Int= readLine()!!.toInt()
    println(if(num%2==0) " $num is Even" else " $num is Odd")
}
