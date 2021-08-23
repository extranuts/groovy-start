package com

import java.util.function.Function
import java.util.stream.Stream

class ClosureRunner {

    static void main(String[] args) {

//        Function<Integer, Integer> func = value -> value+value
//        def result = func.apply(5)
       // println(result)

        Closure closure = { it = 66
            println it
            it + it
        }

        def result = closure.call()
        println result


        Stream.of(1, 2, 3, 4)
                .map(closure)
//                .map(String::valueOf)
                .map(String.&valueOf)
                .forEach(System.out::println)

        int x = 10
        check(x>0, {println x})
    }
    static def check(boolean condition, Closure closure){
        if(condition) {
            closure()
        }
    }
}
