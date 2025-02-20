package com.sahiwal.mykotlinpract

import com.sahiwal.mykotlinpract.MyEnums

class MyClass : MyNewClass(6,8) {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            //How to print statements in Kotlin
            println("Hello World!")
            println("How r u!")
            println()

            val adKotlin = LambdaConcept();
            //How to create Objects of class in Kotlin
            //i have added primary constructor example here
            println("Here we go with constructor concept")
            val obj = MyClass()

            //How to work with functions in kotlin
            println("\nMethods in Kotlin")
            println("How to work with functions is kotlin:")
            println(add(7, 9))
            println(add(8, 9, 1))

            println("\nVariables in Kotlin")
            obj.variablesFunction()
            //How to call non-static methods in kotlin
            println("\nNon-static members in Kotlin:")
            println("\nConditional statements")
            obj.checkAge(89)
            obj.checkAge(39)
            obj.checkAge(16)


            println("\nHow to work with Loops")
            obj.iterateStatment(4)

            println("\nHow to work with pair triple and dataclasses in kotlin:")
            obj.pairTriple()

            println("Practice of enum concept:")
            MonthInYear();
            daysInWeek();

            println("Practice of lambda concept: ")
            println("Sum of numbers is : " + adKotlin.addNum(2,6))
            println("Sum of lambda functions is : " + adKotlin.addFunc(2,3))

            val classResult : Array<Float> = arrayOf(3.18F,3.44F,3.10F,3.05F,2.44F,3.23F,3.84F,3.65F,3.10F)
            val studentName : Array<String> = arrayOf("Fiaz" ,"Hamza","Shahzaib","Ahmad","Muneeb","Saad"
                ,"Abdullah","Abdulrehman","Husnain")
            adKotlin.StudentsGPa(classResult,studentName);

            //Delegation Concept
            println("Delegation Concept is below : ")
            val delegationConcept = DelegationConcept();

        }
        private fun MonthInYear(){
            println("NAMES OF Months:")
            println(" ${MyEnums.JAN} \n" +
                    " ${MyEnums.FEB} \n " +
                    " ${MyEnums.MARCH} \n" +
                    " ${MyEnums.APRIL} \n" +
                    " ${MyEnums.MAY} \n" +
                    " ${MyEnums.JUN} \n" +
                    " ${MyEnums.JULY} \n" +
                    " ${MyEnums.AUG} \n" +
                    " ${MyEnums.SEPT} \n" +
                    " ${MyEnums.OCT} \n" +
                    " ${MyEnums.NOV} \n" +
                    " ${MyEnums.DEC}  \n" )
        }
        private fun daysInWeek(){
            println("NAMES OF WEEK:")
            println(" ${MyEnums.SUNDAY} \n" +
                    " ${MyEnums.MONDAY} \n " +
                    " ${MyEnums.TUESDAY} \n" +
                    " ${MyEnums.WEDNESDAY} \n" +
                    " ${MyEnums.THURSDAY} \n" +
                    " ${MyEnums.FRIDAY} \n" +
                    " ${MyEnums.SATUREDAY} \n"
            )
        }
        //how to create methods in Kotlin
        private fun add(a: Int, b: Int): Int {
            return a + b
        }

        //At this point we are using our Method overloading concept in Kotlin
        private fun add(a: Int, b: Int, c: Int): Int {
            return a + b + c
        }
    }
//    Conditional statements:
    private fun checkAge(age: Int) {

        if (age < 18) {
            println("You are not adult: $age ")
        } else if (age >= 18 && age < 40) {
            println("You are a young man: $age");
        } else {
            println("You are old man $age")
        }
    }



}
