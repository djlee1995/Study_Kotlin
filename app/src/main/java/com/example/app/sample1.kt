package com.example.app

fun main(){/*
    helloWorld()
    println(add(5,6))
    //3. String Template
    val name ="dongjun"
    val lastname="Lee"
    println("My name is ${name + lastname} I'm 24")
    println("this is 2\$입니다")*/

    checkNum(1)
}
//1. 함수
fun helloWorld(){ //return 형식이 없으면 써주는
 println("Hello World!")
}
fun add(a : Int, b : Int) : Int {
    return a+b
}
//2. val vs vat
//val = value
fun hi(){
    val a :Int = 10 //값을 바꿀수 없음
    var b :Int = 9
    b=100
//자동추론 이기때문에 타입을 입력할 필요 없음 대신 선언할때는 타입을 입력해야함
    val c =100
    var d =100
    var name = "dongjun"
}
//4. 조건식
fun maxBy(a: Int, b: Int): Int {
    if(a>b){
        return a
    }else{
        return b
    }
}
//이걸 더 많이 사용함
fun maxBy2(a: Int,b: Int)=if(a>b) a else b
fun checkNum(score: Int){
    when(score){
        0 -> println("this is 0")
        1 -> println("this is 1")
        2,3 -> println("this is 2 or 3")
        //else -> println("I don't know")
    }
    var b = when(score){
        1 -> 1
        2 -> 2
        else -> 3
    }
    println("b : ${b}")
    when(score){
        in 90..100 -> println("Good")
        in 10..80 -> println("Not Bad")
        else -> println("Okay")
    }
}
//Expression(표현식) vs Statement
//무언가를 해서 값을 반환하면 Expression
//명령을 지시하는 문장 같은 경우는 Statement
//코틀린의 모든 함수는 Expression
//5. Array and List
//Array
//List 1.List(수정X) 2.MutableList(수정O,ex)arrayList)
fun  array(){
    val array = arrayOf(1,2,3)
    val list = listOf(1,2,3)

    val array2 = arrayOf(1,"a",3.4f)
    val list2 = listOf(1,"a",11L)

    array[0] = 3
    var result = list.get(0)

    val arraylist = arrayListOf<Int>()
    arraylist.add(10)
    arraylist.add(120)
    arraylist[0] = 20

}