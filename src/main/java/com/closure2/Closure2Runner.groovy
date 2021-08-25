package com.closure2

import com.oop.Student

class Closure2Runner {
    static void main(String[] args) {
        Closure closure = {
//            this
            firstName = "Sveta"
        }

        println closure.thisObject //static main
        println closure.owner   //static main
        println closure.delegate  // use in DSL


        def student = new Student("Ivan", "Ivanov", 29)
        println student

//        closure.delegate = student
//        closure.resolveStrategy = Closure.DELEGATE_FIRST
//        closure()

        student.with closure

        println student

        student.getInfo()()

    }
}
