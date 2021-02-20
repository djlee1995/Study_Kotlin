package com.example.app

open class Human(val name :String ="Anny"){
    constructor(name :String, age :Int): this(name){
    println("My name is ${name}, ${age}years old")
    }
    init {
        println("New human has been born!!")
    }
    fun eatingCake(){
        println("This is so YUMMMMYYY~~~~")
    }
   open fun singASong(){
        println("lalala")
    }
}
//상속
class Korean : Human(){
    override fun singASong(){
        super.singASong()
        println("라라랄")
        println("my name is :${name}")
    }
}

fun main(){
   /* val human = Human("dongjun")
    val stranger = Human()
    human.eatingCake()
    println("this human`s name is ${stranger.name}")*/
   // val mom = Human("Minhee",55)
    val korean=Korean()
    korean.singASong()
}