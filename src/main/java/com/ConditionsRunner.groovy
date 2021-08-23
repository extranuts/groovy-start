package com

class ConditionsRunner {

    /**
     * boolean         - is true
     * Collection/ Map - is not empty
     * Matchers        - has match
     * String/Gstring  - is not empty
     * Number/Char     - !=0
     * reference
     *
     *
     *
     * */

    static void main(String[] args) {
        int x = 0
//        def boolResult = x >10
        if (x) {
            println x
        }

        def person = new Person(19)
        if (person) {
            println person.getId()
        }

//        if(person != null){
//            person.getId()
//        }
//        NOT NULL ?
//        person?.getId()


//        def result = x ? x : 1
        def result = x ?: 1
        println result
    }
}
