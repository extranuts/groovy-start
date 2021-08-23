package com

class IteratorsRunner {

    static void main(String[] args) {
        assert [1, 4, 7, 9].any { it % 2 == 0 }
        assert [1, 4, 7, 9].find { it % 2 == 0 } == 4
        assert [1, 4, 7, 9].findAll { it % 2 != 0 } == [1, 7, 9]
        assert (2..4).collect() == [2, 3, 4]

        def person = new Person(25)
        person.each { println it }

        assert ["aaa", "bbb", "12", "567", "2345df"].grep(~/\d+/) == ["12", "567"]  //isCase
        assert ["aaa", "bbb", "12", "567", "2345df"].grep { it.length() > 4 } == ["2345df"]  //isCase

    }
}
