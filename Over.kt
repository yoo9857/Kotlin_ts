fun main(){
 var t = Tiger() //변수 t는 타이거를 호출 
 t.eat()
 var d = Dog()
 d.run()
 d.eat()     
}

open class Animal { //타이거 함수 안에 애니멀
    open fun eat(){ // 오픈을 붙여 다른 곳에서 변경할 수 있도록 해줌.

        println("음식을 먹습니다")

    }
}
interface Runner {
    fun run()
}
interface Enter {
    fun eat() {
        println( " 음식을 먹습니다아아")
    }
}
//두 개의 인터페이스를 상속 받는 방법. 러너와 엔터를 상송 받음 
class Dog : Runner, Enter{

override fun run(){
    println("우다다다다")
}
override fun eat(){
    println("우다다다다")
}
}

class Tiger : Animal() 
{//타이거 함수 
    override fun eat(){
        println("고기를 먹습니다.")
    }
}
