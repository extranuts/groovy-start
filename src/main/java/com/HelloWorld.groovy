package com

import groovy.transform.PackageScope

import java.sql.DriverManager

//@PackageScope
class HelloWorld {
//    @PackageScope
    static void main(String[] args) {

        String value = "Hello world"
        Class<String> clazz = value.getClass()
        assert clazz == String.class
        println "Hello world"
        println clazz.getClassLoader()
        println DriverManager.class.getClassLoader()
        println HelloWorld.class.getClassLoader()

    }
}
