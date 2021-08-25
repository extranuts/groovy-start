package com.category

import com.oop.Student

@Category(Student.class)
class DefaultStudentMethods {

    def testStr() {
        println "$age, $firstname"
    }

    static def anotherMethod(Student self, String value){
        println "$self, args $value "
    }

}
