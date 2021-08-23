package com

import groovy.io.FileType

import java.util.function.ToDoubleBiFunction

class IORunner {
    static void main(String[] args) {
        def file = new File(".gitignore")
        println file.text

        file.each {
            line -> println line
        }
        file.withInputStream {
            def allText = new String(it.readAllBytes())
            println allText
        }
        def writer = new StringWriter()
        try(def reader = file.newReader()){
            writer << reader
        }

        //write\

        def file2 = new File("text.txt")
        file2.text = "Some text"
        file2 << "New line" << System.lineSeparator()
//        file2.withOutputStream {}

        def srcDir = new File("src")
//        srcDir.eachDirRecurse {println it}

        srcDir.eachFile(FileType.FILES){println it}

    }
}
