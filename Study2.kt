class Person (var name:String, val birthyear:Int)
fun introduce(){

}
fun main (){
    var jk = Person("전정국",1997)
    var by = Person("박보영",1990)
    println("안녕하세요, ${jk.birthyear} 년생 ${jk.name} 입니다")
    println("안녕하세요, ${by.birthyear} 년생 ${by.name} 입니다")

        

    loop@for(i in 0..9){ // step 스텝만큼 점프
        for(j in 1..10){
            if(i == 1 && j == 2) break@loop
            println(" i = $i , j : $j")
        }

    }
    



    //for(i in 9 downTo 0) // 감소 9부터 0까지 step도 사용가능
    



// if 참 거짓
// when 하나의 변수를 여러개 가능
//any 최상형 자료형
//값
today24(1)
today24(13L)
//증감 연산자
var a = 0
//do 조건 사용없이 한 번 사용 하고 넘어감

while( a< 5){

    println(a++)
}
}
fun today24 (a:Any){
// 메인의 today24의 함수를 끌어와 비교함. 
    when(a){
        1 -> println("정수 1 입니다")
        is Long -> println("Long타입입니다")
        else -> println("어떠한 조건값도 아닐때 사용됨")
        //부등호 , 등호 사용 불가능 
    /* 변수로 받아서 사용할 수 있음.
    var 변수 = when(a){
        1 -> println("정수 1 입니다")
        is Long -> println("Long타입입니다")
        else -> println("어떠한 조건값도 아닐때 사용됨")
        println(변수이름)        
     */
    }
 
    //조건형 반복문





}
