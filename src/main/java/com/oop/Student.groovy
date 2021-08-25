package com.oop

import groovy.transform.Canonical
import groovy.transform.EqualsAndHashCode
import groovy.transform.Immutable
import groovy.transform.ToString
import groovy.transform.TupleConstructor
import groovy.transform.builder.Builder
import groovy.util.logging.Slf4j


@ToString
@TupleConstructor
@EqualsAndHashCode
//@Canonical
@Immutable
@Builder
//@Slf4j
//@Mixin
class Student implements WithId {
    String firstName
    String lastName
    Integer age

    def getAt(Integer index) {
        index == 0 ? firstName: lastName
    }

    static void main(String[] args) {
//        Student.builder()
//        .lastName("Ivanov")
//        .firstName("Ivan")
//        .age(18)
//        .build()
    }

    def methodMissing(String name, Object arguments){
        println "missing method $name is invoked: $arguments"
        def field = name - 'findBy'
        def fieldValue = this."$field"
        println "select * from Student whera $field = $fieldValue"

    }
    def propertyMissing(String name) {
        println "miss props $name"
        "default value"
    }
}
