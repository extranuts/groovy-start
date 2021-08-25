package com.lessondsl

class DSLBuilder {


    static MailSpecification mail(@DelegatesTo(MailSpecification)Closure closure){
        def mailSpecification = new MailSpecification()
//        closure.delegate = mailSpecification
//        closure.resolveStrategy = Closure.DELEGATE_ONLY
//        closure()
        mailSpecification.with closure
        mailSpecification
    }
}
