package com

import java.util.regex.Matcher
import java.util.regex.Pattern

class RegexRunner {

    static void main(String[] args) {
        String value = "one 1 two 22 three 333"
//        String regex = "(\\w+) (\\d+)"
        String regex = /(\w+) (\d)/


/**Regex in Java*/
//        Pattern pattern = Pattern.compile(regex)
//        Matcher matcher = pattern.matcher(value)

//        def boolResult = matcher.matches()

//        while (matcher.find()) {
//            println matcher.group()
//            println matcher.group(1)
//            println matcher.group(2)
//            println "----------"
//        }

/**Regex in groovy*/
        Pattern pattern1 = ~ regex
        Matcher matcher1 = value =~regex
//        def boolResult = value ==~regex
//
//
//            println matcher1[0]
//            println matcher1[1][2]
//            println matcher1[2]
//            println "----------"
//
//        println matcher1[1..2]

        matcher1.each ((group, group1, group2)-> {
            println group
            println group1
            println group2
        })
    }
}
