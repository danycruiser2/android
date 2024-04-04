fun main(){
    println("input your name")
    var userinput = readLine()
    println(userinput)


    var one = 34
    var two = 56
    var three = 89
    var find = maxOf(one, two, three)
    var min= minOf(one, two ,three)

    println("max no is $find")
    println("min no is $min")


    print("input temperature in degrees celcious: ")
    var temp:Int= readLine()!!.toInt()
    var conv = (temp * 9/5) + 32
    println("the temperature in fahrenheit $conv")

}