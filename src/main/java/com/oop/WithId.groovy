package com.oop

trait WithId {
    Integer id

    boolean validateId() {
        id > 0
    }


}