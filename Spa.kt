
//Q 1 . 사용자에게 정수를 입력받아, 홀짝 구분하기  예) 입력: 10, 출력: 짝수입니다.  (단, 0, null은 예외처리)
fun main() {
    println("값을 입력해주세요:")
    var player = readLine()?.toIntOrNull()

    if (player != null) {
        if (player % 2 == 0) {
            println("짝수입니다.")
        } else {
            println("홀수입니다.")
        }
    } else {
        println("올바른 값을 입력하세요.")
    }
}


//Q 2 . 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

fun main() {
    val input = readLine()!!.split(" ")
    //리드 라인으로 입력을 받고, split(" ")를 사용하여 문자열에 공백을 추가해 나눕니다. 결과는 List<String> 형태입니다.
    var output = input[0].toInt() + input[1].toInt()
    // 저장소 ouput을 선언하고, Int형으로 형변환하여 첫 번째와 두 번째 값을 정수로 변환하여 더합니다.
    println(output)
}
