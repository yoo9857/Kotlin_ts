
fun main(){
    val proGamers= mutableListOf(//listOf는 오직 읽기만 가능
        "MATA" , "FAKER" , "GUMAYUSI" // 주의 변수를 다양한 데이터 타입으로 하지 말 것 string, int등 결합X
    )
    println(proGamers.get(0))
    println(proGamers.size)
    println(proGamers.first())
    println(proGamers.indexOf("FAKER"))
    println(proGamers.contains("shushu")) // 요소 안에 값을 찾음.
    println(proGamers)
    proGamers.remove("MATA")
    println(proGamers)
    proGamers.add("ALEX")

    val a = proGamers[0]
    
    var names = arrayOf(
        "HANBINs", "Hans"
    )// 2개를 입력하면 2개를 생성하고, 3개 이상은 읽을 수 없음*에러 발생*
    println(names[0])// 
    names[1] = "Bins" // 변경 방법
    println(names.contentToString())
    println("안녕하세요")
    println(names.size) // 배열 사이즈 2개가 입력되었기 때문에 2 출력


val arrayOfNulls = arrayOfNulls<String>(5) // 5개 Null을 만듬
   
    arrayOfNulls.fill("*") //null을 *로 채움 

    arrayOfNulls[4] = " hello " 
    println(arrayOfNulls.contentToString()) 
    
    
}    
