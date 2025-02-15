package com.sahiwal.mykotlinpract

import android.icu.text.DecimalFormat

class MyClass : MyNewClass(6,8) {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {



            //How to print statements in Kotlin
            println("Hello World!")
            println("How r u!")
            println()

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
