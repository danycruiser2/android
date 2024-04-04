import com.sun.jdi.IntegerValue

fun main(){
    var maths:Int = 46
    var english:Int = 56

  if(maths > english){
      println("maths > english")
  }else if(maths < english){
      println("Test")

  }else{

      println("mit")
  }


    var number:Int = -78

    if (number == 0){
        println ("zero number")
    }else if (number > 0) {
        println("positive number")
    }else {
        println("negative number")
    }


    var numb:Int = 9
   if (numb % 2 == 0  ){
       println("Even number")
   }
    else {
        println("Odd number")
    }



    var social:Int = 78
    var physics:Int = 67
    var science:Int = 45
    var total:Int = ((social+physics+science)/3)


    println("average = $total")

    if (total > 100 ){
        println ("Number exceeds 100")
    }else if (total > 80) {
        println("your grade is A")
    } else if (total > 70 ){
        println("the grade is B")
    }else if (total > 60) {
        println("the grade is C")
    }else if (total > 50){
        println("the grade is D")
    }else{
        println("you have failed")
    }









}


