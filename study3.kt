fun main(){
    var jk = Person1("전정국",1997)
    var by = Person1("박보영",1990)

    var game = Person1("유재석")
    var games = Person1("강호동")
    //init 패러미터나 반환형이 없는 함수 
}
// 오픈은 상속을 받기 위해 사용함 
Open class Person1 (var name:String, var birthYear:Int){
    init{
        println("${this.name}년생 ${this.birthYear}님이 생성되었습니다.")
    }

    constructor(name:String) : this(name, 1997){
    println("보조 생성자가 생성되었습니다") 
    println("오늘도 빡공하자.")
}



}
