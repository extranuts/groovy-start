package com.category

import com.oop.Student

class CategoryRun {

    static void main(String[] args) {
        def student = new Student(age: 18, firstName: "Ivan")
        use(DefaultStudentMethods.class) {
            student.testStr()
        }

//        student.testStr()
        student.anotherMethod("test arg")

    }
}
