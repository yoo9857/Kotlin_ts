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
}