package edu.nextstep.camp.calculator.domain

interface Operate {

    fun plus(number: Number): Number
    fun minus(number: Number): Number
    fun multiply(number: Number): Number
    fun divide(number: Number): Number
}