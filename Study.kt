import java.util.Arrays

fun main(){

val names = listOf( "FAKER" , "GUMAYUSI", "MATA", "DEFT" )
val numbers = intArrayOf(1,2,3,3,4,5)

for (name in names) {
    println(name)
}
for (number in numbers){
    println(number)
}


val cars = charArrayOf( 'a','b','c','d')
for(carIndex in cars.indices){

 println("$carIndex - ${cars[carIndex]}")
}

val arr = intArrayOf(1,2,3,4,5)

println("arr : ${Arrays.toString(arr)}")
println("size : ${arr.size}")
println("sum(): ${arr.sum()}")

var name = listOf(
"July",
"mira",
"jame",
"popo"
)
name.forEach{println(it)}


/*
Go(::b)
val c: (String)->Unit = { str -> println("$str 람다함수")}

//앞 String형식이 있을 경우 뒷 str:String이 생략 가능
}
fun b(str: String){
    println("$str 함수b")
}
//고차함수
fun Go(function: (String)->Unit){
    function("b가 호출됨")
} */
/*
fun study2() {
    var study2(a:Int,b:Int) = a + b
    
    
} */ 
println(study(2, 5))
}

fun study(a:Int, b:Int):Int{
   
   println(a + b) 
   // 한 번 사용되고 초기화
   
    //  return a + b

 return 0
}
