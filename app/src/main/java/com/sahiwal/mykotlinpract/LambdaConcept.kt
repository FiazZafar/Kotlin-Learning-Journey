package com.sahiwal.mykotlinpract

open class LambdaConcept {

    //Storing a function in a variable using lambda feature
    val StudentsGPa :(Array<Float>,Array<String>) -> Unit = {
        Cgpa,userName ->
        for (i in 0 until Cgpa.size){
            println("Student name is : ${userName[i]} having CGPA of : ${Cgpa[i]}")
        }
    }
    //These functions shows that how much code reduced using Lambda expresion
    val addFunc:(Int ,Int) -> Int = {x,y -> x + y};
    fun addNum(x:Int,y:Int) :Any{
        return x+y
    }


}
