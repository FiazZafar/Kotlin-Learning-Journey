package com.sahiwal.mykotlinpract

import com.sahiwal.mykotlinpract.DelegationConcept.Task as Task1

class DelegationConcept(){

    // A delegation means the process of reducing the redundant code while working
    // with interfaces and classes. it can be done with the help of By keyWord.

    companion object{
        @JvmStatic
        public fun main(args:Array<String>){

            val obj = WhenDelegationClass(ClassB(),ClassA())
            obj.createTask()
            obj.executeTask()
            val obj1 = WhenNotDelgation(ClassB(),ClassA())
           obj1.executeTask()
            obj1.createTask()
        }
    }
    interface Task{
        fun createTask()
    }
    interface Executor{
        fun executeTask()
    }
    class ClassA() : Executor{
        override fun executeTask() {
            println("Task is excuted successfully.")
        }

    }
    class ClassB() : Task1 {
        override fun createTask() {
            println("Task is created successfully.")
        }
    }
    open class WhenDelegationClass(var oncreate: ClassB, var executor: ClassA) : Executor by executor,
        Task1 by oncreate
    open class WhenNotDelgation(var oncreate: ClassB, var executor: ClassA) : Executor, Task1 {
        override fun executeTask() {
            oncreate.createTask();
        }

        override fun createTask() {
            executor.executeTask()
        }

    }

}