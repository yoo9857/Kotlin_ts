fun main(){
var nums:String = readLine()!!

println("다했다 $nums")

}

class Character { //설계도 이름
    var name:String ="" //변수 
    var hairColor:String =""
    var height:Double = 0.0

    fun fireBall(){
        println( " 파이어볼" )
    }

}
fun compositing(device1:String, device2:String): String{
    var device3 = device1 + device2 
    println( " 새로운 무기인 $device3 입니다.")
    return device3
}
