package com

class LoopsRunner {

    static void main(String[] args) {
        // while, for
        def list = [1, 2, 3, 4]
//        for (int i = 0; i < list.size(); i++) {
//
//        }
//        for (i in 0..list.size()) {   //range
//            println i
//        }
//        for (Integer value : list) {
//            println value
//        }
//        for(value in list) {
//            println value
//        }
//        0.upto(list.size()){
//            println it
//        }
//        list.size().downto(0){
//            println it
//        }
//        list.size().times {
//            println it
//        }
        0.step(5, 2) {
            println it
        }
    }
}