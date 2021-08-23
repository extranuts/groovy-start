package com

class SwitchRunner {
    static void main(String[] args) {
        int x = 12
        // In Java switch use byte, short, int, char, String, enum
        // In Groovy switch  add more data
        switch (x) {
            case String: // isInstance
                println 0
                break
            case 5:     // equals ==  ===
                println 1
                break
            case ~/\d+/: // pattern.matcher(12.toString()).matches()
                println 2
                break
            case { it % 5 == 0 }:   //Closure
                println 3
                break
            case [1, 3, 5, 9]:    // Collection
                println 4
                break
            default:
                println "None"
                break
        }
    }
}
