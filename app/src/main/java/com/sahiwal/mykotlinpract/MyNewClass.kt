package com.sahiwal.mykotlinpract


open class MyNewClass {

    constructor(a : Int ,b :Int){
        println("Parent class constructor is called. with first value $a, and second value $b")
    }


    //This is also an example of primary constructor.
    private class User(val id:Int,val name:String, val city:String)

    //how data class , pair and triple works in Kotlin.
    protected fun pairTriple() {
        println("Data classes in Kotlin")
        var obj1 = User(1,"Fiaz5","Sahiwal")
        var obj2 = User(2,"Fiaz4","Sahiwal")
        var obj3 = User(3,"Fiaz3","Sahiwal")
        var obj4 = User(4,"Fiaz2","Sahiwal")
        var obj5 = User(5,"Fiaz1","Sahiwal")
        var arr = arrayOf(obj1,obj2,obj3,obj4,obj5)

        var pair1 = Pair(1,"Fiaz1")
        var pair2 = Pair(2,"Fiaz2")
        var pair3 = Pair(3,"Fiaz3")
        var pair4 = Pair(4,"Fiaz4")

        for (user in arr){
            println("${user.id} , ${user.name} , ${user.city}")

        }
        println("\nPair syntax")
        println("Triple is similar to pair :")
        println(pair1)
        println(pair2)
        println(pair3)
        println(pair4)
    }

    protected fun iterateStatment(students :Int){
        //iterate until length-1
        println("This is For loop.")
        println()
        for (i in 0 until students){
            println("student no is : $i" )
        }
        println()
        //iterate till length
        for (i in 0 .. students){
            println("student no is : $i" )
        }
        println()
        //iterate in decening order
        for (i in students downTo 0){
            println("students no is : $i")
        }
        //working of while loop
        println()

        println("This is while loop.")
        var i:Int = 0
        while (i < students){
            //Use while loops
            println("student no is : $i" )
            i++
        }
        var j = 0
        //working of do while loop
        println()
        println("This is do while loop.")
        do {
            println("Student no is $j")
            j++
        }while (j<students)

        //How to write code in for each loop

        var names : Array<String> = arrayOf("Fiaz","Hamza","Shahzaib")
        var rollNO : Array<Int> = arrayOf(1,2,3,44,5,6)
        println("\nHow to work with for each loop")
        for (i in names){
            println("Student name is : $i")
        }
    }

    protected fun variablesFunction(){

        //How to declare variable in Kotlin
        //I also added some examples related to val variable

        var rollNo = 35
        var name: String = "Fiaz"
        val cgpa: Float
        cgpa = 4.6F
        var salary: Double
        salary = 200903.2
        val muslim: Boolean = true

        println("$name roll no is : " + rollNo);
        println("$name cgpa is : " + cgpa);
        println("$name salary is : " + salary);
        println("$name is a muslim : " + muslim);

    }

}