package com

class ListsRunner {
    static void main(String[] args) {
        def list = [1, 3, 5, 8]
        assert list.getClass() == ArrayList

        // read
        assert list[2] == 5
        assert list.get(2) == 5
        assert list[-1] == 8 // list.get(list.size() -1)
        assert list[1..3] == [3, 5, 8]
        assert list[8] == null // not exception-  list?[8]


        //write
        list += 9
        list << 11 << 14 << 7 << 7
        assert list == [1, 3, 5, 8, 9, 11, 14, 7, 7]
        list -= 7
        assert list == [1, 3, 5, 8, 9, 11, 14]
        list -= [1, 3]
        assert list == [5, 8, 9, 11, 14]
        list *= 3
        assert list == [5, 8, 9, 11, 14, 5, 8, 9, 11, 14, 5, 8, 9, 11, 14]

        //method from queue
        list.push(999)
        assert list.pop() == 999
        assert list.head() == 5
        assert list.tail() == [8, 9, 11, 14, 5, 8, 9, 11, 14, 5, 8, 9, 11, 14]
        assert list.last() == 14

        //flatten, reverse, intersect, disjoint
        assert [1, 2, [4, 6, 7], 9].flatten() == [1, 2, 4, 6, 7, 9]
        assert [1, 2, 3].reverse() == [3, 2, 1]
        assert [1, 2, 3].intersect([2, 3, 7]) == [2, 3]
        assert [1, 2, 3].disjoint([5, 6, 7])

        //new operators
        def (a, b, c) = [3, 5, 7, 9, 10]
        assert a == 3
        assert b == 5
        assert c == 7

        func(*[8,10])
    }

    static def func(def a, def  b){
        println a
        println b
    }
}
