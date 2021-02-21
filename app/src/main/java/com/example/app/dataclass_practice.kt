package com.example.app

data class  Ticket(val companyName :String, val name :String, var date : String, var seatNumber : Int)
// 데이터 클래스를 사용하면 toString(), hashCode(), equals() ,copy() 가 자동으로 생성됨

class TicketNormal(val companyName :String, val name :String, var date : String, var seatNumber : Int)

fun main(){
    val ticketA = Ticket("koreanAir","dongjun","2020-02-16",14)
    val ticketB = TicketNormal("koreanAir","dongjun","2020-02-16",14)

    println(ticketA)
    println(ticketB)
}